package cn.sh.ideal.valueaddedserver.callshow.controller;

import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshow;
import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshowLog;
import cn.sh.ideal.valueaddedserver.callshow.service.CallshowService;
import cn.sh.ideal.valueaddedserver.callshow.service.UserInfoBoundService;
import cn.sh.ideal.valueaddedserver.common.constantUtils.Constants;
import cn.sh.ideal.valueaddedserver.common.messageUtils.ReturnMessage;
import cn.sh.ideal.valueaddedserver.common.util.QueryPackageUseUtil;
import cn.sh.ideal.valueaddedserver.common.util.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/callshow")
@Slf4j
public class CallShowController {
    private static String prefix = "callshow";
    @Value("${url.CURR_PRO_URL}") // 本系统地址
    private String CURR_PRO_URL;
    @Value("${url.WX_PRO_URL}") // 微信客服地址
    private String WX_PRO_URL;
    @Value("${url.BOUND_URL}") // 绑定微信页面地址
    private String BOUND_URL;

    @Autowired
    private UserInfoBoundService userInfoBoundService;
    @Autowired
    private CallshowService callshowService;

    /**
     * 跳转到来电显示开通首页
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        Map<String, String> map = new HashMap<>();
        //1受理业务号和关联设备号登记人和身份证统一
        //2未实名制拦截
        //3欠费用户
        //4黑名单用户
        //5在途订单拦截
        String openid = null;
        try {
            openid = request.getParameter("openid");// 微信号

            if (StringUtil.isEmpty(openid)) {
                openid = String.valueOf(request.getSession().getAttribute("openid"));
            }

            if (StringUtil.isEmpty(openid)) {
                log.error("微信号丢失，提示异常");
                response.sendRedirect(WX_PRO_URL + "wxUrlService?back_url=" + CURR_PRO_URL
                        + "callshow/index.do&channel=WX&scope=snsapi_base");
                return null;
            }

            map = userInfoBoundService.queryIsBound(openid);
            if (map == null) {
                callshowService.insertCallshowLog(new PCallshowLog("cn.sh.ideal.valueaddedserver.controller.CallShowController.index", "用户进入来电显示页面，跳转首页失败，绑定信息查询为空", "失败"));
                // 未绑定用户去绑定页面
                log.info("用户的微信为：openId:" + openid);
                response.sendRedirect(BOUND_URL + QueryPackageUseUtil.addPassEncode(openid));
                return null;
            } else {
                callshowService.insertCallshowLog(new PCallshowLog(map, "cn.sh.ideal.valueaddedserver.controller.CallShowController.index", "用户进入来电显示页面，跳转首页成功", "成功"));
                String phone = map.get("TELEPHONE") == null ? "" : map.get("TELEPHONE").toString();// 设备号
                String userId = map.get("WECHAT_ID") == null ? "" : map.get("WECHAT_ID").toString();// 微信号
                model.setViewName("/" + prefix + "/index");
                //获取用户客户标识
                Map<String, Object> custMap = callshowService.toQueryAcctnbrBySerialnbr(phone, userId);

                String custId = String.valueOf(custMap.get("custNumber")); // 客户号
                request.getSession().setAttribute("custId", custId);
                request.getSession().setAttribute("userId", userId);
                request.getSession().setAttribute("openid", openid);
                model.addObject("openid",openid);

                //查询用户是否有在途订单
                boolean isTheWay = callshowService.customerOrderList(userId, custId);
                if (!isTheWay) {
                    model.addObject("message", "尊敬的客户，您的设备仍有业务在办理中，暂时无法办理该业务，详询“在线客服”。");
                    model.setViewName("/" + prefix + "/tishi");
                    return model;
                }
                //判断用户类型，是否为政企，个人，查询身份证信息
                Map<String, Object> custInfoMap = callshowService.toQueryCustInfoByCustNum(custId, request);
                if (custInfoMap == null || custInfoMap.isEmpty()) {
                    log.error(":根据客户号查询用户信息查询为空");
                    model.addObject("message", "根据客户号查询用户信息查询为空,请重试");
                    model.setViewName("/" + prefix + "/tishi");
                    return model;
                }
                String certNum = String.valueOf(custInfoMap.get("certNum"));
                //身份证
                String custName = String.valueOf(custInfoMap.get("custName"));
                //客户名
                String custType = String.valueOf(custInfoMap.get("custType"));
                //证件类型
                if (custType.indexOf("1000") < -1) {
                    //不为政企用户时
                    model.addObject("message", "尊敬的客户,该业务仅限公众客户用户办理，您可通过您的专属客户经理或咨询“在线客服”获取服务。");
                    model.setViewName("/" + prefix + "/tishi");
                    return model;
                }
                //3.查询用户是否为黑名单用户
                boolean isBlacklist = callshowService.QueryOWEByAccountName(custName, certNum, custId, userId, request);
                if (!isBlacklist) {
                    model.addObject("message", "尊敬的客户，您暂时无法办理该业务，详询“在线客服”。");
                    model.setViewName("/" + prefix + "/tishi");
                    return model;
                }
                //4.查询是否实名
                String isRealName = callshowService.queryCheckRealName(custId, phone, userId);
                if (isRealName == null || "".equals(isRealName)) {
                    model.addObject("message", "尊敬的客户，您未进行实名制认证，请先前往线下营业厅，办理实名制登记再办理该业务。");
                    model.setViewName("/" + prefix + "/tishi");
                    return model;
                }
                //根据客户标识获取用户设备清单，筛选出固话和手机清单
                Map<String, Object> phoneList = callshowService.ServiceIdListByAccountPhoneInfo(custId, phone, userId);

                model.addObject("maplist", phoneList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            callshowService.insertCallshowLog(new PCallshowLog(map, "cn.sh.ideal.valueaddedserver.controller.CallShowController.index", "用户进入来电显示页面，跳转首页失败" + e.getMessage(), "失败"));
        }
        return model;
    }

    /**
     * 跳转到设备对应的办理关闭页面
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("shwohandle")
    public ModelAndView shwohandle(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        String custId = String.valueOf(request.getSession().getAttribute("custId"));
        String userId = String.valueOf(request.getSession().getAttribute("userId"));
        String deviceNo = request.getParameter("deviceNo");
        //1.判断设备号是固话还是手机

        if (StringUtil.isEmpty(custId) || StringUtil.isEmpty(userId)) {
            model.addObject("message", "操作超时，重新进入本功能");
            model.setViewName("/" + prefix + "/tishi");
            return model;
        }
        Map<String, String> map = new HashMap<>();
        //判断是否办理过来电显示
        boolean isSal = callshowService.assetInfoByServiceIdSal(map, userId, deviceNo, custId);
        model.addObject("deviceNo", deviceNo);
        if (deviceNo.length() == 11) {
            String  deviceNoTomi= deviceNo.substring(0, 3) + "****" + deviceNo.substring(7, deviceNo.length());
            model.addObject("deviceNoTomi", deviceNoTomi);
            //用户设备为手机设备
            if (isSal) {
                //已开通来电显示
                model.setViewName("/" + prefix + "/closesphone");
            } else {
                //未开通来电显示
                model.setViewName("/" + prefix + "/openphone");
            }
        } else {
            //用户设备为固话设备
            String  deviceNoTomi= deviceNo.substring(0, 2) + "****" + deviceNo.substring(5, deviceNo.length());
            model.addObject("deviceNoTomi", deviceNoTomi);
            if (isSal) {
                //已开通来电显示
                model.setViewName("/" + prefix + "/closesfixed");
            } else {
                //未开通来电显示
                model.setViewName("/" + prefix + "/openfixed");
            }
        }
        //跳转到相对应页面
        return model;
    }

    /**
     * 跳转办理成功页面
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("shwoSeccess")
    public ModelAndView shwoSeccess(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        String openid = String.valueOf(request.getSession().getAttribute("openid"));
        model.addObject("openid", openid);
        model.setViewName("/" + prefix + "/success");
        //跳转到相对应页面
        return model;
    }

    /**
     * 跳转到设备对应的业务办理方法
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("callShowBusiness")
    public ReturnMessage callShowBusiness(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
        String custId = String.valueOf(request.getSession().getAttribute("custId"));
        String userId = String.valueOf(request.getSession().getAttribute("userId"));
        String deviceNo = request.getParameter("deviceNo");
        String userName = request.getParameter("userName");
        String userNumber = request.getParameter("userNumber");
        String type = request.getParameter("type");
        //1为开通来电显示  2为关闭来电显示

        //1.判断session是否过期
        if (StringUtil.isEmpty(custId) || StringUtil.isEmpty(userId)) {
            return new ReturnMessage(500, "操作超时，请重新登录进行操作");
        }

        //2.查询设备号是否有在途订单
        boolean isTheWay = callshowService.customerOrderList(userId, custId);
        if (!isTheWay) {
            return new ReturnMessage(500, "用户名下有在途订单，无法办理");
        }
        //判断是否办理过来电显示
        Map<String, String> proInfo = new HashMap<>();
        proInfo.put("prodId", Constants.CALL_PRODID);
        proInfo.put("prodName", Constants.CALL_PRODNAME);

        Map<String, Object> custInfoMap = callshowService.toQueryCustInfoByCustNum(custId, request);
        if (custInfoMap == null || custInfoMap.isEmpty()) {
            log.error(":根据客户号查询用户信息查询为空");
            return new ReturnMessage(500, "根据客户号查询用户为空");
        }

        if (!(userName.equals(String.valueOf(custInfoMap.get("custName"))) && userNumber.equals(String.valueOf(custInfoMap.get("certNum"))))) {
            log.error(":用户填写的身份证号码和姓名与接口返回内容不符");
            return new ReturnMessage(500, "身份证号码和姓名不符");
        }

        //查询是否办理过，如果办理过，查询prodInstId 进行关闭
        boolean isSal = callshowService.assetInfoByServiceIdSal(proInfo, userId, deviceNo, String.valueOf(custInfoMap.get("custId")));
        Map<String, Object> dataObject_opt = callshowService.mybusiness(proInfo, custId, userId, type, deviceNo);
        Map<String, Object> result = callshowService.functionalProductsCompletion(dataObject_opt, custId, userId, deviceNo);

        PCallshow callshow = new PCallshow();
        callshow.setOpenid(userId);
        callshow.setUsername(String.valueOf(custInfoMap.get("custName")));
        callshow.setUsernumber(String.valueOf(custInfoMap.get("custNumber")));
        callshow.setSerianumber(String.valueOf(dataObject_opt.get("extCustOrderId")));
        callshow.setCrmstatus("0");//信息已提交
        callshow.setDeviceno(deviceNo);
        callshow.setBustype(type.equals("1") ? "开通" : "关闭");
        int flag = callshowService.insertCallShowSelective(callshow);

        if (flag > 0) {
            callshowService.insertCallshowLog(new PCallshowLog(deviceNo,userId,userName, "cn.sh.ideal.valueaddedserver.controller.CallShowController.callShowBusiness", "订单办理成功", "成功"));
            return new ReturnMessage(200, "办理成功");
        }
        callshowService.insertCallshowLog(new PCallshowLog(deviceNo,userId,userName, "cn.sh.ideal.valueaddedserver.controller.CallShowController.callShowBusiness", "订单办理失败", "失败"));
        return new ReturnMessage(500, "办理失败，系统异常");
    }

    /**
     * 查询用户是否有办理资格
     *
     * @param request
     * @param response
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/query")
    @ResponseBody
    public ReturnMessage query(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        String deviceNo = request.getParameter("deviceNo");
        ReturnMessage returnMessage = null;

        String userId = (String) request.getSession().getAttribute("userId");
        String custId = (String) request.getSession().getAttribute("custId");
        //1.查询设备号是否欠费
        Map<String, Object> queryArreaMap = callshowService.queryArreaOwe(deviceNo);
        if (!queryArreaMap.get("code").equals("0000")) {
            return new ReturnMessage(500, "该设备号已欠费，无法办理");
        }
        //2.查询设备号是否有在途订单
        boolean isTheWay = callshowService.customerOrderList(userId, custId);
        if (!isTheWay) {
            return new ReturnMessage(500, "用户名下有在途订单，无法办理");
        }

        //5判断用户类型，是否为政企，个人，查询身份证信息
        Map<String, Object> custInfoMap = callshowService.toQueryCustInfoByCustNum(custId, request);
        if (custInfoMap == null || custInfoMap.isEmpty()) {
            log.error(":根据客户号查询用户信息查询为空");
            return null;
        }

        String certNum = String.valueOf(custInfoMap.get("certNum"));//身份证
        String custName = String.valueOf(custInfoMap.get("custName"));//客户名
        String custType = String.valueOf(custInfoMap.get("custType"));//证件类型

        if (custType.indexOf("1000") > -1) {//不为政企用户时
            return new ReturnMessage(500, "尊敬的客户,该业务仅限公众客户用户办理，您可通过您的专属客户经理或咨询“在线客服”获取服务。");
        }
        //3.查询用户是否为黑名单用户
        boolean isBlacklist = callshowService.QueryOWEByAccountName(custName, certNum, custId, userId, request);
        if (!isBlacklist) {
            return new ReturnMessage(500, "尊敬的客户，您暂时无法办理该业务，详询“在线客服");
        }
        //4.查询是否实名
        String isRealName = callshowService.queryCheckRealName(custId, deviceNo, userId);
        if (isRealName == null || "".equals(isRealName)) {
            return new ReturnMessage(500, "系统查询异常，请重新尝试");
        }

        if (!"0".equals(isRealName)) {
            return new ReturnMessage(500, "尊敬的客户，您未进行实名制认证，请先前往线下营业厅办理实名制登记在办理该业务");
        }
        return new ReturnMessage(200, "效验成功，跳转办理页面");
    }

    /**
     * 主套餐回调接口
     *
     * @param
     * @return
     */
    @RequestMapping("/callShowOptPackageCallback")
    @ResponseBody
    public String callShowOptPackageCallback(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> returnMap = new HashMap<String, Object>();

        //提交状态
        String submit_status = "";
        //返回结果
        String submit_reason = "";
        //返回编码
        String crm_order = "";
        try {
            String json = receivePost(request);
            if (StringUtils.isEmpty(json)) {
                returnMap.put("code", "0");
                returnMap.put("info", "请求参数json对象为空！");
                return returnMap.toString();
            }
            Map<String, Object> jsonMap = JSONObject.parseObject(json);
            //请求
            String requestState = String.valueOf(jsonMap.get("requestState"));
            String info = String.valueOf(jsonMap.get("info"));
            if ("1".equals(requestState)) {
                Map<String, Object> dataObjectMap = (Map<String, Object>) jsonMap.get("dataObject");
                //流水号
                String extCustOrderId = String.valueOf(dataObjectMap.get("extCustOrderId"));
                String soapResponseData = String.valueOf(dataObjectMap.get("soapResponseDataObject"));
                Map<String, Object> soapResponseDataMap = JSON.parseObject(soapResponseData);
                String errCode = String.valueOf(soapResponseDataMap.get("errCode"));
                String errMsg = String.valueOf(soapResponseDataMap.get("errMsg"));
                if ("null".equals(errCode) && "null".equals(errMsg)) {
                    submit_status = "1";
                    //成功
                    submit_reason = "成功";
                    crm_order = String.valueOf(soapResponseDataMap.get("custOrderNbr"));
                    // 修改手机套餐信息内容
                    PCallshow callshow = new PCallshow();
                    callshow.setCrmstatus(submit_status);
                    callshow.setCrmorderno(crm_order);
                    callshow.setCrmresp(submit_reason);
                    callshow.setSerianumber(extCustOrderId);
                    callshowService.updateCallShowOrder(callshow);
                } else {
                    PCallshow callshow = new PCallshow();
                    callshow.setCrmstatus("2");
                    callshow.setCrmorderno(crm_order);
                    callshow.setCrmresp(submit_reason);
                    callshow.setSerianumber(extCustOrderId);
                    callshowService.updateCallShowOrder(callshow);
                    submit_status = errCode;
                    submit_reason = errMsg;
                }
            } else {
                submit_status = requestState;
                //接口请求失败调
                submit_reason = info;
            }
            returnMap.put("code", "1");
            returnMap.put("info", "回调成功！");
            return returnMap.toString();
        } catch (Exception e) {
            returnMap.put("code", "0");
            returnMap.put("info", "回调失败！");
            return returnMap.toString();
        }

    }

    /**
     *
     * @param request
     * @return
     * @throws IOException
     * @throws UnsupportedEncodingException
     */
    private String receivePost(HttpServletRequest request) throws IOException, UnsupportedEncodingException {
        // 读取请求内容
        BufferedReader br = new BufferedReader(new InputStreamReader(
                request.getInputStream(), "UTF-8"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        log.info(String.valueOf("请求数据sb=" + sb));
        return String.valueOf(sb);
    }
}

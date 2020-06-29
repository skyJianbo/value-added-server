package cn.sh.ideal.valueaddedserver.callshow.service.impl;

import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshowLog;
import cn.sh.ideal.valueaddedserver.callshow.mapper.PCallshowLogMapper;
import cn.sh.ideal.valueaddedserver.common.constantUtils.Constants;
import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.service.InterfaceCommonServiceInt;
import cn.sh.ideal.valueaddedserver.common.util.DateUtil;
import cn.sh.ideal.valueaddedserver.common.util.StringUtil;
import cn.sh.ideal.valueaddedserver.common.util.http.HttpRequest;
import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshow;
import cn.sh.ideal.valueaddedserver.callshow.mapper.PCallshowMapper;
import cn.sh.ideal.valueaddedserver.callshow.service.CallshowService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class CallshowServiceImpl implements CallshowService {

    @Value("${url.QUERYARREAURL}") // 本系统地址
    private String QUERYARREAURL;

    @Autowired
    private PCallshowLogMapper callshowLogMapper;

    @Autowired
    private PCallshowMapper callshowMapper;

    @Autowired
    private InterfaceCommonServiceInt interfaceCommonServiceInt;

    @Autowired
    private HttpRequest httpRequest;

    @Override
    public int insertCallshowLog(PCallshowLog pCallshowLog) {
        log.info(pCallshowLog.toString());
        return callshowLogMapper.insertSelective(pCallshowLog);
    }

    @Override
    public Map<String, Object> toQueryAcctnbrBySerialnbr(String devNumber, String userId) throws Exception {

        // 关键性参数，必传字段
        if (StringUtil.isEmpty(userId)) {
            userId = "nullValue";
        }
        String deviceNum = devNumber;
        String orderCode = "WXKF" + DateUtil.getDateTimeStrNum(new Date()) + ((Math.random() * 9 + 1) * 100000);
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();

        // dataObject业务数据
        Map<String, Object> requestMap = new HashMap<String, Object>(1);
        requestMap.put("accNum", devNumber);// 设备号
        // 请求接口

        String result = interfaceCommonServiceInt.customerNbrEop_v1_0(userId,deviceNum, orderCode, requestClass,requestMethod, requestMap);
//        String result = "{\"custNumber\":\"202124587115\",\"newCrmFlag\":null}";
//		String result="nullValue";

        if (result == null || "".equals(result) || "nullValue".equals(result)) {
            throw new Exception("根据设备号查询客户号；Message is :接口返回" + result);
        }
        return JSON.parseObject(result);

    }

    @Override
    public boolean customerOrderList(String userId, String custId) {
        boolean flag = false;
        if (StringUtil.isEmpty(userId)) {
            userId = "nullValue";
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
        String orderCode = df.format(new Date()) + String.valueOf((int) ((Math.random() * 9 + 1) * 1000));

        Map<String, Object> dataObject = new HashMap<String, Object>();
        HashMap<String, Object> pageInfo = new HashMap<String, Object>();
        pageInfo.put("pageIndex", "1");
        pageInfo.put("pageSize", "5");
        dataObject.put("pageInfo", pageInfo);
        dataObject.put("custId", custId);
        dataObject.put("custOrderNbr", "nullValue");
        dataObject.put("pendingFlag", "10");
        String resjson = interfaceCommonServiceInt.customerOrderList_v1_0(userId, "nullValue", orderCode, requestClass, requestMethod, dataObject);
//        String resjson = "{\"customerOrders\":[],\"pageInfo\":{\"pageIndex\":1,\"pageSize\":5000,\"pageCount\":0,\"rowCount\":0},\"hisId\":null}";
        if (resjson == null || "".equals(resjson) || "nullValue".equals(resjson)) {
            log.error("根据客户号查询capAccount_v1_0接口；Message is :接口返回" + resjson);
            return true;
        }
        JSONObject jsonObject = JSONObject.parseObject(resjson);
        JSONArray jsonArray = jsonObject.getJSONArray("customerOrders");
        if (jsonArray.isEmpty() || jsonArray.size() < 1) {
            flag = true;
        }
        return flag;
    }

    @Override
    public Map<String, Object> toQueryCustInfoByCustNum(String custId, HttpServletRequest request) {
        //关键性参数，必传字段
        String openId = "nullValue";
        String deviceNum = "nullValue";
        //获取orderCode
        String orderCode = DateUtil.getDateTime("yyyyMMddHHmmss", new Date()) + String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();

        //dataObject业务数据
        Map<String, Object> requestMap = new HashMap<String, Object>(1);
        requestMap.put("custNumber", custId);

        //请求接口
        String resultJson = interfaceCommonServiceInt.capCustomer_v1_0(openId, deviceNum,orderCode, requestClass, requestMethod, requestMap);
//        String resultJson = "{\"custId\":\"221982392464\",\"custName\":\"陈根良\",\"custNumber\":\"202122647895\",\"custSubType\":\"普通住宅|999900001\",\"custType\":\"公众客户|1100\",\"custAddr\":\"许昌路570弄5号201室\",\"createDate\":1092409143000,\"enterDate\":769449600000,\"marketTypeCd\":null,\"groupCustId\":\"993100180003245018\",\"updateDate\":1566552001000,\"industry\":null,\"industrySubType\":null,\"industryType\":null,\"subIndustry\":null,\"goldenVip\":null,\"publicVipType\":null,\"shchAccountServiceLevel\":null,\"privateDataUse\":null,\"attrId\":\"高\",\"idNumUrl\":null,\"jtfq1\":null,\"jtfq2\":null,\"custTreeName\":null,\"custTreeId\":null,\"parentNodeId\":null,\"custTypeNodeName\":null,\"contactName\":\"陈根良\",\"eMail\":\"18918337168@189.cn\",\"fax\":null,\"mobilePhone\":\"+8618918337168\",\"postcode\":\"200082\",\"contactAddr\":\"许昌路570弄5号201室\",\"partyAbbrname\":null,\"education\":null,\"birthday\":\"1947-08-12 00:00:00\",\"nation\":\"汉族|10\",\"gender\":\"1\",\"maritalStatus\":null,\"nationality\":null,\"politicalStatus\":null,\"employer\":null,\"position\":null,\"certNum\":\"310110194708120438\",\"certCheckResult\":\"1003\",\"certType\":\"居民身份证|1\",\"checkTime\":1545580800000,\"orgScale\":null,\"custBuildDate\":null,\"hq_addr\":null,\"serviceLevel\":null,\"orgProperty\":null,\"bureauName\":\"东区\",\"creditLevel\":\"100300\",\"auditStatus\":null,\"generalTaxpayerFlag\":null,\"mobBlackFlg\":\"N\",\"arrBlackFlg\":\"N\",\"violateBlackFlg\":\"N\",\"householdEthnicity\":null,\"vipNo\":null,\"spcType\":null,\"qq\":null,\"statusCd\":\"1100\",\"arrearageBlackFlag\":\"N\",\"childCustomer\":[{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"18918337168\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"13301802807\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":null},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":null},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"18918337168\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"18917113537\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"+8618918337168\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"+86\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"+86\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":null},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"+86\"},{\"childName\":\"陈根良\",\"childSimpleName\":null,\"mobilePhone\":\"+86\"}],\"addrPostcode\":\"200082\",\"certAddr\":\"上海市杨浦区许昌路570弄5号201室\",\"contactId\":221982392464,\"labal5G\":\"5G客户\",\"membershipLevel\":\"6星\",\"zhengFlag\":null,\"specialExpDate\":null}";
        //返回报文非空、nullValue判断
        if (StringUtil.isEmpty(resultJson) || "nullValue".equals(resultJson)) {
            log.error("调用capCustomer_v1_0根据客户号查询客户信息，返回空报文。resultJson:" + resultJson);
            return null;
        }

        //new 线程安全的HashMap对象 用于存储返回报文解析结果
        Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
        try {
            resultMap = JSONObject.parseObject(resultJson, Map.class);
        } catch (Exception e) {
            log.error("调用capCustomer_v1_0根据客户号查询客户信息，json转map对象异常，异常信息：" + e.getMessage());
            return null;
        }
        return resultMap;
    }

    @Override
    public boolean QueryOWEByAccountName(String custName, String custNum, String custId, String userId, HttpServletRequest request) throws Exception {
        boolean idCardFlag = false;
        //关键性参数，必传字段
        String deviceNum = "nullValue";
        String crorderCode = DateUtil.getDateTime("yyyyMMddHHmmss", new Date()) + String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
        if (StringUtils.isNotEmpty(custName) || StringUtils.isNotEmpty(custNum)) {
            //身份证核检及黑名单查询
            //dataObject业务数据
            Map<String, Object> requestMap = new HashMap<String, Object>();
            requestMap.put("custName", custName); //客户名
            requestMap.put("certNum", custNum); //主要证件号码，身份证号码
            //请求接口
            String resXml_pro = interfaceCommonServiceInt.specialList_v1_0(userId, deviceNum, crorderCode, requestClass, requestMethod, requestMap);
//            String resXml_pro = "[{\"custNumber\":\"202122647895\",\"specialList\":[{\"subSpecialType\":\"N\"}],\"certCheckResult\":\"1003\"}]";
            if (resXml_pro == null || "".equals(resXml_pro) || "nullValue".equals(resXml_pro)) {
                throw new Exception("根据身份证_姓名查询欠费客户信息:Message is :接口返回" + resXml_pro);
            }
            List<Map<String, Object>> list1 = (List<Map<String, Object>>) JSONArray.parse(resXml_pro);
            for (Map<String, Object> map : list1) {
                String checkIdCard = String.valueOf(map.get("certCheckResult"));
                String specialList = String.valueOf(map.get("specialList"));
                List<Map<String, Object>> listMap = (List<Map<String, Object>>) JSONArray.parse(specialList);
                if (checkIdCard.indexOf("1000") != -1 || checkIdCard.indexOf("1001") != -1 || checkIdCard.indexOf("1002") != -1 || checkIdCard.indexOf("1003") != -1
                        || checkIdCard.indexOf("1004") != -1 || checkIdCard.indexOf("1005") != -1 || checkIdCard.indexOf("1006") != -1 || checkIdCard.indexOf("1007") != -1
                        || checkIdCard.indexOf("1008") != -1 || checkIdCard.indexOf("1009") != -1 || checkIdCard.indexOf("1010") != -1 || checkIdCard.indexOf("1011") != -1) {
                    if (listMap.size() == 0) {
                        idCardFlag = true;
                    } else {
                        for (Map<String, Object> map1 : listMap) {
                            String subSpecialType = String.valueOf(map1.get("subSpecialType"));
                            if ("N".equals(subSpecialType)) {
                                idCardFlag = true;
                            }
                        }
                    }
                }
            }
        } else {
            idCardFlag = false;
        }
        return idCardFlag;
    }

    @Override
    public Map<String, Object> ServiceIdListByAccountPhoneInfo(String custId, String phone, String openId) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        // 关键性参数，必传字段
        String deviceNum = phone;
        String orderCode = "WXKF" + DateUtil.getDateTimeStrNum(new Date()) + ((Math.random() * 9 + 1) * 100000);
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
        // dataObject业务数据
        Map<String, Object> requestMap = new HashMap<String, Object>();
        requestMap.put("custNumber", custId);
        // 日志记录参数
        Map<String, Object> mapLog = new HashMap<String, Object>();
        mapLog.put("requestDate", new Date());
        mapLog.put("serviceInfo", "nullValue");// 服务器信息
        mapLog.put("requestIp", "nullValue");// 请求人IP
        mapLog.put("requestClass", requestClass);// 当前类路径
        mapLog.put("requestMethod", "ServiceIdListByAccountNO");// 当前方法
        mapLog.put("methodDescribe", "查询设备清单");// 方法描述
        // 请求接口
        String result = "";
        // 调用接口返回的报文数据
        try {
            result = interfaceCommonServiceInt.serviceIdListByAccountNO_v1_0(openId, deviceNum, orderCode,requestClass, requestMethod, requestMap);
//            result = "{\"custNumber\":\"202122647895\",\"custName\":\"陈根良\",\"contactGender\":null,\"custType\":\"1100\",\"custAddr\":\"许昌路570弄5号201室\",\"offerInst\":[{\"offerId\":17467420172,\"offerName\":\"e云0元可选包\",\"offerInstId\":19921241039,\"offerProdInstRel\":[{\"offerProdInstId\":19921094970,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2011-12-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"11\",\"commodityType\":\"10\"},{\"offerId\":43949340591,\"offerName\":\"助残关爱年付880元套餐\",\"offerInstId\":78912521233,\"offerProdInstRel\":[{\"offerProdInstId\":20119139877,\"roleId\":\"10200001\"}],\"promConstExpDt\":\"2015-11-30 00:51:00.0\",\"effDate\":\"2014-12-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"140137029269\"},{\"subOfferInstId\":\"163615530263\"}],\"offerType\":\"11\",\"commodityType\":\"10\"},{\"offerId\":65605851817,\"offerName\":\"4G爱听定向流量包201407 0元-可选包\",\"offerInstId\":79291097066,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2015-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":65605851873,\"offerName\":\"4G爱玩定向流量包201407 0元-可选包\",\"offerInstId\":79291104062,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2015-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":73071660658,\"offerName\":\"2014年员工套餐VPN可选包\",\"offerInstId\":81286012530,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2015-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":42055560221,\"offerName\":\"2013年光电话同振顺呼包\",\"offerInstId\":89236872454,\"offerProdInstRel\":[{\"offerProdInstId\":222556108980,\"roleId\":\"10100001\"}],\"promConstExpDt\":\"2015-05-06 20:34:40.0\",\"effDate\":\"2015-05-06 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":68693949615,\"offerName\":\"2014彩铃功能体验包\",\"offerInstId\":90499280420,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2015-06-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":85932228601,\"offerName\":\"固话来显彩铃体验包\",\"offerInstId\":94122171192,\"offerProdInstRel\":[{\"offerProdInstId\":94121807681,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2015-06-01 00:00:00.0\",\"expDate\":\"2050-12-31 12:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":122494188722,\"offerName\":\"天翼视讯0元权益可选包\",\"offerInstId\":131169520262,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2016-11-01 00:00:00.0\",\"expDate\":\"2019-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":73071660658,\"offerName\":\"2014年员工套餐VPN可选包\",\"offerInstId\":136800695680,\"offerProdInstRel\":[{\"offerProdInstId\":9771213305,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":78869359710,\"offerName\":\"全家享新融合促销活动，协议期12个月\",\"offerInstId\":136800695698,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":\"2017-12-31 15:28:31.0\",\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":73071660658,\"offerName\":\"2014年员工套餐VPN可选包\",\"offerInstId\":136800902831,\"offerProdInstRel\":[{\"offerProdInstId\":28088586639,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":73071660658,\"offerName\":\"2014年员工套餐VPN可选包\",\"offerInstId\":136800943574,\"offerProdInstRel\":[{\"offerProdInstId\":12280923411,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":130609621232,\"offerName\":\"201609乐享家新业务体验9折促销\",\"offerInstId\":136801045556,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":\"2016-12-31 15:28:31.0\",\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":73071660658,\"offerName\":\"2014年员工套餐VPN可选包\",\"offerInstId\":136801159489,\"offerProdInstRel\":[{\"offerProdInstId\":222555912951,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":133995540302,\"offerName\":\"2016年新业务体验固话VPN可选包\",\"offerInstId\":136801510706,\"offerProdInstRel\":[{\"offerProdInstId\":222556108980,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-11-15 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":127811138302,\"offerName\":\"201609乐享家新业务体验光网固话加装包，0元/月\",\"offerInstId\":136801612944,\"offerProdInstRel\":[{\"offerProdInstId\":222556108980,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"89236872454\"},{\"subOfferInstId\":\"136801510706\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":131182889022,\"offerName\":\"201610新业务体验宽带加载高清IPTV可选包（一路高清）\",\"offerInstId\":138400224570,\"offerProdInstRel\":[{\"offerProdInstId\":222591391882,\"roleId\":\"10200001\"}],\"promConstExpDt\":null,\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":78859396240,\"offerName\":\"全家享新融合199档次宽带加装包\",\"offerInstId\":138400564725,\"offerProdInstRel\":[{\"offerProdInstId\":222591391882,\"roleId\":\"10200001\"}],\"promConstExpDt\":\"2017-12-31 10:32:47.0\",\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"140126012675\"},{\"subOfferInstId\":\"138400224570\"},{\"subOfferInstId\":\"138400813834\"},{\"subOfferInstId\":\"156939716191\"},{\"subOfferInstId\":\"216125678849\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":96125995971,\"offerName\":\"2015年后付费4K智能高清IPTV促销可选包\",\"offerInstId\":138400813834,\"offerProdInstRel\":[{\"offerProdInstId\":222591391882,\"roleId\":\"10200001\"}],\"promConstExpDt\":\"2017-12-31 10:32:47.0\",\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":113390551082,\"offerName\":\"2016年智能组网阶段性促销套餐\",\"offerInstId\":138406447593,\"offerProdInstRel\":[{\"offerProdInstId\":138409629284,\"roleId\":\"10100001\"}],\"promConstExpDt\":\"2017-12-31 11:21:27.0\",\"effDate\":\"2017-01-01 00:00:00.0\",\"expDate\":\"2050-03-15 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"11\",\"commodityType\":\"10\"},{\"offerId\":72957357644,\"offerName\":\"2014年员工套餐WIFI时长包\",\"offerInstId\":138956373104,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2017-02-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":100000001296777,\"offerName\":\"宽带网龄赠送0元1G+1G闲时国内流量包\",\"offerInstId\":140126012675,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"},{\"offerProdInstId\":222591391882,\"roleId\":\"10200001\"}],\"promConstExpDt\":null,\"effDate\":\"2017-02-01 00:00:00.0\",\"expDate\":\"2050-12-29 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"60\"},{\"offerId\":100000001296777,\"offerName\":\"宽带网龄赠送0元1G+1G闲时国内流量包\",\"offerInstId\":140137029269,\"offerProdInstRel\":[{\"offerProdInstId\":222555912951,\"roleId\":\"10100002\"},{\"offerProdInstId\":20119139877,\"roleId\":\"10200001\"}],\"promConstExpDt\":null,\"effDate\":\"2017-02-01 00:00:00.0\",\"expDate\":\"2050-12-29 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"60\"},{\"offerId\":132604466552,\"offerName\":\"201611 家庭云普通会员\",\"offerInstId\":156939716191,\"offerProdInstRel\":[{\"offerProdInstId\":222591391882,\"roleId\":\"10200001\"}],\"promConstExpDt\":null,\"effDate\":\"2017-09-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":92114544853,\"offerName\":\"2015年后付费4K智能高清IPTV促销可选包\",\"offerInstId\":163615530263,\"offerProdInstRel\":[{\"offerProdInstId\":20119139877,\"roleId\":\"10200001\"}],\"promConstExpDt\":\"2018-10-31 10:17:35.0\",\"effDate\":\"2017-11-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":152494942812,\"offerName\":\"畅享（十全十美）5元副卡功能费\",\"offerInstId\":175688747468,\"offerProdInstRel\":[{\"offerProdInstId\":222555912951,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":152499690612,\"offerName\":\"减免2张副卡月租费（5元副卡）\",\"offerInstId\":175689005992,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":152494942812,\"offerName\":\"畅享（十全十美）5元副卡功能费\",\"offerInstId\":175689099702,\"offerProdInstRel\":[{\"offerProdInstId\":28088586639,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":152494942812,\"offerName\":\"畅享（十全十美）5元副卡功能费\",\"offerInstId\":175689102657,\"offerProdInstRel\":[{\"offerProdInstId\":9771213305,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":148211957912,\"offerName\":\"0元40GB国内达量降速可选包\",\"offerInstId\":175689112164,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":152500965152,\"offerName\":\"畅享（十全十美）副卡（乐享家）\",\"offerInstId\":175689136178,\"offerProdInstRel\":[{\"offerProdInstId\":9771213305,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"136800695680\"},{\"subOfferInstId\":\"175689102657\"},{\"subOfferInstId\":\"188044099130\"},{\"subOfferInstId\":\"188045105741\"},{\"subOfferInstId\":\"229236760348\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":148636180162,\"offerName\":\"达量降速功能包\",\"offerInstId\":175689216596,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":152500965152,\"offerName\":\"畅享（十全十美）副卡（乐享家）\",\"offerInstId\":175689218299,\"offerProdInstRel\":[{\"offerProdInstId\":28088586639,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"136800902831\"},{\"subOfferInstId\":\"175689099702\"},{\"subOfferInstId\":\"186448209341\"},{\"subOfferInstId\":\"300346278271\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":152494942332,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerInstId\":175689231216,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"79291097066\"},{\"subOfferInstId\":\"79291104062\"},{\"subOfferInstId\":\"81286012530\"},{\"subOfferInstId\":\"90499280420\"},{\"subOfferInstId\":\"131169520262\"},{\"subOfferInstId\":\"136800695698\"},{\"subOfferInstId\":\"136801045556\"},{\"subOfferInstId\":\"136801612944\"},{\"subOfferInstId\":\"138366338119\"},{\"subOfferInstId\":\"138400564725\"},{\"subOfferInstId\":\"138956373104\"},{\"subOfferInstId\":\"175689005992\"},{\"subOfferInstId\":\"175689082653\"},{\"subOfferInstId\":\"175689112164\"},{\"subOfferInstId\":\"175689136178\"},{\"subOfferInstId\":\"175689216596\"},{\"subOfferInstId\":\"175689218299\"},{\"subOfferInstId\":\"175689229633\"},{\"subOfferInstId\":\"175689347101\"},{\"subOfferInstId\":\"175689356124\"},{\"subOfferInstId\":\"185427451668\"},{\"subOfferInstId\":\"195413211766\"},{\"subOfferInstId\":\"211216249084\"},{\"subOfferInstId\":\"213091287203\"},{\"subOfferInstId\":\"216316179988\"},{\"subOfferInstId\":\"221136482012\"},{\"subOfferInstId\":\"221287015834\"},{\"subOfferInstId\":\"228012401143\"},{\"subOfferInstId\":\"229002943684\"},{\"subOfferInstId\":\"229003419499\"},{\"subOfferInstId\":\"229111375778\"},{\"subOfferInstId\":\"229111375796\"},{\"subOfferInstId\":\"229177854494\"},{\"subOfferInstId\":\"229177854547\"},{\"subOfferInstId\":\"300073236618\"},{\"subOfferInstId\":\"300119779524\"},{\"subOfferInstId\":\"300207451460\"},{\"subOfferInstId\":\"300369812279\"}],\"offerType\":\"11\",\"commodityType\":\"10\"},{\"offerId\":152494942812,\"offerName\":\"畅享（十全十美）5元副卡功能费\",\"offerInstId\":175689334121,\"offerProdInstRel\":[{\"offerProdInstId\":12280923411,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-01-01 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":152500965152,\"offerName\":\"畅享（十全十美）副卡（乐享家）\",\"offerInstId\":175689347101,\"offerProdInstRel\":[{\"offerProdInstId\":12280923411,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"136800943574\"},{\"subOfferInstId\":\"175689334121\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":152500965152,\"offerName\":\"畅享（十全十美）副卡（乐享家）\",\"offerInstId\":175689356124,\"offerProdInstRel\":[{\"offerProdInstId\":222555912951,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"136801159489\"},{\"subOfferInstId\":\"175688747468\"},{\"subOfferInstId\":\"178321716528\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":122494188722,\"offerName\":\"天翼视讯0元权益可选包\",\"offerInstId\":178321716528,\"offerProdInstRel\":[{\"offerProdInstId\":222555912951,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-03-01 00:00:00.0\",\"expDate\":\"2019-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":183786592562,\"offerName\":\"全家享新融合0元宽带加装包（大礼包）\",\"offerInstId\":185427451668,\"offerProdInstRel\":[{\"offerProdInstId\":185427363587,\"roleId\":\"10200001\"}],\"promConstExpDt\":null,\"effDate\":\"2018-05-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"217655076004\"},{\"subOfferInstId\":\"217707558812\"}],\"offerType\":\"12\",\"commodityType\":\"70\"},{\"offerId\":122494188722,\"offerName\":\"天翼视讯0元权益可选包\",\"offerInstId\":186448209341,\"offerProdInstRel\":[{\"offerProdInstId\":28088586639,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2018-05-01 00:00:00.0\",\"expDate\":\"2019-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":137206876502,\"offerName\":\"201612-3升4G翼支付50元赠券促销\",\"offerInstId\":188044099130,\"offerProdInstRel\":[{\"offerProdInstId\":9771213305,\"roleId\":\"10100002\"}],\"promConstExpDt\":\"2018-04-30 09:27:26.0\",\"effDate\":\"2018-04-24 00:00:00.0\",\"expDate\":\"2020-04-30 09:27:26.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":67078404844,\"offerName\":\"赠送4GB国内流量（每月1GB，分4个月赠送）\",\"offerInstId\":188045105741,\"offerProdInstRel\":[{\"offerProdInstId\":9771213305,\"roleId\":\"10100002\"}],\"promConstExpDt\":\"2018-04-30 09:27:26.0\",\"effDate\":\"2018-05-01 00:00:00.0\",\"expDate\":\"2020-04-30 09:27:26.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":204932976813,\"offerName\":\"199元档次员工优惠促销\",\"offerInstId\":213091287203,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2019-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":10000475214,\"offerName\":\"基础销售品-添翼申学\",\"offerInstId\":214244695736,\"offerProdInstRel\":[{\"offerProdInstId\":214246526374,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2018-12-28 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"214247158701\"}],\"offerType\":\"10\",\"commodityType\":\"10\"},{\"offerId\":204942864243,\"offerName\":\"添翼申学可选包\",\"offerInstId\":214247158701,\"offerProdInstRel\":[{\"offerProdInstId\":214246526374,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2019-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":204942864243,\"offerName\":\"添翼申学可选包\",\"offerInstId\":214247578991,\"offerProdInstRel\":[{\"offerProdInstId\":214247277190,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2019-01-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":10000475214,\"offerName\":\"基础销售品-添翼申学\",\"offerInstId\":214247587946,\"offerProdInstRel\":[{\"offerProdInstId\":214247277190,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2018-12-28 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"214247578991\"}],\"offerType\":\"10\",\"commodityType\":\"10\"},{\"offerId\":206694819933,\"offerName\":\"全城千兆宽带提速包\",\"offerInstId\":216125678849,\"offerProdInstRel\":[{\"offerProdInstId\":216125822699,\"roleId\":\"10200001\"},{\"offerProdInstId\":222591391882,\"roleId\":\"10200001\"}],\"promConstExpDt\":null,\"effDate\":\"2019-02-01 00:00:00.0\",\"expDate\":\"2050-12-30 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":194719318192,\"offerName\":\"4K智能高清年付促销（10元/年）-单融\",\"offerInstId\":217655076004,\"offerProdInstRel\":[{\"offerProdInstId\":185427363587,\"roleId\":\"10200001\"}],\"promConstExpDt\":\"2020-02-29 18:31:22.0\",\"effDate\":\"2019-03-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"13\",\"commodityType\":\"50\"},{\"offerId\":194720164492,\"offerName\":\"4K智能高清可选包（1元/月）-单融\",\"offerInstId\":217707558812,\"offerProdInstRel\":[{\"offerProdInstId\":185427363587,\"roleId\":\"10200001\"}],\"promConstExpDt\":\"2020-02-29 14:15:35.0\",\"effDate\":\"2019-03-01 00:00:00.0\",\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":220267380678,\"offerName\":\"基础销售品-固定电话\",\"offerInstId\":220304208697,\"offerProdInstRel\":[{\"offerProdInstId\":94121807681,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":null,\"expDate\":\"2050-12-31 00:00:00.0\",\"offerInstRel\":[{\"subOfferInstId\":\"94122171192\"}],\"offerType\":\"10\",\"commodityType\":\"10\"},{\"offerId\":224704849735,\"offerName\":\"十全十美套餐0元10G全国流量月包（5个月）\",\"offerInstId\":229111375778,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2019-07-01 00:00:00.0\",\"expDate\":\"2019-11-30 19:10:37.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":100000002076690,\"offerName\":\"生日关怀100G流量包（当月有效）\",\"offerInstId\":300073236618,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2019-08-04 07:51:37.0\",\"expDate\":\"2019-08-31 23:59:59.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":214240316453,\"offerName\":\"抖音0元畅享定向流量包（当月有效）\",\"offerInstId\":300119779524,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2019-08-08 14:33:48.0\",\"expDate\":\"2019-08-31 23:59:59.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":100000004761133,\"offerName\":\"月月抢精品智能组网套餐，0元/月\",\"offerInstId\":300329751585,\"offerProdInstRel\":[{\"offerProdInstId\":300329751586,\"roleId\":\"10100001\"}],\"promConstExpDt\":null,\"effDate\":\"2019-10-01 00:00:00.0\",\"expDate\":\"2050-12-31 23:59:59.0\",\"offerInstRel\":[],\"offerType\":\"11\",\"commodityType\":\"10\"},{\"offerId\":100000001780942,\"offerName\":\"“播播”定向流量全免包（上海）\",\"offerInstId\":300346278271,\"offerProdInstRel\":[{\"offerProdInstId\":28088586639,\"roleId\":\"10100002\"}],\"promConstExpDt\":null,\"effDate\":\"2019-08-31 22:40:25.0\",\"expDate\":\"2051-02-28 23:59:59.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"},{\"offerId\":100000001817558,\"offerName\":\"十全十美套餐199、299档次流量赠送0元40G全国流量月包（12个月）\",\"offerInstId\":300369812279,\"offerProdInstRel\":[{\"offerProdInstId\":28301286391,\"roleId\":\"10100002\"}],\"promConstExpDt\":\"2020-09-04 11:05:24.0\",\"effDate\":\"2019-10-01 00:00:00.0\",\"expDate\":\"2020-10-31 23:59:59.0\",\"offerInstRel\":[],\"offerType\":\"12\",\"commodityType\":\"40\"}],\"prodInst\":[{\"prodInstId\":19921094970,\"prodId\":\"10000000172\",\"prodName\":\"e云\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"2011-11-24 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"EY0000529232\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"EY0000529232\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":19921094970,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":20119139877,\"prodId\":\"1000000511\",\"prodName\":\"有线宽带\",\"statusCd\":100000,\"addressDesc\":\"周家嘴路2188弄15号4楼401室\",\"firstFinishDate\":\"2006-01-14 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"AD0002486689\",\"acctCd\":\"79704625879\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"AD0002486689\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"1\",\"contactAddr\":\"周家嘴路2188弄15号4层401室\"}],\"accProdInstId\":20119139877,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":28301286391,\"prodId\":\"1000001315\",\"prodName\":\"移动电话\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号2层201室\",\"firstFinishDate\":\"2012-07-31 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"18918337168\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"18918337168\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":28301286391,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":222556108980,\"prodId\":\"1000004955\",\"prodName\":\"固定电话\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"1994-05-21 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"65890836\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"65890836\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":222556108980,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":94121807681,\"prodId\":\"1000004955\",\"prodName\":\"固定电话\",\"statusCd\":100000,\"addressDesc\":\"榆林路640号1层103室\",\"firstFinishDate\":\"2001-05-09 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"55213722\",\"acctCd\":\"41478416806\",\"paymentMethod\":\"900001\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"55213722\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"1\",\"contactAddr\":\"榆林路640号1层103室\"}],\"accProdInstId\":94121807681,\"paymentModeCd\":\"2100\",\"stopType\":null},{\"prodInstId\":9771213305,\"prodId\":\"1000001315\",\"prodName\":\"移动电话\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"2009-07-30 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"18917113537\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"18917113537\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":9771213305,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":28088586639,\"prodId\":\"1000001315\",\"prodName\":\"移动电话\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号2层201室\",\"firstFinishDate\":\"2012-07-25 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"18918920001\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"18918920001\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":28088586639,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":12280923411,\"prodId\":\"1000001315\",\"prodName\":\"移动电话\",\"statusCd\":100000,\"addressDesc\":\"包头路1150弄32号13层1303室\",\"firstFinishDate\":\"2010-01-26 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"18930752367\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"18930752367\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":12280923411,\"paymentModeCd\":\"2100\",\"stopType\":null},{\"prodInstId\":222555912951,\"prodId\":\"1000001315\",\"prodName\":\"移动电话\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"1998-06-15 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"13301802807\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"13301802807\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":222555912951,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":222591391882,\"prodId\":\"1000000511\",\"prodName\":\"有线宽带\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"2004-03-08 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"AD0000920854\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"AD0000920854\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":222591391882,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":138409629284,\"prodId\":\"10000000182\",\"prodName\":\"智慧家庭\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号2层201室\",\"firstFinishDate\":\"2016-12-30 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"ZH10306243\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"ZH10306243\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":138409629284,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":185427363587,\"prodId\":\"1000000511\",\"prodName\":\"有线宽带\",\"statusCd\":100000,\"addressDesc\":\"榆林路640号1层103室\",\"firstFinishDate\":\"2018-04-02 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"KD1127175319\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"KD1127175319\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":185427363587,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":214246526374,\"prodId\":\"10000315352\",\"prodName\":\"添翼申学\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"2018-12-28 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"ZH11994172\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"ZH11994172\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":214246526374,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":214247277190,\"prodId\":\"10000315352\",\"prodName\":\"添翼申学\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"2018-12-28 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"ZH11994176\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"ZH11994176\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":214247277190,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":216125822699,\"prodId\":\"1000000675\",\"prodName\":\"流量计费提醒号码\",\"statusCd\":100000,\"addressDesc\":null,\"firstFinishDate\":\"2019-01-17 00:00:00.0\",\"actDate\":null,\"stopReason\":null,\"accNum\":\"18918337168\",\"acctCd\":null,\"paymentMethod\":null,\"eftZwzxBankName\":null,\"deviceAccNum\":\"18918337168\",\"limitInfo\":null,\"invFormatCustomizeRel\":[],\"accProdInstId\":222591391882,\"paymentModeCd\":\"1200\",\"stopType\":null},{\"prodInstId\":300329751586,\"prodId\":\"10000000182\",\"prodName\":\"智慧家庭\",\"statusCd\":100000,\"addressDesc\":\"许昌路570弄5号201室\",\"firstFinishDate\":\"2019-09-07 11:47:27.0\",\"actDate\":\"2019-09-07 11:47:27.0\",\"stopReason\":null,\"accNum\":\"ZH20045300\",\"acctCd\":\"29092548577\",\"paymentMethod\":\"100000\",\"eftZwzxBankName\":null,\"deviceAccNum\":\"ZH20045300\",\"limitInfo\":null,\"invFormatCustomizeRel\":[{\"postMethod\":\"8\",\"contactAddr\":\"许昌路570弄5号201室\"}],\"accProdInstId\":300329751586,\"paymentModeCd\":\"1200\",\"stopType\":null}]}";
            if (StringUtil.isEmpty(result) || "nullValue".equals(result)) {
                log.info("查询客户设备清单异常,异常信息：NullValue----------openId" + openId);
                return null;
            } else {
                List<Map<String, String>> list = new ArrayList<Map<String, String>>();

                JSONObject object = JSONObject.parseObject(result);
                resultMap.put("phone", phone);
                // 将用户手机号信息进行脱敏
                String tomiphone = phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
                resultMap.put("tomiphone", tomiphone);
                String custName = object.getString("custName");
                // 将用户用户姓名信息进行脱敏
                resultMap.put("custName", custName);
                String tomicustName = custName.substring(0, 1) + "**";
                resultMap.put("tomicustName", tomicustName);
                // 解析报文判断用户名下是否有宽带信息
                JSONArray offerInst = JSONObject.parseArray(object.getString("offerInst"));
                JSONArray prodInst = JSONObject.parseArray(object.getString("prodInst"));

                //预付费---传“2100”、后付费---传“1200”、准实时预付费---传“1201”
                for (int i = 0; i < prodInst.size(); i++) {
                    JSONObject jsonObject = JSONObject.parseObject(prodInst.getString(i));
                    if (jsonObject.getString("prodId").equals(Constants.PHONE_PRODID)) {
                        Map<String, String> map = new HashMap<String, String>();
                        // 查询到宽带设备进行返回
                        map.put("accNumTomi", jsonObject.getString("accNum").substring(0, 3) + "****" + jsonObject.getString("accNum").substring(7, jsonObject.getString("accNum").length()));
                        map.put("accNum", jsonObject.getString("accNum"));
                        map.put("paymentModeCd", jsonObject.getString("paymentModeCd"));
                        list.add(map);
                    }
                }
                for (int i = 0; i < prodInst.size(); i++) {
                    JSONObject jsonObject = JSONObject.parseObject(prodInst.getString(i));
                    if (jsonObject.getString("prodId").equals(Constants.FIXED_PRODID)) {
                        Map<String, String> map = new HashMap<String, String>();
                        // 查询到宽带设备进行返回
                        map.put("accNum", jsonObject.getString("accNum"));
                        map.put("accNumTomi", jsonObject.getString("accNum").substring(0, 2) + "****" + jsonObject.getString("accNum").substring(5, jsonObject.getString("accNum").length()));
                        map.put("paymentModeCd", jsonObject.getString("paymentModeCd"));
                        list.add(map);
                    }
                }
                // 返回宽带地址信息列表

                if (list != null && list.size() > 1) {
                    Collections.sort(list, new Comparator<Map<String, String>>() {
                        @Override
                        public int compare(Map<String, String> o1, Map<String, String> o2) {
                            Integer o1Value = Integer.valueOf(o1.get("paymentModeCd").toString());
                            Integer o2Value = Integer.valueOf(o2.get("paymentModeCd").toString());
                            return o1Value.compareTo(o2Value);
                        }
                    });
                }
                System.out.println(list);
                resultMap.put("phoneList", list);
            }
        } catch (Exception e) {
            // 出现异常；记录 操作日志
            e.printStackTrace();
        }
        return resultMap;

    }

    @Override
    public Map<String, Object> queryArreaOwe(String deviceNo) {
        if (StringUtil.isEmpty(deviceNo)) {
            log.error("调用判断是否欠费接口，accNum 为空");
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("code", "-1");
            result.put("info", "调用判断是否欠费 返回空");
            return result;
        }

        String reqData = QUERYARREAURL + deviceNo;
        log.error("调用判断是否欠费接口，get请求资源路径：" + reqData);

        try {

                 String returnJson = httpRequest.HttpGet(reqData);
//            String returnJson = "{\"errcode\":\"\",\"errMsg\":\"\",\"resultMsg\":\"0000\"}";
            if (StringUtil.isEmpty(returnJson)) {

                log.error("调用判断是否欠费 返回空");
                Map<String, Object> result = new HashMap<String, Object>();
                result.put("code", "-1");
                result.put("info", "调用判断是否欠费 返回空");
                return result;
            }

            Map<String, Object> returnJsonMap = JSONObject.parseObject(returnJson, Map.class);
            log.error("调用判断是否欠费 返回内容 returnJson=" + returnJson);

            //0000：未欠费、9999：已欠费 -1 异常
            String resultMsg = String.valueOf(returnJsonMap.get("resultMsg"));
            if ("9999".equals(resultMsg)) {
                Map<String, Object> result = new HashMap<String, Object>();
                result.put("code", "9999");
                result.put("info", "已欠费");
                result.put("data", returnJsonMap);
                return result;
            } else {
                Map<String, Object> result = new HashMap<String, Object>();
                result.put("code", "0000");
                result.put("info", "未欠费");
                result.put("data", returnJsonMap);
                return result;
            }

        } catch (Exception e) {
            log.error("调用判断是否欠费接口异常，异常信息：" + e.getMessage());
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("code", "-1");
            result.put("info", "调用判断是否欠费 返回空");
            return result;
        }

    }

    @Override
    public String queryCheckRealName(String custId, String deviceNo, String openId) {
        //关键性参数，必传字段
        if (StringUtil.isEmpty(openId)) {
            openId = "nullValue";
        }
        String deviceNum = deviceNo;
        if (StringUtil.isEmpty(deviceNum)) {
            deviceNum = "nullValue";
        }
        //获取orderCode
        String orderCode = "WXKF" + DateUtil.getDateTimeStrNum(new Date()) + ((Math.random() * 9 + 1) * 100000);
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();

        //dataObject业务数据
        Map<String, Object> requestMap = new HashMap<String, Object>(1);
        requestMap.put("custNumber", custId);
        requestMap.put("accNum", deviceNo);

        //请求接口
      String resultJson = interfaceCommonServiceInt.checkRealName_v1_0(openId, deviceNum,orderCode, requestClass, requestMethod, requestMap);
//        String resultJson = "{\"code\":\"0\",\"message\":\"1.检验是否为预开通虚拟客户，已通过！  2.检验主要证件类型是否通过，已通过！ 3.检验身份证核查结果是否通过，已通过！ 4.检验证件号码位数是否通过，已通过！5.检验客户名称长度是否通过，已通过！6.检验客户名称中包含特殊字符是否通过，已通过！\"}";
        //返回报文非空、nullValue判断
        if (StringUtil.isEmpty(resultJson) || "nullValue".equals(resultJson)) {
            log.error("调用checkRealName_v1_0根据客户号或手机号查询实名制接口，返回空报文。resultJson:" + resultJson);
            return null;
        }
        //new 线程安全的HashMap对象 用于存储返回报文解析结果
        Map<String, Object> resultMap = new ConcurrentHashMap<String, Object>();
        try {
            resultMap = JSONObject.parseObject(resultJson, Map.class);
        } catch (Exception e) {
            log.error("调用checkRealName_v1_0根据客户号或手机号查询实名制接口，json转map对象异常，异常信息：" + e.getMessage());
            return null;
        }
        String code = String.valueOf(resultMap.get("code"));
        return code;
    }

    @Override
    public boolean assetInfoByServiceIdSal(Map<String, String> map, String userId, String deviceNo, String custId) {
        Map<String, Object> requestMap = new HashMap<String, Object>();
        requestMap.put("accNum", deviceNo);// 客户订单标识
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
        String orderCode = "WXKF" + DateUtil.getDateTimeStrNum(new Date()) + ((Math.random() * 9 + 1) * 100000);
        String result=interfaceCommonServiceInt.assetInfoByServiceIdSal_v1_0(userId,"nullValue", orderCode, requestClass, requestMethod, requestMap);
//        String result = "{\"custName\":\"陈根良\",\"acctCd\":\"29092548577\",\"custNumber\":\"202122647895\",\"billingCustName\":\"陈根良\",\"billingCustNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"firstfinishDate\":\"2012-07-31 00:00:00.0\",\"addressId\":\"50757102\",\"addressDesc\":\"许昌路570弄5号2层201室\",\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"accNum\":\"18918337168\",\"stopDate\":null,\"actDate\":null,\"unActivatedFlag\":null,\"prodInstId\":28301286391,\"prodId\":1000001315,\"prodName\":\"移动电话\",\"subOffer\":[{\"custName\":\"陈根良\",\"billingCustName\":\"陈根良\",\"billingCustNumber\":\"202122647895\",\"acctCd\":\"29092548577\",\"contactAddr\":\"许昌路570弄5号201室\",\"attrvalue\":\"东区\",\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":140126012675,\"firstfinishDate\":\"2012-07-31 00:00:00.0\",\"addressDesc\":\"许昌路570弄5号2层201室\",\"offerName\":\"宽带网龄赠送0元1G+1G闲时国内流量包\",\"offerId\":100000001296777,\"expDate\":\"2050-12-29 00:00:00.0\",\"parentOfferId\":\"78859396240\",\"effDate\":\"2017-02-01 00:00:00.0\",\"accNum\":\"18918337168\",\"subBureau\":\"长阳\",\"prodInstId\":28301286391,\"prodId\":1000001315,\"prodName\":\"移动电话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[{\"displayName\":\"产品（帐目）种类\",\"name\":\"所有费用\",\"value\":\"5\"},{\"displayName\":\"成员账户呼叫权限\",\"name\":\"无限制\",\"value\":\"No Limited\"},{\"displayName\":\"集团月限额\",\"name\":null,\"value\":null},{\"displayName\":\"是否集团管理员\",\"name\":\"否\",\"value\":\"No\"},{\"displayName\":\"EID\",\"name\":null,\"value\":null},{\"displayName\":\"卡容量\",\"name\":\"32K\",\"value\":\"32K\"},{\"displayName\":\"G-IMSI\",\"name\":null,\"value\":\"204043327842897\"},{\"displayName\":\"HLR_CODE\",\"name\":null,\"value\":null},{\"displayName\":\"IMSI\",\"name\":null,\"value\":\"460030784372223\"},{\"displayName\":\"LTE-IMSI\",\"name\":null,\"value\":\"460110122066761\"},{\"displayName\":\"卡类型\",\"name\":\"OTA卡EVDO卡天翼国际卡（沃达丰）4G LTE13.56M NFC SWPNANO卡\",\"value\":\"00708\"},{\"displayName\":\"uim卡号码\",\"name\":null,\"value\":\"8986111413021078990\"},{\"displayName\":\"LTE国内数据漫游\",\"name\":\"否\",\"value\":\"No\"},{\"displayName\":\"分机号\",\"name\":null,\"value\":\"29\"}],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"全家享新融合199档次宽带加装包\",\"innerNbr\":\"2-1086UJKG\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286402,\"prodId\":1000000110,\"prodName\":\"2G（1X）上网\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286403,\"prodId\":1000000582,\"prodName\":\"国内通话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286404,\"prodId\":1000000114,\"prodName\":\"短信（点对点）\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286412,\"prodId\":1000004970,\"prodName\":\"无条件转移\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286413,\"prodId\":10000000293,\"prodName\":\"三方通话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286414,\"prodId\":1000001321,\"prodName\":\"无应答转移\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286415,\"prodId\":1000001396,\"prodName\":\"天翼视讯\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286416,\"prodId\":1000000581,\"prodName\":\"声讯电话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286417,\"prodId\":1000000111,\"prodName\":\"3G（EVDO）上网\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286419,\"prodId\":1000004988,\"prodName\":\"来电显示\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286420,\"prodId\":1000001322,\"prodName\":\"遇忙转移\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286421,\"prodId\":1000001323,\"prodName\":\"不可及转移\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286422,\"prodId\":1000001389,\"prodName\":\"本地网呼叫权限\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286423,\"prodId\":1000001392,\"prodName\":\"紧急呼叫\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286424,\"prodId\":1000004978,\"prodName\":\"呼叫等待\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"18918337168\",\"subBureau\":null,\"prodInstId\":28301286425,\"prodId\":1000000113,\"prodName\":\"WLAN上网\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286427,\"prodId\":1000001365,\"prodName\":\"手机\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286428,\"prodId\":1000001390,\"prodName\":\"呼叫保持\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2009-10-15 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":28301286429,\"prodId\":1000001318,\"prodName\":\"国内漫游电话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2014-12-23 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":80579920968,\"prodId\":1000001335,\"prodName\":\"翼支付\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":175689231216,\"firstfinishDate\":\"2014-12-23 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"十全十美畅享199元套餐（乐享家）\",\"offerId\":152494942332,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":null,\"effDate\":\"2018-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":80579920969,\"prodId\":1000000112,\"prodName\":\"4G（LTE）上网\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":\"2021-01-31 23:59:59.0\",\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":81286012530,\"firstfinishDate\":\"2014-12-29 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"2014年员工套餐VPN可选包\",\"offerId\":73071660658,\"expDate\":\"2050-12-31 00:00:00.0\",\"parentOfferId\":\"152494942332\",\"effDate\":\"2015-01-01 00:00:00.0\",\"accNum\":\"1-33PMNRL\",\"subBureau\":null,\"prodInstId\":81009236498,\"prodId\":1000001414,\"prodName\":\"营帐VPN\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2016-08-23 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":126238556278,\"prodId\":1000001331,\"prodName\":\"翼支付交费助手\",\"accProdInstId\":28301286391,\"prodInstAttr\":[{\"displayName\":\"单次充值额度\",\"name\":\"50\",\"value\":\"50\"},{\"displayName\":\"是否需要代扣确认\",\"name\":\"否\",\"value\":\"2\"},{\"displayName\":\"阀值组别\",\"name\":null,\"value\":\"[20，10，5]\"}],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2016-09-04 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":127433416767,\"prodId\":1000001354,\"prodName\":\"语音信箱\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2018-10-18 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":206998931656,\"prodId\":1000001328,\"prodName\":\"国际及港澳台漫游通话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2018-10-18 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":206998931657,\"prodId\":1000000133,\"prodName\":\"国际及港澳台长途电话\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2018-10-18 00:00:00.0\",\"addressDesc\":null,\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":206998931658,\"prodId\":1000001329,\"prodName\":\"国际及港澳台数据漫游\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":302438977249,\"firstfinishDate\":\"2019-04-22 00:00:00.0\",\"addressDesc\":null,\"offerName\":\"5G升级会员20G包29元\",\"offerId\":100000029889077,\"expDate\":\"2050-12-31 23:59:59.0\",\"parentOfferId\":\"152494942332\",\"effDate\":\"2020-02-01 00:00:00.0\",\"accNum\":\"*\",\"subBureau\":null,\"prodInstId\":229003320580,\"prodId\":1000001340,\"prodName\":\"VoLTE\",\"accProdInstId\":28301286391,\"prodInstAttr\":[],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":\"东区\",\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":null,\"firstfinishDate\":\"2012-07-31 00:00:00.0\",\"addressDesc\":\"许昌路570弄5号2层201室\",\"offerName\":null,\"offerId\":null,\"expDate\":null,\"parentOfferId\":null,\"effDate\":null,\"accNum\":\"18918337168\",\"subBureau\":\"长阳\",\"prodInstId\":229213300566,\"prodId\":10001454687,\"prodName\":\"入群功能\",\"accProdInstId\":28301286391,\"prodInstAttr\":[{\"displayName\":\"分机号\",\"name\":null,\"value\":\"029\"}],\"promConstexpDt\":null,\"paymentModeCd\":\"预付费|2100\",\"parentOfferName\":null,\"innerNbr\":null},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":null,\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":302438977248,\"firstfinishDate\":\"2020-01-17 13:27:35.0\",\"addressDesc\":\"\",\"offerName\":\"白金会员\",\"offerId\":100000021942582,\"expDate\":\"2053-05-31 23:59:59.0\",\"parentOfferId\":\"152494942332\",\"effDate\":\"2020-01-17 13:27:35.0\",\"accNum\":\"null\",\"subBureau\":null,\"prodInstId\":302438977251,\"prodId\":990090036,\"prodName\":\"5G上网\",\"accProdInstId\":28301286391,\"prodInstAttr\":[{\"displayName\":\"5G上行速率\",\"name\":\"100M\",\"value\":\"1001\"},{\"displayName\":\"5G下行速率\",\"name\":\"1G\",\"value\":\"1002\"}],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"},{\"custName\":\"陈根良\",\"billingCustName\":null,\"billingCustNumber\":null,\"acctCd\":null,\"contactAddr\":null,\"attrvalue\":\"东区\",\"custNumber\":\"202122647895\",\"statusCd\":\"在用|100000\",\"offerInstId\":303854252218,\"firstfinishDate\":\"2020-05-15 20:08:02.0\",\"addressDesc\":\"许昌路570弄5号2层201室\",\"offerName\":\"视频彩铃6元包\",\"offerId\":100000053392376,\"expDate\":\"2050-12-30 23:59:59.0\",\"parentOfferId\":\"152494942332\",\"effDate\":\"2020-05-15 20:08:02.0\",\"accNum\":\"null\",\"subBureau\":\"长阳\",\"prodInstId\":303854252220,\"prodId\":1000001336,\"prodName\":\"七彩铃音\",\"accProdInstId\":28301286391,\"prodInstAttr\":[{\"displayName\":\"音频彩铃\",\"name\":\"\",\"value\":\"音频彩铃\"},{\"displayName\":\"VoLTE视频彩铃\",\"name\":\"\",\"value\":\"VoLTE视频彩铃\"},{\"displayName\":\"VoLTE音频彩铃\",\"name\":\"\",\"value\":\"VoLTE音频彩铃\"},{\"displayName\":\"业务类型\",\"name\":\"VoLTE音视频彩铃\",\"value\":\"VoLTE Audio And Video CRBT\"}],\"promConstexpDt\":null,\"paymentModeCd\":\"后付费|1200\",\"parentOfferName\":\"十全十美畅享199元套餐（乐享家）\",\"innerNbr\":\"2-1Y1ZJUKC\"}],\"parentOfferId\":null,\"paymentModeCd\":\"后付费|1200\",\"labelValue\":[{\"labelValue\":\"1\"}],\"custType\":\"公众客户|1100\",\"staffId\":null,\"expDate\":\"2050-12-31 00:00:00.0\",\"acctBillingType\":\"1\",\"serviceCustName\":\"陈根良\",\"stopInfo\":[],\"account\":null}";
        JSONObject object = JSONObject.parseObject(result);
        JSONArray subOffer = JSONObject.parseArray(object.getString("subOffer"));
        for (int i = 0; i < subOffer.size(); i++) {
            JSONObject jsonObject = JSONObject.parseObject(subOffer.getString(i));
            if (jsonObject.getString("prodId").equals(Constants.CALL_PRODID)) {
                map.put("prodInstId", jsonObject.getString("prodInstId"));
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, Object> mybusiness(Map<String, String> proInfo, String custId, String userId, String type, String deviceNo) {

        String accNum = "";// 设备号
        String acceptDate = "";// 受理时间
        String extCustOrderId = "";// 流水号
        ArrayList<Object> funcProdOrderList = new ArrayList<Object>();
        Map<String, Object> requestMap = new HashMap<String, Object>();

        String domain = "10.144.97.143:8088";//
        requestMap.put("callbackUrl", "http://" + domain + "/valueadded/callshow/callShowOptPackageCallback");

        if (type.equals("1")) {//开通
            //开通来电显示
            accNum = deviceNo;
            acceptDate = DateUtil.getDateTime("yyyyMMddHHmmss", new Date());
            extCustOrderId = "600102000102" + DateUtil.getDateTime("yyyyMMddHHmmss", new Date()) + String.valueOf((int) ((Math.random() * 9 + 1) * 10));

            Map<String, Object> m1 = new HashMap<String, Object>();
            m1.put("prodInstId", "-1");// 可选包、促销实例Id；新增为负数，同一订单的该字段不可重复 可写死
            m1.put("prodName", String.valueOf(proInfo.get("prodName")));// 产品名称
            m1.put("prodId", String.valueOf(proInfo.get("prodId")));// 产品规格id
            m1.put("action", "ADD");// 提交状态 开通 ADD 、关闭DELETE
            funcProdOrderList.add(m1);
        } else {//关闭
            //关闭来电显示
            accNum = deviceNo;
            acceptDate = DateUtil.getDateTime("yyyyMMddHHmmss", new Date());
            extCustOrderId = "600102000102" + DateUtil.getDateTime("yyyyMMddHHmmss", new Date()) + String.valueOf((int) ((Math.random() * 9 + 1) * 10));

            Map<String, Object> m1 = new HashMap<String, Object>();
            m1.put("prodInstId", proInfo.get("prodInstId"));// 可选包、促销实例Id；新增为负数，同一订单的该字段不可重复 可写死
            m1.put("prodName", String.valueOf(proInfo.get("prodName")));// 产品名称
            m1.put("prodId", String.valueOf(proInfo.get("prodId")));// 产品规格id
            m1.put("action", "DEL");// 提交状态 开通 ADD 、关闭DELETE
            funcProdOrderList.add(m1);
        }


        Map<String, Object> itemMap = new HashMap<String, Object>();
        itemMap.put("accNum", accNum);// 设备号
        itemMap.put("action", "MOD");// 提交状态 写死
        itemMap.put("funcProdOrderItems", funcProdOrderList);

        ArrayList<Object> itemMaps = new ArrayList<Object>();
        itemMaps.add(itemMap);


        requestMap.put("ordSubmit", "1001");// 是否提交订单标识 写死
        requestMap.put("channelNbr", "3101002485790");// 渠道编码 写死
        requestMap.put("acceptDate", acceptDate);// 受理时间
        requestMap.put("extCustOrderId", extCustOrderId);// 流水号
        requestMap.put("sysSource", "107");// 受理系统 写死
        requestMap.put("createStaff", "AKB999");// 受理编号，写死
        requestMap.put("remark", "remark");// 备注，可为空
        requestMap.put("accProdOrderItems", itemMaps);

        return requestMap;
    }

    @Override
    public Map<String,Object> functionalProductsCompletion(Map<String, Object> dataObject_opt, String custId, String userId, String deviceNo) {
        //调用异步改性能接口，并且将数据入库
        String requestClass = Thread.currentThread().getStackTrace()[1].getClassName();
        String requestMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String orderCode = df.format(new Date()) + String.valueOf((int) ((Math.random() * 9 + 1) * 1000));

        try {
           String result = interfaceCommonServiceInt.functionalProductsCompletion_v1_0(userId, deviceNo, orderCode, requestClass, requestMethod, dataObject_opt);
//            String result="{\"code\":\"0000\",\"info\":\"请求接口成功\",\"dataObject\":\"{\\\"businessCode\\\":\\\"0000\\\",\\\"businessInfo\\\":\\\"请求接口成功\\\",\\\"businessDataObject\\\":\\\"nullValue\\\"}\"}";
            dataObject_opt.put("resp_json", result);
            log.info("异步改性能接口返回报文：" + result);
            if (result == null || "".equals(result) || "nullValue".equals(result)) {
                dataObject_opt.put("submit_status", "0");
                dataObject_opt.put("submit_reason", "请求接口失败，返回null");// 请求返回内容描述
            } else {
                Map<String, Object> resultMap = JSON.parseObject(result);
                String businessCode = String.valueOf(resultMap.get("businessCode"));
                String businessInfo = String.valueOf(resultMap.get("businessInfo"));
                if (businessCode.equals("0000")) {// 成功
                    dataObject_opt.put("submit_status", "1");
                    dataObject_opt.put("submit_reason", businessInfo);// 请求返回内容描述
                } else {// 失败
                    dataObject_opt.put("submit_status", "0");
                    dataObject_opt.put("submit_reason", businessInfo);// 请求返回内容描述
                }
            }
        } catch (Exception e) {
            dataObject_opt.put("submit_status", "2");
            dataObject_opt.put("submit_reason", "调用异常，异常原因：" + e.getMessage());// 请求返回内容描述
        }
        return dataObject_opt;
    }

    @Override
    public int updateCallShowOrder(PCallshow callshow) {
        return callshowMapper.updateByPrimaryKeySelective(callshow);
    }

    @Override
    public int insertCallShowSelective(PCallshow callshow) {
        return callshowMapper.insertSelective(callshow);
    }

}

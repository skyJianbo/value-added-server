package cn.sh.ideal.valueaddedserver.callshow.service;

import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshowLog;
import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshow;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface CallshowService {

    int insertCallshowLog(PCallshowLog pCallshowLog);

    /**
     * 根据设备号获取客户号标识
     *
     * @param phone
     * @param userId
     * @return
     */
    Map<String, Object> toQueryAcctnbrBySerialnbr(String phone, String userId) throws Exception;

    /**
     * 根据客户号查询用户在途订单
     *
     * @param userId
     * @param custId
     * @return
     */
    boolean customerOrderList(String userId, String custId);

    /**
     * 根据客户号查询用户类型 是否为政企，个人用户
     *
     * @param custId
     * @param request
     * @return
     */
    Map<String, Object> toQueryCustInfoByCustNum(String custId, HttpServletRequest request);

    /**
     * 查询用户是否为黑名单用户
     *
     * @param custName
     * @param certNum
     * @param custId
     * @param userId
     * @param request
     * @return
     */
    boolean QueryOWEByAccountName(String custName, String certNum, String custId, String userId, HttpServletRequest request) throws Exception;

    /**
     * 根据设备号查询设备清单，并筛选固话和手机设备
     *
     * @param custId
     * @param phone
     * @param userId
     * @return
     */
    Map<String, Object> ServiceIdListByAccountPhoneInfo(String custId, String phone, String userId);

    /**
     * 根据设备号查询设备是否欠费
     * @param deviceNo
     * @return
     */
    Map<String, Object> queryArreaOwe(String deviceNo);

    /**
     * 根据客户号和设备号查询是否实名
     * @param custId
     * @param deviceNo
     * @return
     */
    String queryCheckRealName(String custId, String deviceNo, String openId);

    /**
     * 根据设备号查询订购关系接口
     *
     * @param map
     * @param userId
     * @param deviceNo
     * @param custId
     * @return
     */
    boolean assetInfoByServiceIdSal(Map<String, String> map, String userId, String deviceNo, String custId);

    /**
     * 封装异步改性能接口
     * @param proInfo
     * @param custId
     * @param userId
     * @param type
     * @param deviceNo
     * @return
     */
    Map<String, Object> mybusiness(Map<String, String> proInfo, String custId, String userId, String type, String deviceNo);

    /**
     * 发送请求并且调用改性能接口
     * @param dataObject_opt
     * @param custId
     * @param userId
     * @param deviceNo
     * @return
     */
    Map<String,Object> functionalProductsCompletion(Map<String, Object> dataObject_opt, String custId, String userId, String deviceNo);

    /**
     * 根据订单流水号修改回调返回信息
     * @param callshow
     * @return
     */
    int updateCallShowOrder(PCallshow callshow);

    /**
     * 插入用户提交来电记录
     * @param callshow
     * @return
     */
    int insertCallShowSelective(PCallshow callshow);
}

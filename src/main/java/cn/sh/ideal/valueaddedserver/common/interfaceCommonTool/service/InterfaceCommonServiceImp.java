package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.service;

import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.dataUtil.JsonToDataObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;






/**
 * 公共接口实现类
 *  @author  宁振鹏  
 *  @ClassName  : InterfaceCommonServiceImp*  
 *  @Version  版本 *  
 *  @ModifiedBy 修改人 * 
 *  @Copyright  公司名称 * 
 *  @date  2018年8月23日 上午10:16:51
 */
@Service
@Slf4j
public class InterfaceCommonServiceImp implements InterfaceCommonServiceInt{
    @Autowired
    private  JsonToDataObject jsonToDataObject;

    /**
     * queryBalanceEasyCheck_v1_0
     * @param deviceNum
     *            设备号为关键性参数，必传字段
     * @param openId
     *            微信号为关键性参数，必传字段
     * @param orderCode
     *            透传订单号（与接口所需订单号保持一致）为关键性参数，必传字段
     * @param requestClass
     *            调用的类为关键性参数，必传字段
     * @param requestMethod
     *            调用的方法为关键性参数，必传字段
     * @param dataObject 参数：接口所需参数（调用接口所传参数实在是无法提供，则默认值为 nullValue_XXX调用方法,以便追随查证）
     *  dataObject 参数: accountNumber、startDate、endDate
     * @return
     */
    public String queryBalanceEasyCheck_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * checkIdService_v1_0
     * @param dataObject 参数: contactId、customerName、cardId
     * @return
     */
    public String checkIdService_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * blackListService_v1_0
     * @param dataObject 参数: local_code、phone、type、status
     * @return
     */
    public String blackListService_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * complexOrderORQueryFlow_v1_0
     * @param dataObject 参数: promotionId、deviceId、orderCode
     * @return
     */
    public String complexOrderORQueryFlow_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * sendFlowManagementOrder_v1_0
     * @param dataObject 参数: promotionId、deviceId、orderCode
     * @return
     */
    public String sendFlowManagementOrder_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * complexPackageUse_v1_0
     * @param dataObject 参数: phone、count
     * @return
     */
    public String complexPackageUse_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryAccountAllInfoByAccountNO_v1_0
     * @param dataObject 参数: custNumber
     * @return
     */
    public String queryAccountAllInfoByAccountNO_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryAccountAllInfoByAccountNO4_v1_0
     * @param dataObject 参数: custNumber
     * @return
     */
    public String queryAccountAllInfoByAccountNO4_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryAcctnbrBySerialnbr_v1_0
     * @param dataObject 参数: devNumber
     * @return
     */
    public String queryAcctnbrBySerialnbr_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryBPInfoByBPNum_v1_0
     * @param dataObject 参数: accountNumber
     * @return
     */
    public String queryBPInfoByBPNum_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryBPnbrListBySerialnbr_v1_0
     * @param dataObject 参数: deviceId
     * @return
     */
    public String queryBPnbrListBySerialnbr_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryCustInfoByCustNum_v1_0
     * @param dataObject 参数: custId
     * @return
     */
    public String queryCustInfoByCustNum_v2_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryDeviceInfo_v1_0
     * @param dataObject 参数: deviceId
     * @return
     */
    public String queryDeviceInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryServiceIdListByAccountNO_v1_0
     * @param dataObject 参数: custId
     * @return
     */
    public String queryServiceIdListByAccountNO_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * updateAccountCheckResult_v1_0
     * @param dataObject 参数: customerName、customerId、checkResult、cardId
     * @return
     */
    public String updateAccountCheckResult_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * verifyPublicAccountInfo_v1_0
     * @param dataObject 参数: idCard、name
     * @return
     */
    public String verifyPublicAccountInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * whiteListService_v1_0
     * @param dataObject 参数: local_code、phone、type、status
     * @return
     */
    public String whiteListService_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryAssetInfoByServiceId_SAI_v1_0
     * @param dataObject 参数: deviceId
     * @return
     */
    public String queryAssetInfoByServiceId_SAI_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryAssetInfoByServiceId_XML_v1_0
     * @param dataObject 参数: deviceId
     * @return
     */
    public String queryAssetInfoByServiceId_XML_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getCustNum_v1_0
     * @param dataObject 参数: CodeType、CodeValue
     * @return
     */
    public String getCustNum_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * accountAllInfo_v1_0
     * @param dataObject 参数: Consumer、cust_number
     * @return
     */
    public String accountAllInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * DMTKF_ProdAssetList_v1_0
     * @param dataObject 参数: ou_num、Consumer、deal_flg、chk_flg、query_value
     * @return
     */
    public String DMTKF_ProdAssetList_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * bindQueueNum_v1_0
     * @param dataObject 参数: BranchId、QueueNo、SourceType、UserID
     * @return
     */
    public String bindQueueNum_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * ChangeSingleProductPromotion_v1_0
     * @param dataObject 参数: Byzflag、Serialnum
     * @return
     */
    public String changeSingleProductPromotion_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getAllBusinessHallQueInfo_v1_0
     * @param dataObject
     * @return
     */
    public String getAllBusinessHallQueInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * complexCheckEmergencyRecovery_v1_0
     * @param dataObject 参数：customerId、right_code
     * @return
     */
    public String complexCheckEmergencyRecovery_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * complexQueryCreditGrade_v1_0
     * @param dataObject 参数：phone
     * @return
     */
    public String complexQueryCreditGrade_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * complexExeRecoveryRight_v1_0
     * @param dataObject 参数：customerId、orderCode、rightCode
     * @return
     */
    public String complexExeRecoveryRight_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * complexExeZHJTRightAsyn_v1_0
     * @param dataObject 参数：userName、orderCode、userTel、install_addr、deviceMobile、Install_address
     * @return
     */
    public String complexExeZHJTRightAsyn_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * createCRMLocalOrder_v1_0
     * @param dataObject 参数：OrderId、Pack75、DeviceNum、DeviceNum、AccountNum、AccountNum
     * @return
     */
    public String createCRMLocalOrder_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * updateMediaTypeByBPNumber_v2_0
     * 
     * @param dataObject 参数：Address_Name、BP_Number、Bill_Type、Channel、ContactID、Ebill_Phone、Email_Bill_To、Login_Id、Media_Type、SHCT_SMS_Number、SHCT_eBill_SMS_Flag、SMS_FLG、Tax_Number、Tax_Address、 Tax_Phone、Tax_Bank_Name、Tax_Bank_Number
     * @return
     */
    public String updateMediaTypeByBPNumber_v2_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * createPointOrder_v1_0
     * @param dataObject 参数：gitXML、crmid、orderType、totalScore、channel、expressValue、giftId、giftName、changeNumber、giftScoreValue
     * @return
     */
    public String createPointOrder_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * createPointOrder1_v1_0
     * @param dataObject 参数：CrmId、TotalScore、Account、CustomerName、Address、PostCode、Telephone、CustomerArea、gitXML
     * @return
     */
    public String createPointOrder1_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * createPointOrder2_v1_0
     * @param dataObject 参数：CrmId、TotalScore、Account、CustomerName、CardCode、MoneyValue、UseValue、OrganizeCode、PayMethod、Address、PostCode、Telephone、CustomerArea、CrmOrderId、ExpressValue、OrderPrice、gitXML
     * @return
     */
    public String createPointOrder2_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * createPointOrder3_v1_0
     * @param dataObject 参数：CrmId、TotalScore、Account、CustomerName、CardCode、MoneyValue、UseValue、OrganizeCode、PayMethod、Address、PostCode、Telephone、CustomerArea、CrmOrderId、ExpressValue、OrderPrice、gitXML
     * @return
     */
    public String createPointOrder3_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getStatusDetailMethod_v1_0
     * @param dataObject 参数：logisticsOrderNum
     * @return
     */
    public String getStatusDetailMethod_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * entryJFchannelPrizeInfo_v1_0
     * @param dataObject 参数：itemId、itemId、itemType、custName、custTel、custPostcode、custArea、custAddress、custRemark、custQQNum、custCardAccount、custCardPassword、createDate
     * @return
     */
    public String entryJFchannelPrizeInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * exchangeCardByRedPack_v1_0
     * @param dataObject 参数：cardCode、crmId、custel、itemId、money、payMethod、seiralNumber
     * @return
     */
    public String exchangeCardByRedPack_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * exchangePoints_v1_0
     * @param dataObject 参数：deviceId、customerId、ticketCode
     * @return
     */
    public String exchangePoints_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getBalanceTransListByNo_v1_0
     * @param dataObject 参数：navPara
     * @return
     */
    public String getBalanceTransListByNo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getBusinessHallQueInfo_v1_0
     * @param dataObject 参数：BranchId
     * @return
     */
    public String getBusinessHallQueInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getBusinessTypeByBranchId_v1_0
     * @param dataObject 参数：BranchId
     * @return
     */
    public String getBusinessTypeByBranchId_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getCoupon_v1_0
     * @param dataObject 参数：CouponNOLast2Char
     * @return
     */
    public String getCoupon_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getKdYearFeeByBillNo_v1_0
     * @param dataObject 参数：navPara
     * @return
     */
    public String getKdYearFeeByBillNo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getOnlineBusinessHall_v1_0
     * @param dataObject
     * @return
     */
    public String getOnlineBusinessHall_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getPackageFeeNav_v1_0
     * @param dataObject 参数：navPara
     * @return
     */
    public String getPackageFeeNav_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getRemoteQueueNumInfo_v1_0
     * @param dataObject 参数：UserID
     * @return
     */
    public String getRemoteQueueNumInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getRemoteTakeNum_v1_0
     * @param dataObject 参数：UserID、BranchId、BusinessId
     * @return
     */
    public String getRemoteTakeNum_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getVoiceFeeNav_v1_0
     * @param dataObject 参数：navPara
     * @return
     */
    public String getVoiceFeeNav_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * LLWYLucky_v1_0
     * @param dataObject 参数：MSISDN
     * @return
     */
    public String LLWYLucky_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * LTE_SVC80055_BUS80001_M_v1_0
     * @param dataObject 参数：MSISDN、JTStaffCode、SDTransationId、SDType、channel、inputXML
     * @return
     */
    public String LTE_SVC80055_BUS80001_M_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * LTE_SVC80056_BUS80001_M_v1_0
     * @param dataObject 参数：MSISDN、JTStaffCode、SDTransationId、SDType、AccountNbr、AllChargeConfirmFlag、ChargeInfo
     * @return
     */
    public String LTE_SVC80056_BUS80001_M_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * LTE_SVC80058_BUS80001_M_v1_0
     * @param dataObject 参数：MSISDN、JTStaffCode、SDTransationId、accountNumber、orderOptID、orderOptAC、orderProdID、orderProdAC、loginName、part、promotionId、serialNumber、serviceType
     * @return
     */
    public String LTE_SVC80058_BUS80001_M_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * modifyAssetNewOrder_v1_0
     * @param dataObject 参数：interContent、deviceId
     * @return
     */
    public String modifyAssetNewOrder_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * modifyAssetNewOrderAsyn_v1_0
     * @param dataObject 参数：SELECT_DEVICE、orderCode、Promotion_Prod_Id、NEW_SERVICE_STR
     * @return
     */
    public String modifyAssetNewOrderAsyn_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * newCreateAccountAddress_v1_0
     * @param dataObject 参数：custId、addressName、Channel、ContactID、Login_Id
     * @return
     */
    public String newCreateAccountAddress_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * newCreatePublicAccount_v1_0
     * @param dataObject 参数：installUserName,adressParamente,Channel,ContactID,Login_Id,idCard,lianxiPhone
     * @return
     */
    public String newCreatePublicAccount_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * newSingleProductInstallAsyn_v1_0
     * @param dataObject 参数：Consumer、BusCode、ServiceCode、MSGID、LoginId、Channel、ContactID、ContactMethod、AccountNum、rootProduct、packageCode、billAdress、instellAdress、subProduct
     * @return
     */
    public String newSingleProductInstallAsyn_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * orderORQueryFlow_v1_0
     * @param dataObject 参数：contactID、PromotionId、CustomerId、CustomerName、DeviceId、DeviceTypeCD
     * @return
     */
    public String orderORQueryFlow_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * orderORQueryFlowOCS_v1_0
     * @param dataObject 参数：contactID、PromotionId、CustomerId、CustomerName、DeviceId、DeviceTypeCD
     * @return
     */
    public String orderORQueryFlowOCS_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryAddress_v1_0
     * @param dataObject 参数：Channel、adressParamente、ContactID、Login_Id、AddressId、searchRoadName、roadNumfloor
     * @return
     */
    public String queryAddress_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryCallState_v1_0
     * @param dataObject 参数：phone、MID
     * @return
     */
    public String queryCallState_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryCEPCodeByDQInput_v1_0
     * @param dataObject 参数：Account_Number、Serial_Number
     * @return
     */
    public String queryCEPCodeByDQInput_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryListDistunteInfo_v1_0
     * @param dataObject 参数：orderId
     * @return
     */
    public String queryListDistunteInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getPackageDetailsPost_v1_0
     * @param dataObject 参数：phone、count
     * 
     * @return
     */
    public String getPackageDetailsPost_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryPointsBasicInfo_v1_0
     * @param dataObject 参数：customerId、contactID
     * 
     * @return
     */
    public String queryPointsBasicInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryProdAssetBasicInfo_v1_0
     * @param dataObject 参数：deviceId
     * 
     * @return
     */
    public String queryProdAssetBasicInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryPrepayAmount_v1_0
     * @param dataObject 参数：phone、type
     * 
     * @return
     */
    public String queryPrepayAmount_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryPromInfoByServiceId_v1_0
     * @param dataObject 参数：phone、orderCode
     * 
     * @return
     */
    public String queryPromInfoByServiceId_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryRatableFlowPresentDetail_v1_0
     * @param dataObject 参数：PRESENT_TYPE、PRESENT_TYPE、START_TIME、END_TIME
     * @return
     */
    public String queryRatableFlowPresentDetail_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryRedPackCountNumByCrmId_v1_0
     * @param dataObject 参数：crmId
     * @return
     */
    public String queryRedPackCountNumByCrmId_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryRedPackIdAndName_v1_0
     * @param dataObject 参数：crmId
     * @return
     */
    public String queryRedPackIdAndName_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryRedPackListByCrmId_v1_0
     * @param dataObject 参数：crmId
     * @return
     */
    public String queryRedPackListByCrmId_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryRightHis_v1_0
     * @param dataObject 参数：customerId、deviceId
     * @return
     */
    public String queryRightHis_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * querySerialnbrListByBPnbr_v1_0
     * @param dataObject 参数：accountName
     * 
     * @return
     */
    public String querySerialnbrListByBPnbr_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryStarCustRank_v1_0
     * @param dataObject 参数：deviceId
     * 
     * @return
     */
    public String queryStarCustRank_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryStarCustRight_v1_0
     * @param dataObject 参数：customerId、qyCode
     * 
     * @return
     */
    public String queryStarCustRight_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * querySubsInstQrySV_v1_0
     * @param dataObject 参数：ProductNo
     * 
     * @return
     */
    public String querySubsInstQrySV_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryMyPoints_v1_0
     * @param dataObject 参数：deviceId、customerId
     * 
     * @return
     */
    public String queryMyPoints_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * searchWastePoints_v1_0
     * @param dataObject 参数：crmId
     * 
     * @return
     */
    public String searchWastePoints_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * statusQueryService_v1_0
     * @param dataObject 参数：local_code、type、phone
     * 
     * @return
     */
    public String statusQueryService_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * subscribeReqSV_v1_0
     * @param dataObject 参数：ProductNo、ProductNo、ProductOfferType
     * 
     * @return
     */
    public String subscribeReqSV_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * validateCampaign_v1_0
     * @param dataObject 参数：promotionId、serviceId
     * @return
     */
    public String validateCampaign_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * iPTVUsedDaysQuery_v1_0
     * @param dataObject 参数：ADName、AgentID、ChargeMonth
     * 
     * @return
     */
    public String iPTVUsedDaysQuery_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * IPTVCurOrdersQuery_v1_0
     * @param dataObject 参数：ADName、AgentID
     * @return
     */
    public String iPTVCurOrdersQuery_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * iPTVHstOrdersQuery_v1_0
     * @param dataObject 参数：ADName、AgentID、ChargeMonth
     * 
     * @return
     */
    public String iPTVHstOrdersQuery_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * iPTVVODDetailQuery_v1_0
     * @param dataObject 参数：ADName、AgentID、OrderTime、ProductID
     * 
     * @return
     */
    public String iPTVVODDetailQuery_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * iPTVUnsubscribe_v1_0
     * @param dataObject 参数：ADName、AgentID、OrderTime、ProductID
     * 
     * @return
     */
    public String iPTVUnsubscribe_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * iPTVProductQuery_v1_0
     * @param dataObject 参数：ADName、AgentID
     * 
     * @return
     */
    public String iPTVProductQuery_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * iPTVSubscribe_v1_0
     * @param dataObject 参数：ADName、AgentID、PurchaseMode、ProductID
     * @return
     */
    public String iPTVSubscribe_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryMaxSpeedByServiceId_v1_0
     * @param dataObject 参数：address_full、globalserviceid
     * @return
     */
    public String queryMaxSpeedByServiceId_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryUsedRedPackDetail_v1_0
     * @param dataObject 参数：crmId、tel、packagelistid
     * @return
     */
    public String queryUsedRedPackDetail_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryTokenUrl_v1_0
     * @param dataObject 参数：ProductNo
     * @return
     */
    public String queryTokenUrl_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryCouponInfoByNO_v1_0
     * @param dataObject 参数：couponCode
     * @return
     */
    public String queryCouponInfoByNO_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryDeviceListByadnbr_v1_0
     * @param dataObject 参数：resDate
     * @return
     */
    public String queryDeviceListByadnbr_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryDLJSInfo_v1_0
     * @param dataObject
     * @return
     */
    public String queryDLJSInfo_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryEFPInvoice_v1_0
     * @param dataObject 参数：sellUnitCode、orderNo、queryWay、invoiceCode、invoiceNo、devcNo、accountMonth
     * @return
     */
    public String queryEFPInvoice_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryExeRightRecord_v1_0
     * @param dataObject 参数：cust_code、right_code、query_type、service_id
     * @return
     */
    public String queryExeRightRecord_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryFreeFlowValueByServiceNum_v1_0
     * @param dataObject 参数：I_SERVICE_NBR
     * @return
     */
    public String queryFreeFlowValueByServiceNum_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryGrantBalance_v1_0
     * @param dataObject 参数：selectPhone
     * @return
     */
    public String queryGrantBalance_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryGroupPackageUse_v1_0
     * @param dataObject 参数：ofrInstanceId、billingCycle、queryFlag、desAttr、accNbr
     * @return
     */
    public String queryGroupPackageUse_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryHisFlue_v1_0
     * @param dataObject 参数：ifUser、ifPass、accountNbr、date
     * @return
     */
    public String queryHisFlue_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryICCIDChangeLog_v1_0
     * @param dataObject 参数：phone、iccdCode
     * @return
     */
    public String queryICCIDChangeLog_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryJFItemStorageByItemId_v1_0
     * @param dataObject 参数：itemId
     * @return
     */
    public String queryJFItemStorageByItemId_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryKDKXCardSale_v1_0
     * @param dataObject 参数：agencyName、cardValue、orderCode、storeName、cardsubType、accountID
     * @return
     */
    public String queryKDKXCardSale_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryListDetailByListId_v1_0
     * @param dataObject 参数：listId
     * @return
     */
    public String queryListDetailByListId_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryListPageByCrmId_v1_0
     * @param dataObject 参数：crmId、currentPage、pageSize、startDate、endDate
     * @return
     */
    public String queryListPageByCrmId_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOrderInforByOrderNumber_v1_0
     * @param dataObject 参数：orderNum
     * @return
     */
    public String queryOrderInforByOrderNumber_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOrderInforByServiceId_v1_0
     * @param dataObject 参数：service_Id
     * @return
     */
    public String queryOrderInforByServiceId_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOrderListByAccountNumber_v1_0
     * @param dataObject 参数：custId、channel、ContactID、Login_Id、Order_Date
     * @return
     */
    public String queryOrderListByAccountNumber_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOrderNumByMSGID_v1_0
     * @param dataObject 参数：orderCode
     * @return
     */
    public String queryOrderNumByMSGID_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOWEByAccountName_v1_0
     * @param dataObject 参数：Account_Name、Channel、ContactID、Login_Id、Identification_Number
     * @return
     */
    public String queryOWEByAccountName_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryPaymentRecharge_v1_0
     * @param dataObject 参数：AccNbr、BeginDate、EndDate
     * @return
     */
    public String queryPaymentRecharge_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryPointCosumeHistory_v1_0
     * @param dataObject 参数：crmid
     * @return
     */
    public String queryPointCosumeHistory_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryRedPackBalRefund_v1_0
     * @param dataObject 参数：ServiceNbr、Month
     * @return
     */
    public String queryRedPackBalRefund_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryStarHis_v1_0
     * @param dataObject 参数：cust_code
     * @return
     */
    public String queryStarHis_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryStarSalesChangeHis_v1_0
     * @param dataObject 参数：cust_code
     * @return
     */
    public String queryStarSalesChangeHis_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * receiptReprintRequest_v1_0
     * @param dataObject 参数：requestID、billCode
     * @return
     */
    public String receiptReprintRequest_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * returnKDKXCard_v1_0
     * @param dataObject 参数：orderseqTranseq
     * @return
     */
    public String returnKDKXCard_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * selfhelpReset_v1_0
     * @param dataObject 参数：phone
     * @return
     */
    public String selfhelpReset_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * sendEFPInvoiceSMSByFPH_v1_0
     * @param dataObject 参数：smsEmail、sellUnitCode、FPHM、FPDM
     * @return
     */
    public String sendEFPInvoiceSMSByFPH_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * webQueryPromInfoByServiceId_v1_0
     * @param dataObject 参数：selectDevice
     * @return
     */
    public String webQueryPromInfoByServiceId_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * getMonthlyRentFeeNav_v1_0
     * @param dataObject 参数：navPara
     * @return
     */
    public String getMonthlyRentFeeNav_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOrderNumByMSGID2_v2_0
     * @param dataObject 参数：orderCode
     * @return
     */
    public String queryOrderNumByMSGID2_v2_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryOrderNumByMSGID2_v3_0
     * @param dataObject 参数：orderCode
     * @return
     */
    public String queryOrderNumByMSGID3_v3_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * verifyPublicAccountInfo2_v2_0
     * @param dataObject 参数：userName、contactID、phone
     * @return
     */
    public String verifyPublicAccountInfo2_v2_0(String openId, String deviceNum, String orderCode, String requestClass,
        String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }


    /**
     * queryCreditCoupon_v1_0
     * 
     * @param dataObject 参数：deviceId
     * @return
     */
    public String queryCreditCoupon_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject){
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * queryOrderListByAccountNumber2_v2_0
     * 
     * @param dataObject 参数：custId、orderNumber、orderNumber
     * @return
     */
    public String queryOrderListByAccountNumber2_v2_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject){
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * queryOrOccupyOrReleaseCDMANumByIDNum_v1_0
     * 
     * @param dataObject 参数：vi_part_number、vi_order_num、vi_order_oper、vi_operation_type、vi_ID_TYPE、vi_ID_NUM、vi_tel、vi_request_id、vi_salesgroupno
     * @return
     */
    public String queryOrOccupyOrReleaseCDMANumByIDNum_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject){
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * queryTnsJt_v1_0
     * 
     * @param dataObject 
     * @return
     */
    public String queryTnsJt_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject){
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * complexOccupyCDMANumByIDNum_v1_0
     * 
     * @param dataObject 参数：cardId、cardId
     * @return
     */
    public String complexOccupyCDMANumByIDNum_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject){
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * checkYZWHByIDNum_v1_0
     * 
     * @param dataObject 参数：checkYZWHByIDNum、idNum、loginId
     * @return
     */
    public String checkYZWHByIDNum_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject){
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * diagnoseRoaming_v1_0
     * 
     * @param dataObject 参数：deviceNumber、consumer
     * @return
     */
    public String diagnoseRoaming_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * diagnoseMobileTrafficDispute_v1_0
     * 
     * @param dataObject 参数：deviceNumber、consumer、date
     * @return
     */
    public String diagnoseMobileTrafficDispute_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * diagnoseComprehensiveCosts_v1_0
     * 
     * @param dataObject 参数：deviceNumber、consumer
     * @return
     */
    public String diagnoseComprehensiveCosts_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * LTE_SVC80055_BUS80001_M_GUOMAN_v1_0
     * 
     * @param dataObject 参数：SDTransationId、AccountNumber、orderProdID、orderProdPropName、orderProdAC、serialNumber
     * @return
     */
    public String LTE_SVC80055_BUS80001_M_GUOMAN_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * LTE_SVC80056_BUS80001_M_GUOMAN_v1_0
     * 
     * @param dataObject 参数：AccountNumber、ActionCD、SDTransationId、ProdNum、PromId、RootProdNum、ServiceNumber
     * @return
     */
    public String LTE_SVC80056_BUS80001_M_GUOMAN_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * LTE_SVC80058_BUS80001_M_GUOMAN_v1_0
     * 
     * @param dataObject 参数：SDTransationId、AccountNumber、AdjType、ProdName、ProdNeedPayFlg、ProdNum、RePriceFlag、RootProdNum、SN、SPName、SPNeedPayFlg、SPNum、TaxName、TaxRate、TaxSysId、SPSource、SPShowFlg、SPReadOnlyFlg、EXT_ACCT_ITEM_ID、ORDER_ITEM_ID、ACCT_ITEM_TYPE_ID、JT_TAX、JT_TAX_RATE、PAYMENT_METHOD_CD、CURRENCY、ATTR_140000020、ATTR_140000021、
     * @return
     */
    public String LTE_SVC80058_BUS80001_M_GUOMAN_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

        
    /**
     * queryPrepaymentInfo_v1_0
     * 
     * @param dataObject 参数：accountNo
     * @return
     */
    public String queryPrepaymentInfo_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }

    /**
     * queryCustInfoByCustNumSelfBroadband_v1_0
     * 
     * @param dataObject 参数：custId
     * @return
     */
    public String queryCustInfoByCustNumSelfBroadband_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }
    
    /**
     * complexElectronicInvoiceData_v1_0
     * 
     * @param dataObject 参数：request_seq、args_type、oper_type、input_no、bill_month、csr_id、csr_name、channel、email
     * @return
     */
    public String complexElectronicInvoiceData_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }
    
    /**
     * judgeBillNewOROld_v1_0
     * 
     * @param dataObject 参数：accountNumber、month
     * @return
     */
    public String judgeBillNewOROld_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }
    
    /**
     * printNewInvoice_v1_0
     * 
     * @param dataObject 参数：accountNumber、month
     * @return
     */
    public String printNewInvoice_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }

    /**
     * printSGWInvoice_v1_0
     * 
     * @param dataObject 参数：accountNumber、month
     * @return
     */
    public String printSGWInvoice_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }

    /**
     * accountInfo_v1_0
     * 
     * @param dataObject 参数：accountNumber
     * @return
     */
    public String accountInfo_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }
    
    /**
     * createPointOrderRedPack_v1_0
     * 
     * @param dataObject 参数：CrmId, TotalScore,Account、 CustomerName、Address、PostCode、Telephone、 CustomerArea、ExpressValue、GiftId、GiftName、ChangeNumber、
     * ScoreValue、CardCode、MoneyValue、UseValue、PayMethod
     * @return
     */
    public String createPointOrderRedPack_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }
     
     
         /**
     * createPointOrderRedPackup_v1_0
     * 
     * @param dataObject 参数：CrmId, TotalScore,Account、 CustomerName、Address、PostCode、Telephone、 CustomerArea、ExpressValue、GiftId、GiftName、ChangeNumber、
     * ScoreValue、CardCode、MoneyValue、UseValue、PayMethod
     * @return
     */
    public String createPointOrderRedPackup_v1_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);    
    }
    
    /**
     * queryPromAssetInforByAccountNum_v3_0
     * 
     * @param dataObject 参数：Account_Num
     * @return
     */
    public String queryPromAssetInforByAccountNum_v3_0(String openId, String deviceNum, String orderCode,
        String requestClass, String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
            deviceNum, orderCode, requestClass, requestMethod, dataObject);  
    }
    
    /**
    * checkIsBound_v1_0
    * 
    * @param dataObject 参数：group_openid、group_openid、group_openid
    * @return
    */
   public String checkIsBound_v1_0(String openId, String deviceNum, String orderCode,
       String requestClass, String requestMethod, Map<String, Object> dataObject) {
       return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
           deviceNum, orderCode, requestClass, requestMethod, dataObject);  
   }

    /**
    * checkIsFocus_v1_0
    * 
    * @param dataObject 参数：group_openid、group_openid、group_openid
    * @return
    */
   public String checkIsFocus_v1_0(String openId, String deviceNum, String orderCode,
       String requestClass, String requestMethod, Map<String, Object> dataObject){
       return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
           deviceNum, orderCode, requestClass, requestMethod, dataObject);  
   }

   /**
    * doBound_v1_0
    * 
    * @param dataObject 参数：group_openid、group_openid、group_openid、phone
    * @return
    */
   public String doBound_v1_0(String openId, String deviceNum, String orderCode,
       String requestClass, String requestMethod, Map<String, Object> dataObject){
       return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
           deviceNum, orderCode, requestClass, requestMethod, dataObject);  
   }
       
   /**
    * customerNbr_v1_0
    * 
    * @param dataObject 参数：serial_num
    * @return
    */
   public String customerNbr_v1_0(String openId, String deviceNum, String orderCode,
       String requestClass, String requestMethod, Map<String, Object> dataObject){
       return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
           deviceNum, orderCode, requestClass, requestMethod, dataObject);  
   }

   /**
    * erpGetFilesState_v1_0
    * 
    * @param dataObject 参数：orderNo
    * @return
    */
public String erpGetFilesState_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}


/**
 * CRM接口重构接口
 */
/**
 * capCustomer_v1_0
 * 
 * @param dataObject 参数：custNumber
 * @return
 */
public String capCustomer_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * capAccount_v1_0
 * 
 * @param dataObject 参数：acctCd
 * @return
 */
public String capAccount_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * dmtkfProdAssetList_v1_0
 * 
 * @param dataObject 参数：ouNum,dealFlg,chkFlg,querValue
 * @return
 */
public String dmtkfProdAssetList_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * customerNbrEop_v1_0
 * 
 * @param dataObject 参数：accNum
 * @return
 */
public String customerNbrEop_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * assetInfoByServiceIdSal_v1_0
 * 
 * @param dataObject 参数：accNum
 * @return
 */
public String assetInfoByServiceIdSal_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * verifyPublicAccountInfoEop_v1_0
 * 
 * @param dataObject 参数：certNum,certType,custName,acctNum
 * @return
 */
public String verifyPublicAccountInfoEop_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * bpnbrListBySerialnbr_v1_0
 * 
 * @param dataObject 参数：accNum
 * @return
 */
    public String bpnbrListBySerialnbr_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * customerOrderList_v1_0
 * 
 * @param dataObject 参数：addressDesc,addressId,certAddr,certNum,certType,contactCert,contactCertType,
 *                       contactPerson,contactPhone,createDate,createOrgId,createPost,createStaff,custId,
 *                       custName,custOrderNbr,custType,customSubType,email,image,nationality,individualId,
 *                       phone,regionId,remark,sysSource,partyId,contactId,partyCertId,isReadCard,addrMod
 * @return
 */
public String customerOrderList_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}
   
/**
 * optPackagePromotionCompletion_v1_0
 * 
 * @return
 */
public String optPackagePromotionCompletion_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}


/**
 * functionalProductsCompletion_v1_0
 * 
 * @return
 */
public String functionalProductsCompletion_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * NewCreateAccountAddressEop_v1_0
 * 
 * @param dataObject 参数：custId,addrName,addrId,createStaff,primaryFlag
 * @return
 */
public String NewCreateAccountAddressEop_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * customerOrderEop_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String customerOrderEop_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * cepCodeByAccNOORSerNO_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String cepCodeByAccNOORSerNO_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * deviceInfoEop_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String deviceInfoEop_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * queryorderhistorybycustIDaccnum_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String queryorderhistorybycustIDaccnum_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * queryOrderDetail_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String queryOrderDetail_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}


/**
 * promInfoByServiceId_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String promInfoByServiceId_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}
/**
 * serviceIdListByAccountNO_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String serviceIdListByAccountNO_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}
/**
 * smartHomeSerialNo_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String smartHomeSerialNo_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * capInvFormatCustomerizeRel_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String capInvFormatCustomerizeRel_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * specialList_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String specialList_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * previewOrder_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String previewOrder_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * queryAddressForWebNew_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String queryAddressForWebNew_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * externalCustomer_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String externalCustomer_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

/**
 * assetInfoByServiceId_v1_0
 * 
 * @param dataObject 参数：
 * @return
 */
public String assetInfoByServiceId_v1_0(String openId, String deviceNum,
		String orderCode, String requestClass, String requestMethod,
		Map<String, Object> dataObject) {
	return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
	           deviceNum, orderCode, requestClass, requestMethod, dataObject);
}

    @Override
    public String checkRealName_v1_0(String openId, String deviceNum, String orderCode, String requestClass,
                                     String requestMethod, Map<String, Object> dataObject) {
        return jsonToDataObject.getDataObject(Thread.currentThread().getStackTrace()[1].getMethodName(), openId,
                deviceNum, orderCode, requestClass, requestMethod, dataObject);
    }
}


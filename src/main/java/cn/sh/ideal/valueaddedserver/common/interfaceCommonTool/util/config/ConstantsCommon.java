package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.config;

import org.springframework.stereotype.Component;


/**
 * 
 * 接口公共Common常量类 ClassName: Constants <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年7月2日 下午5:26:03 <br/>
 *
 * @author 振鹏
 * @version
 */
@Component
public class ConstantsCommon {

    // 配置接口调用渠道名称
    public static final String request_Channel = ConfigProperties.getProperty("request_Channel");
    
    // 配置动态获取接口配置默认值
    public static String value = "nullValue";
    
    
    /**
     * 动态获取接口配置信息
     * @param constantsCommonName
     * @return
     */
    public static  String getValue(String constantsCommonName){
        value = ConfigProperties.getProperty(constantsCommonName);
        return value;
         
    }

    /**
     * 配置queryBalanceEasyCheck_v1_0接口信息
     */
    // queryBalanceEasyCheck_v1_0接口名称
    public static final String queryBalanceEasyCheck_Name_v1_0 = ConfigProperties.getProperty("queryBalanceEasyCheck_Name_v1_0");
    // queryBalanceEasyCheck_v1_0接口方法名
    public static final String queryBalanceEasyCheck_Method_v1_0 = ConfigProperties.getProperty("queryBalanceEasyCheck_Method_v1_0");
    // queryBalanceEasyCheck_v1_0接口url
    public static final String queryBalanceEasyCheckURL_v1_0 = ConfigProperties.getProperty("queryBalanceEasyCheckURL_v1_0");
    // queryBalanceEasyCheck_v1_0接口版本号
    public static final String queryBalanceEasyCheck_version_v1_0 = ConfigProperties.getProperty("queryBalanceEasyCheck_version_v1_0");
    // queryBalanceEasyCheck_v1_0接口认证秘钥
    public static final String queryBalanceEasyCheck_AKEY_v1_0 = ConfigProperties.getProperty("queryBalanceEasyCheck_AKEY_v1_0");

    /**
     * 配置blackListService_v1_0接口信息
     */
    // blackListService_v1_0接口名称
    public static final String blackListService_Name_v1_0 = ConfigProperties.getProperty("blackListService_Name_v1_0");
    // blackListService_v1_0接口方法名
    public static final String blackListService_Method_v1_0 = ConfigProperties.getProperty("blackListService_Method_v1_0");
    // blackListService_v1_0接口url
    public static final String blackListServiceURL_v1_0 = ConfigProperties.getProperty("blackListServiceURL_v1_0");
    // blackListService_v1_0接口版本号
    public static final String blackListService_version_v1_0 = ConfigProperties.getProperty("blackListService_version_v1_0");
    // blackListService_v1_0接口认证秘钥
    public static final String blackListService_AKEY_v1_0 = ConfigProperties.getProperty("blackListService_AKEY_v1_0");

    /**
     * 配置checkIdService_v1_0接口信息
     */
    // checkIdService_v1_0接口名称
    public static final String checkIdService_Name_v1_0 = ConfigProperties.getProperty("checkIdService_Name_v1_0");
    // checkIdService_v1_0接口方法名
    public static final String checkIdService_Method_v1_0 = ConfigProperties.getProperty("checkIdService_Method_v1_0");
    // checkIdService_v1_0接口url
    public static final String checkIdServiceURL_v1_0 = ConfigProperties.getProperty("checkIdServiceURL_v1_0");
    // checkIdService_v1_0接口版本号
    public static final String checkIdService_version_v1_0 = ConfigProperties.getProperty("checkIdService_version_v1_0");
    // checkIdService_v1_0接口认证秘钥
    public static final String checkIdService_AKEY_v1_0 = ConfigProperties.getProperty("checkIdService_AKEY_v1_0");

    /**
     * 配置complexOrderORQueryFlow_v1_0接口信息
     */
    // complexOrderORQueryFlow_v1_0接口名称
    public static final String complexOrderORQueryFlow_Name_v1_0 = ConfigProperties.getProperty("complexOrderORQueryFlow_Name_v1_0");
    // complexOrderORQueryFlow_v1_0接口方法名
    public static final String complexOrderORQueryFlow_Method_v1_0 = ConfigProperties.getProperty("complexOrderORQueryFlow_Method_v1_0");
    // complexOrderORQueryFlow_v1_0接口url
    public static final String complexOrderORQueryFlowURL_v1_0 = ConfigProperties.getProperty("complexOrderORQueryFlowURL_v1_0");
    // complexOrderORQueryFlow_v1_0接口版本号
    public static final String complexOrderORQueryFlow_version_v1_0 = ConfigProperties.getProperty("complexOrderORQueryFlow_version_v1_0");
    // complexOrderORQueryFlow_v1_0接口认证秘钥
    public static final String complexOrderORQueryFlow_AKEY_v1_0 = ConfigProperties.getProperty("complexOrderORQueryFlow_AKEY_v1_0");

    /**
     * 配置sendFlowManagementOrder_v1_0接口信息
     */
    // sendFlowManagementOrder_v1_0接口名称
    public static final String sendFlowManagementOrder_Name_v1_0 = ConfigProperties.getProperty("sendFlowManagementOrder_Name_v1_0");
    // sendFlowManagementOrder_v1_0接口方法名
    public static final String sendFlowManagementOrder_Method_v1_0 = ConfigProperties.getProperty("sendFlowManagementOrder_Method_v1_0");
    // sendFlowManagementOrder_v1_0接口url
    public static final String sendFlowManagementOrderURL_v1_0 = ConfigProperties.getProperty("sendFlowManagementOrderURL_v1_0");
    // sendFlowManagementOrder_v1_0接口版本号
    public static final String sendFlowManagementOrder_version_v1_0 = ConfigProperties.getProperty("sendFlowManagementOrder_version_v1_0");
    // sendFlowManagementOrder_v1_0接口认证秘钥
    public static final String sendFlowManagementOrder_AKEY_v1_0 = ConfigProperties.getProperty("sendFlowManagementOrder_AKEY_v1_0");

    /**
     * 配置complexPackageUse_v1_0接口信息
     */
    // complexPackageUse_v1_0接口名称
    public static final String complexPackageUse_Name_v1_0 = ConfigProperties.getProperty("complexPackageUse_Name_v1_0");
    // complexPackageUse_v1_0接口方法名
    public static final String complexPackageUse_Method_v1_0 = ConfigProperties.getProperty("complexPackageUse_Method_v1_0");
    // complexPackageUse_v1_0接口url
    public static final String complexPackageUseURL_v1_0 = ConfigProperties.getProperty("complexPackageUseURL_v1_0");
    // complexPackageUse_v1_0接口版本号
    public static final String complexPackageUse_version_v1_0 = ConfigProperties.getProperty("complexPackageUse_version_v1_0");
    // complexPackageUse_v1_0接口认证秘钥
    public static final String complexPackageUse_AKEY_v1_0 = ConfigProperties.getProperty("complexPackageUse_AKEY_v1_0");

    /**
     * 配置queryAccountAllInfoByAccountNO_v1_0接口信息
     */
    // queryAccountAllInfoByAccountNO_v1_0接口名称
    public static final String queryAccountAllInfoByAccountNO_Name_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO_Name_v1_0");
    // queryAccountAllInfoByAccountNO_v1_0接口方法名
    public static final String queryAccountAllInfoByAccountNO_Method_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO_Method_v1_0");
    // queryAccountAllInfoByAccountNO_v1_0接口url
    public static final String queryAccountAllInfoByAccountNOURL_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNOURL_v1_0");
    // queryAccountAllInfoByAccountNO_v1_0接口版本号
    public static final String queryAccountAllInfoByAccountNO_version_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO_version_v1_0");
    // queryAccountAllInfoByAccountNO_v1_0接口认证秘钥
    public static final String queryAccountAllInfoByAccountNO_AKEY_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO_AKEY_v1_0");

    /**
     * 配置queryAccountAllInfoByAccountNO4_v1_0接口信息
     */
    // queryAccountAllInfoByAccountNO4_v1_0接口名称
    public static final String queryAccountAllInfoByAccountNO4_Name_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO4_Name_v1_0");
    // queryAccountAllInfoByAccountNO4_v1_0接口方法名
    public static final String queryAccountAllInfoByAccountNO4_Method_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO4_Method_v1_0");
    // queryAccountAllInfoByAccountNO4_v1_0接口url
    public static final String queryAccountAllInfoByAccountNO4URL_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO4URL_v1_0");
    // queryAccountAllInfoByAccountNO4_v1_0接口版本号
    public static final String queryAccountAllInfoByAccountNO4_version_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO4_version_v1_0");
    // queryAccountAllInfoByAccountNO4_v1_0接口认证秘钥
    public static final String queryAccountAllInfoByAccountNO4_AKEY_v1_0 = ConfigProperties.getProperty("queryAccountAllInfoByAccountNO4_AKEY_v1_0");

    /**
     * 配置queryAcctnbrBySerialnbr_v1_0接口信息
     */
    // queryAcctnbrBySerialnbr_v1_0接口名称
    public static final String queryAcctnbrBySerialnbr_Name_v1_0 = ConfigProperties.getProperty("queryAcctnbrBySerialnbr_Name_v1_0");
    // queryAcctnbrBySerialnbr_v1_0接口方法名
    public static final String queryAcctnbrBySerialnbr_Method_v1_0 = ConfigProperties.getProperty("queryAcctnbrBySerialnbr_Method_v1_0");
    // queryAcctnbrBySerialnbr_v1_0接口url
    public static final String queryAcctnbrBySerialnbrURL_v1_0 = ConfigProperties.getProperty("queryAcctnbrBySerialnbrURL_v1_0");
    // queryAcctnbrBySerialnbr_v1_0接口版本号
    public static final String queryAcctnbrBySerialnbr_version_v1_0 = ConfigProperties.getProperty("queryAcctnbrBySerialnbr_version_v1_0");
    // queryAcctnbrBySerialnbr_v1_0接口认证秘钥
    public static final String queryAcctnbrBySerialnbr_AKEY_v1_0 = ConfigProperties.getProperty("queryAcctnbrBySerialnbr_AKEY_v1_0");

    /**
     * 配置queryBPInfoByBPNum_v1_0接口信息
     */
    // queryBPInfoByBPNum_v1_0接口名称
    public static final String queryBPInfoByBPNum_Name_v1_0 = ConfigProperties.getProperty("queryBPInfoByBPNum_Name_v1_0");
    // queryBPInfoByBPNum_v1_0接口方法名
    public static final String queryBPInfoByBPNum_Method_v1_0 = ConfigProperties.getProperty("queryBPInfoByBPNum_Method_v1_0");
    // queryBPInfoByBPNum_v1_0接口url
    public static final String queryBPInfoByBPNumURL_v1_0 = ConfigProperties.getProperty("queryBPInfoByBPNumURL_v1_0");
    // queryBPInfoByBPNum_v1_0接口版本号
    public static final String queryBPInfoByBPNum_version_v1_0 = ConfigProperties.getProperty("queryBPInfoByBPNum_version_v1_0");
    // queryBPInfoByBPNum_v1_0接口认证秘钥
    public static final String queryBPInfoByBPNum_AKEY_v1_0 = ConfigProperties.getProperty("queryBPInfoByBPNum_AKEY_v1_0");

    /**
     * 配置queryBPnbrListBySerialnbr_v1_0接口信息
     */
    // queryBPnbrListBySerialnbr_v1_0接口名称
    public static final String queryBPnbrListBySerialnbr_Name_v1_0 = ConfigProperties.getProperty("queryBPnbrListBySerialnbr_Name_v1_0");
    // queryBPnbrListBySerialnbr_v1_0接口方法名
    public static final String queryBPnbrListBySerialnbr_Method_v1_0 = ConfigProperties.getProperty("queryBPnbrListBySerialnbr_Method_v1_0");
    // queryBPnbrListBySerialnbr_v1_0接口url
    public static final String queryBPnbrListBySerialnbrURL_v1_0 = ConfigProperties.getProperty("queryBPnbrListBySerialnbrURL_v1_0");
    // queryBPnbrListBySerialnbr_v1_0接口版本号
    public static final String queryBPnbrListBySerialnbr_version_v1_0 = ConfigProperties.getProperty("queryBPnbrListBySerialnbr_version_v1_0");
    // queryBPnbrListBySerialnbr_v1_0接口认证秘钥
    public static final String queryBPnbrListBySerialnbr_AKEY_v1_0 = ConfigProperties.getProperty("queryBPnbrListBySerialnbr_AKEY_v1_0");

    /**
     * 配置queryCustInfoByCustNum_v2_0接口信息
     */
    // queryCustInfoByCustNum_v2_0接口名称
    public static final String queryCustInfoByCustNum_Name_v2_0 = ConfigProperties.getProperty("queryCustInfoByCustNum_Name_v2_0");
    // queryCustInfoByCustNum_v2_0接口方法名
    public static final String queryCustInfoByCustNum_Method_v2_0 = ConfigProperties.getProperty("queryCustInfoByCustNum_Method_v2_0");
    // queryCustInfoByCustNum_v2_0接口url
    public static final String queryCustInfoByCustNumURL_v2_0 = ConfigProperties.getProperty("queryCustInfoByCustNumURL_v2_0");
    // queryCustInfoByCustNum_v2_0接口版本号
    public static final String queryCustInfoByCustNum_version_v2_0 = ConfigProperties.getProperty("queryCustInfoByCustNum_version_v2_0");
    // queryCustInfoByCustNum_v2_0接口认证秘钥
    public static final String queryCustInfoByCustNum_AKEY_v2_0 = ConfigProperties.getProperty("queryCustInfoByCustNum_AKEY_v2_0");

    /**
     * 配置queryDeviceInfo_v1_0接口信息
     */
    // queryDeviceInfo_v1_0接口名称
    public static final String queryDeviceInfo_Name_v1_0 = ConfigProperties.getProperty("queryDeviceInfo_Name_v1_0");
    // queryDeviceInfo_v1_0接口方法名
    public static final String queryDeviceInfo_Method_v1_0 = ConfigProperties.getProperty("queryDeviceInfo_Method_v1_0");
    // queryDeviceInfo_v1_0接口url
    public static final String queryDeviceInfoURL_v1_0 = ConfigProperties.getProperty("queryDeviceInfoURL_v1_0");
    // queryDeviceInfo_v1_0接口版本号
    public static final String queryDeviceInfo_version_v1_0 = ConfigProperties.getProperty("queryDeviceInfo_version_v1_0");
    // queryDeviceInfo_v1_0接口认证秘钥
    public static final String queryDeviceInfo_AKEY_v1_0 = ConfigProperties.getProperty("queryDeviceInfo_AKEY_v1_0");

    /**
     * 配置queryServiceIdListByAccountNO_v1_0接口信息
     */
    // queryServiceIdListByAccountNO_v1_0接口名称
    public static final String queryServiceIdListByAccountNO_Name_v1_0 = ConfigProperties.getProperty("queryServiceIdListByAccountNO_Name_v1_0");
    // queryServiceIdListByAccountNO_v1_0接口方法名
    public static final String queryServiceIdListByAccountNO_Method_v1_0 = ConfigProperties.getProperty("queryServiceIdListByAccountNO_Method_v1_0");
    // queryServiceIdListByAccountNO_v1_0接口url
    public static final String queryServiceIdListByAccountNOURL_v1_0 = ConfigProperties.getProperty("queryServiceIdListByAccountNOURL_v1_0");
    // queryServiceIdListByAccountNO_v1_0接口版本号
    public static final String queryServiceIdListByAccountNO_version_v1_0 = ConfigProperties.getProperty("queryServiceIdListByAccountNO_version_v1_0");
    // queryServiceIdListByAccountNO_v1_0接口认证秘钥
    public static final String queryServiceIdListByAccountNO_AKEY_v1_0 = ConfigProperties.getProperty("queryServiceIdListByAccountNO_AKEY_v1_0");

    /**
     * 配置updateAccountCheckResult_v1_0接口信息
     */
    // updateAccountCheckResult_v1_0接口名称
    public static final String updateAccountCheckResult_Name_v1_0 = ConfigProperties.getProperty("updateAccountCheckResult_Name_v1_0");
    // updateAccountCheckResult_v1_0接口方法名
    public static final String updateAccountCheckResult_Method_v1_0 = ConfigProperties.getProperty("updateAccountCheckResult_Method_v1_0");
    // updateAccountCheckResult_v1_0接口url
    public static final String updateAccountCheckResultURL_v1_0 = ConfigProperties.getProperty("updateAccountCheckResultURL_v1_0");
    // updateAccountCheckResult_v1_0接口版本号
    public static final String updateAccountCheckResult_version_v1_0 = ConfigProperties.getProperty("updateAccountCheckResult_version_v1_0");
    // updateAccountCheckResult_v1_0接口认证秘钥
    public static final String updateAccountCheckResult_AKEY_v1_0 = ConfigProperties.getProperty("updateAccountCheckResult_AKEY_v1_0");

    /**
     * 配置verifyPublicAccountInfo_v1_0接口信息
     */
    // verifyPublicAccountInfo_v1_0接口名称
    public static final String verifyPublicAccountInfo_Name_v1_0 = ConfigProperties.getProperty("verifyPublicAccountInfo_Name_v1_0");
    // verifyPublicAccountInfo_v1_0接口方法名
    public static final String verifyPublicAccountInfo_Method_v1_0 = ConfigProperties.getProperty("verifyPublicAccountInfo_Method_v1_0");
    // verifyPublicAccountInfo_v1_0接口url
    public static final String verifyPublicAccountInfoURL_v1_0 = ConfigProperties.getProperty("verifyPublicAccountInfoURL_v1_0");
    // verifyPublicAccountInfo_v1_0接口版本号
    public static final String verifyPublicAccountInfo_version_v1_0 = ConfigProperties.getProperty("verifyPublicAccountInfo_version_v1_0");
    // verifyPublicAccountInfo_v1_0接口认证秘钥
    public static final String verifyPublicAccountInfo_AKEY_v1_0 = ConfigProperties.getProperty("verifyPublicAccountInfo_AKEY_v1_0");

    /**
     * 配置whiteListService_v1_0接口信息
     */
    // whiteListService_v1_0接口名称
    public static final String whiteListService_Name_v1_0 = ConfigProperties.getProperty("whiteListService_Name_v1_0");
    // whiteListService_v1_0接口方法名
    public static final String whiteListService_Method_v1_0 = ConfigProperties.getProperty("whiteListService_Method_v1_0");
    // whiteListService_v1_0接口url
    public static final String whiteListServiceURL_v1_0 = ConfigProperties.getProperty("whiteListServiceURL_v1_0");
    // whiteListService_v1_0接口版本号
    public static final String whiteListService_version_v1_0 = ConfigProperties.getProperty("whiteListService_version_v1_0");
    // whiteListService_v1_0接口认证秘钥
    public static final String whiteListService_AKEY_v1_0 = ConfigProperties.getProperty("whiteListService_AKEY_v1_0");

    /**
     * 配置queryAssetInfoByServiceId_SAI_v1_0接口信息
     */
    // queryAssetInfoByServiceId_SAI_v1_0接口名称
    public static final String queryAssetInfoByServiceId_SAI_Name_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_SAI_Name_v1_0");
    // queryAssetInfoByServiceId_SAI_v1_0接口方法名
    public static final String queryAssetInfoByServiceId_SAI_Method_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_SAI_Method_v1_0");
    // queryAssetInfoByServiceId_SAI_v1_0接口url
    public static final String queryAssetInfoByServiceId_SAIURL_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_SAIURL_v1_0");
    // queryAssetInfoByServiceId_SAI_v1_0接口版本号
    public static final String queryAssetInfoByServiceId_SAI_version_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_SAI_version_v1_0");
    // queryAssetInfoByServiceId_SAI_v1_0接口认证秘钥
    public static final String queryAssetInfoByServiceId_SAI_AKEY_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_SAI_AKEY_v1_0");

    /**
     * 配置queryAssetInfoByServiceId_XML_v1_0接口信息
     */
    // queryAssetInfoByServiceId_XML_v1_0接口名称
    public static final String queryAssetInfoByServiceId_XML_Name_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_XML_Name_v1_0");
    // queryAssetInfoByServiceId_XML_v1_0接口方法名
    public static final String queryAssetInfoByServiceId_XML_Method_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_XML_Method_v1_0");
    // queryAssetInfoByServiceId_XML_v1_0接口url
    public static final String queryAssetInfoByServiceId_XMLURL_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_XMLURL_v1_0");
    // queryAssetInfoByServiceId_XML_v1_0接口版本号
    public static final String queryAssetInfoByServiceId_XML_version_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_XML_version_v1_0");
    // queryAssetInfoByServiceId_XML_v1_0接口认证秘钥
    public static final String queryAssetInfoByServiceId_XML_AKEY_v1_0 = ConfigProperties.getProperty("queryAssetInfoByServiceId_XML_AKEY_v1_0");

    /**
     * 配置getCustNum_v1_0接口信息
     */
    // getCustNum_v1_0接口名称
    public static final String getCustNum_Name_v1_0 = ConfigProperties.getProperty("getCustNum_Name_v1_0");
    // getCustNum_v1_0接口方法名
    public static final String getCustNum_Method_v1_0 = ConfigProperties.getProperty("getCustNum_Method_v1_0");
    // getCustNum_v1_0接口url
    public static final String getCustNumURL_v1_0 = ConfigProperties.getProperty("getCustNumURL_v1_0");
    // getCustNum_v1_0接口版本号
    public static final String getCustNum_version_v1_0 = ConfigProperties.getProperty("getCustNum_version_v1_0");
    // getCustNum_v1_0接口认证秘钥
    public static final String getCustNum_AKEY_v1_0 = ConfigProperties.getProperty("getCustNum_AKEY_v1_0");

    /**
     * 配置accountAllInfo_v1_0接口信息
     */
    // accountAllInfo_v1_0接口名称
    public static final String accountAllInfo_Name_v1_0 = ConfigProperties.getProperty("accountAllInfo_Name_v1_0");
    // accountAllInfo_v1_0接口方法名
    public static final String accountAllInfo_Method_v1_0 = ConfigProperties.getProperty("accountAllInfo_Method_v1_0");
    // accountAllInfo_v1_0接口url
    public static final String accountAllInfoURL_v1_0 = ConfigProperties.getProperty("accountAllInfoURL_v1_0");
    // accountAllInfo_v1_0接口版本号
    public static final String accountAllInfo_version_v1_0 = ConfigProperties.getProperty("accountAllInfo_version_v1_0");
    // accountAllInfo_v1_0接口认证秘钥
    public static final String accountAllInfo_AKEY_v1_0 = ConfigProperties.getProperty("accountAllInfo_AKEY_v1_0");

    /**
     * 配置DMTKF_ProdAssetList_v1_0接口信息
     */
    // DMTKF_ProdAssetList_v1_0接口名称
    public static final String DMTKF_ProdAssetList_Name_v1_0 = ConfigProperties.getProperty("DMTKF_ProdAssetList_Name_v1_0");
    // DMTKF_ProdAssetList_v1_0接口方法名
    public static final String DMTKF_ProdAssetList_Method_v1_0 = ConfigProperties.getProperty("DMTKF_ProdAssetList_Method_v1_0");
    // DMTKF_ProdAssetList_v1_0接口url
    public static final String DMTKF_ProdAssetListURL_v1_0 = ConfigProperties.getProperty("DMTKF_ProdAssetListURL_v1_0");
    // DMTKF_ProdAssetList_v1_0接口版本号
    public static final String DMTKF_ProdAssetList_version_v1_0 = ConfigProperties.getProperty("DMTKF_ProdAssetList_version_v1_0");
    // DMTKF_ProdAssetList_v1_0接口认证秘钥
    public static final String DMTKF_ProdAssetList_AKEY_v1_0 = ConfigProperties.getProperty("DMTKF_ProdAssetList_AKEY_v1_0");

    /**
     * 配置bindQueueNum_v1_0接口信息
     */
    // bindQueueNum_v1_0接口名称
    public static final String bindQueueNum_Name_v1_0 = ConfigProperties.getProperty("bindQueueNum_Name_v1_0");
    // bindQueueNum_v1_0接口方法名
    public static final String bindQueueNum_Method_v1_0 = ConfigProperties.getProperty("bindQueueNum_Method_v1_0");
    // bindQueueNum_v1_0接口url
    public static final String bindQueueNumURL_v1_0 = ConfigProperties.getProperty("bindQueueNumURL_v1_0");
    // bindQueueNum_v1_0接口版本号
    public static final String bindQueueNum_version_v1_0 = ConfigProperties.getProperty("bindQueueNum_version_v1_0");
    // bindQueueNum_v1_0接口认证秘钥
    public static final String bindQueueNum_AKEY_v1_0 = ConfigProperties.getProperty("bindQueueNum_AKEY_v1_0");

    /**
     * 配置changeSingleProductPromotion_v1_0接口信息
     */
    // changeSingleProductPromotion_v1_0接口名称
    public static final String changeSingleProductPromotion_Name_v1_0 = ConfigProperties.getProperty("changeSingleProductPromotion_Name_v1_0");
    // changeSingleProductPromotion_v1_0接口方法名
    public static final String changeSingleProductPromotion_Method_v1_0 = ConfigProperties.getProperty("changeSingleProductPromotion_Method_v1_0");
    // changeSingleProductPromotion_v1_0接口url
    public static final String changeSingleProductPromotionURL_v1_0 = ConfigProperties.getProperty("changeSingleProductPromotionURL_v1_0");
    // changeSingleProductPromotion_v1_0接口版本号
    public static final String changeSingleProductPromotion_version_v1_0 = ConfigProperties.getProperty("changeSingleProductPromotion_version_v1_0");
    // changeSingleProductPromotion_v1_0接口认证秘钥
    public static final String changeSingleProductPromotion_AKEY_v1_0 = ConfigProperties.getProperty("changeSingleProductPromotion_AKEY_v1_0");

    /**
     * 配置getAllBusinessHallQueInfo_v1_0接口信息
     */
    // getAllBusinessHallQueInfo_v1_0接口名称
    public static final String getAllBusinessHallQueInfo_Name_v1_0 = ConfigProperties.getProperty("getAllBusinessHallQueInfo_Name_v1_0");
    // getAllBusinessHallQueInfo_v1_0接口方法名
    public static final String getAllBusinessHallQueInfo_Method_v1_0 = ConfigProperties.getProperty("getAllBusinessHallQueInfo_Method_v1_0");
    // getAllBusinessHallQueInfo_v1_0接口url
    public static final String getAllBusinessHallQueInfoURL_v1_0 = ConfigProperties.getProperty("getAllBusinessHallQueInfoURL_v1_0");
    // getAllBusinessHallQueInfo_v1_0接口版本号
    public static final String getAllBusinessHallQueInfo_version_v1_0 = ConfigProperties.getProperty("getAllBusinessHallQueInfo_version_v1_0");
    // getAllBusinessHallQueInfo_v1_0接口认证秘钥
    public static final String getAllBusinessHallQueInfo_AKEY_v1_0 = ConfigProperties.getProperty("getAllBusinessHallQueInfo_AKEY_v1_0");

    /**
     * 配置complexCheckEmergencyRecovery_v1_0接口信息
     */
    // complexCheckEmergencyRecovery_v1_0接口名称
    public static final String complexCheckEmergencyRecovery_Name_v1_0 = ConfigProperties.getProperty("complexCheckEmergencyRecovery_Name_v1_0");
    // complexCheckEmergencyRecovery_v1_0接口方法名
    public static final String complexCheckEmergencyRecovery_Method_v1_0 = ConfigProperties.getProperty("complexCheckEmergencyRecovery_Method_v1_0");
    // complexCheckEmergencyRecovery_v1_0接口url
    public static final String complexCheckEmergencyRecoveryURL_v1_0 = ConfigProperties.getProperty("complexCheckEmergencyRecoveryURL_v1_0");
    // complexCheckEmergencyRecovery_v1_0接口版本号
    public static final String complexCheckEmergencyRecovery_version_v1_0 = ConfigProperties.getProperty("complexCheckEmergencyRecovery_version_v1_0");
    // complexCheckEmergencyRecovery_v1_0接口认证秘钥
    public static final String complexCheckEmergencyRecovery_AKEY_v1_0 = ConfigProperties.getProperty("complexCheckEmergencyRecovery_AKEY_v1_0");

    /**
     * 配置complexQueryCreditGrade_v1_0接口信息
     */
    // complexQueryCreditGrade_v1_0接口名称
    public static final String complexQueryCreditGrade_Name_v1_0 = ConfigProperties.getProperty("complexQueryCreditGrade_Name_v1_0");
    // complexQueryCreditGrade_v1_0接口方法名
    public static final String complexQueryCreditGrade_Method_v1_0 = ConfigProperties.getProperty("complexQueryCreditGrade_Method_v1_0");
    // complexQueryCreditGrade_v1_0接口url
    public static final String complexQueryCreditGradeURL_v1_0 = ConfigProperties.getProperty("complexQueryCreditGradeURL_v1_0");
    // complexQueryCreditGrade_v1_0接口版本号
    public static final String complexQueryCreditGrade_version_v1_0 = ConfigProperties.getProperty("complexQueryCreditGrade_version_v1_0");
    // complexQueryCreditGrade_v1_0接口认证秘钥
    public static final String complexQueryCreditGrade_AKEY_v1_0 = ConfigProperties.getProperty("complexQueryCreditGrade_AKEY_v1_0");

    /**
     * 配置complexExeRecoveryRight_v1_0接口信息
     */
    // complexExeRecoveryRight_v1_0接口名称
    public static final String complexExeRecoveryRight_Name_v1_0 = ConfigProperties.getProperty("complexExeRecoveryRight_Name_v1_0");
    // complexExeRecoveryRight_v1_0接口方法名
    public static final String complexExeRecoveryRight_Method_v1_0 = ConfigProperties.getProperty("complexExeRecoveryRight_Method_v1_0");
    // complexExeRecoveryRight_v1_0接口url
    public static final String complexExeRecoveryRightURL_v1_0 = ConfigProperties.getProperty("complexExeRecoveryRightURL_v1_0");
    // complexExeRecoveryRight_v1_0接口版本号
    public static final String complexExeRecoveryRight_version_v1_0 = ConfigProperties.getProperty("complexExeRecoveryRight_version_v1_0");
    // complexExeRecoveryRight_v1_0接口认证秘钥
    public static final String complexExeRecoveryRight_AKEY_v1_0 = ConfigProperties.getProperty("complexExeRecoveryRight_AKEY_v1_0");

    /**
     * 配置complexExeZHJTRightAsyn_v1_0接口信息
     */
    // complexExeZHJTRightAsyn_v1_0接口名称
    public static final String complexExeZHJTRightAsyn_Name_v1_0 = ConfigProperties.getProperty("complexExeZHJTRightAsyn_Name_v1_0");
    // complexExeZHJTRightAsyn_v1_0接口方法名
    public static final String complexExeZHJTRightAsyn_Method_v1_0 = ConfigProperties.getProperty("complexExeZHJTRightAsyn_Method_v1_0");
    // complexExeZHJTRightAsyn_v1_0接口url
    public static final String complexExeZHJTRightAsynURL_v1_0 = ConfigProperties.getProperty("complexExeZHJTRightAsynURL_v1_0");
    // complexExeZHJTRightAsyn_v1_0接口版本号
    public static final String complexExeZHJTRightAsyn_version_v1_0 = ConfigProperties.getProperty("complexExeZHJTRightAsyn_version_v1_0");
    // complexExeZHJTRightAsyn_v1_0接口认证秘钥
    public static final String complexExeZHJTRightAsyn_AKEY_v1_0 = ConfigProperties.getProperty("complexExeZHJTRightAsyn_AKEY_v1_0");

    /**
     * 配置createCRMLocalOrder_v1_0接口信息
     */
    // createCRMLocalOrder_v1_0接口名称
    public static final String createCRMLocalOrder_Name_v1_0 = ConfigProperties.getProperty("createCRMLocalOrder_Name_v1_0");
    // createCRMLocalOrder_v1_0接口方法名
    public static final String createCRMLocalOrder_Method_v1_0 = ConfigProperties.getProperty("createCRMLocalOrder_Method_v1_0");
    // createCRMLocalOrder_v1_0接口url
    public static final String createCRMLocalOrderURL_v1_0 = ConfigProperties.getProperty("createCRMLocalOrderURL_v1_0");
    // createCRMLocalOrder_v1_0接口版本号
    public static final String createCRMLocalOrder_version_v1_0 = ConfigProperties.getProperty("createCRMLocalOrder_version_v1_0");
    // createCRMLocalOrder_v1_0接口认证秘钥
    public static final String createCRMLocalOrder_AKEY_v1_0 = ConfigProperties.getProperty("createCRMLocalOrder_AKEY_v1_0");

    /**
     * 配置updateMediaTypeByBPNumber_v2_0接口信息
     */
    // updateMediaTypeByBPNumber_v2_0接口名称
    public static final String updateMediaTypeByBPNumber_Name_v2_0 = ConfigProperties.getProperty("updateMediaTypeByBPNumber_Name_v2_0");
    // updateMediaTypeByBPNumber_v2_0接口方法名
    public static final String updateMediaTypeByBPNumber_Method_v2_0 = ConfigProperties.getProperty("updateMediaTypeByBPNumber_Method_v2_0");
    // updateMediaTypeByBPNumber_v2_0接口url
    public static final String updateMediaTypeByBPNumberURL_v2_0 = ConfigProperties.getProperty("updateMediaTypeByBPNumberURL_v2_0");
    // updateMediaTypeByBPNumber_v2_0接口版本号
    public static final String updateMediaTypeByBPNumber_version_v2_0 = ConfigProperties.getProperty("updateMediaTypeByBPNumber_version_v2_0");
    // updateMediaTypeByBPNumber_v2_0接口认证秘钥
    public static final String updateMediaTypeByBPNumber_AKEY_v2_0 = ConfigProperties.getProperty("updateMediaTypeByBPNumber_AKEY_v2_0");

    /**
     * 配置createPointOrder_v1_0接口信息
     */
    // createPointOrder_v1_0接口名称
    public static final String createPointOrder_Name_v1_0 = ConfigProperties.getProperty("createPointOrder_Name_v1_0");
    // createPointOrder_v1_0接口方法名
    public static final String createPointOrder_Method_v1_0 = ConfigProperties.getProperty("createPointOrder_Method_v1_0");
    // createPointOrder_v1_0接口url
    public static final String createPointOrderURL_v1_0 = ConfigProperties.getProperty("createPointOrderURL_v1_0");
    // createPointOrder_v1_0接口版本号
    public static final String createPointOrder_version_v1_0 = ConfigProperties.getProperty("createPointOrder_version_v1_0");
    // createPointOrder_v1_0接口认证秘钥
    public static final String createPointOrder_AKEY_v1_0 = ConfigProperties.getProperty("createPointOrder_AKEY_v1_0");

    /**
     * 配置createPointOrder1_v1_0接口信息
     */
    // createPointOrder1_v1_0接口名称
    public static final String createPointOrder1_Name_v1_0 = ConfigProperties.getProperty("createPointOrder1_Name_v1_0");
    // createPointOrder1_v1_0接口方法名
    public static final String createPointOrder1_Method_v1_0 = ConfigProperties.getProperty("createPointOrder1_Method_v1_0");
    // createPointOrder1_v1_0接口url
    public static final String createPointOrder1URL_v1_0 = ConfigProperties.getProperty("createPointOrder1URL_v1_0");
    // createPointOrder1_v1_0接口版本号
    public static final String createPointOrder1_version_v1_0 = ConfigProperties.getProperty("createPointOrder1_version_v1_0");
    // createPointOrder1_v1_0接口认证秘钥
    public static final String createPointOrder1_AKEY_v1_0 = ConfigProperties.getProperty("createPointOrder1_AKEY_v1_0");

    /**
     * 配置createPointOrder2_v1_0接口信息
     */
    // createPointOrder2_v1_0接口名称
    public static final String createPointOrder2_Name_v1_0 = ConfigProperties.getProperty("createPointOrder2_Name_v1_0");
    // createPointOrder2_v1_0接口方法名
    public static final String createPointOrder2_Method_v1_0 = ConfigProperties.getProperty("createPointOrder2_Method_v1_0");
    // createPointOrder2_v1_0接口url
    public static final String createPointOrder2URL_v1_0 = ConfigProperties.getProperty("createPointOrder2URL_v1_0");
    // createPointOrder2_v1_0接口版本号
    public static final String createPointOrder2_version_v1_0 = ConfigProperties.getProperty("createPointOrder2_version_v1_0");
    // createPointOrder2_v1_0接口认证秘钥
    public static final String createPointOrder2_AKEY_v1_0 = ConfigProperties.getProperty("createPointOrder2_AKEY_v1_0");

    /**
     * 配置createPointOrder3_v1_0接口信息
     */
    // createPointOrder3_v1_0接口名称
    public static final String createPointOrder3_Name_v1_0 = ConfigProperties.getProperty("createPointOrder3_Name_v1_0");
    // createPointOrder3_v1_0接口方法名
    public static final String createPointOrder3_Method_v1_0 = ConfigProperties.getProperty("createPointOrder3_Method_v1_0");
    // createPointOrder3_v1_0接口url
    public static final String createPointOrder3URL_v1_0 = ConfigProperties.getProperty("createPointOrder3URL_v1_0");
    // createPointOrder3_v1_0接口版本号
    public static final String createPointOrder3_version_v1_0 = ConfigProperties.getProperty("createPointOrder3_version_v1_0");
    // createPointOrder3_v1_0接口认证秘钥
    public static final String createPointOrder3_AKEY_v1_0 = ConfigProperties.getProperty("createPointOrder3_AKEY_v1_0");

    /**
     * 配置getStatusDetailMethod_v1_0接口信息
     */
    // getStatusDetailMethod_v1_0接口名称
    public static final String getStatusDetailMethod_Name_v1_0 = ConfigProperties.getProperty("getStatusDetailMethod_Name_v1_0");
    // getStatusDetailMethod_v1_0接口方法名
    public static final String getStatusDetailMethod_Method_v1_0 = ConfigProperties.getProperty("getStatusDetailMethod_Method_v1_0");
    // getStatusDetailMethod_v1_0接口url
    public static final String getStatusDetailMethodURL_v1_0 = ConfigProperties.getProperty("getStatusDetailMethodURL_v1_0");
    // getStatusDetailMethod_v1_0接口版本号
    public static final String getStatusDetailMethod_version_v1_0 = ConfigProperties.getProperty("getStatusDetailMethod_version_v1_0");
    // getStatusDetailMethod_v1_0接口认证秘钥
    public static final String getStatusDetailMethod_AKEY_v1_0 = ConfigProperties.getProperty("getStatusDetailMethod_AKEY_v1_0");

    /**
     * 配置entryJFchannelPrizeInfo_v1_0接口信息
     */
    // entryJFchannelPrizeInfo_v1_0接口名称
    public static final String entryJFchannelPrizeInfo_Name_v1_0 = ConfigProperties.getProperty("entryJFchannelPrizeInfo_Name_v1_0");
    // entryJFchannelPrizeInfo_v1_0接口方法名
    public static final String entryJFchannelPrizeInfo_Method_v1_0 = ConfigProperties.getProperty("entryJFchannelPrizeInfo_Method_v1_0");
    // entryJFchannelPrizeInfo_v1_0接口url
    public static final String entryJFchannelPrizeInfoURL_v1_0 = ConfigProperties.getProperty("entryJFchannelPrizeInfoURL_v1_0");
    // entryJFchannelPrizeInfo_v1_0接口版本号
    public static final String entryJFchannelPrizeInfo_version_v1_0 = ConfigProperties.getProperty("entryJFchannelPrizeInfo_version_v1_0");
    // entryJFchannelPrizeInfo_v1_0接口认证秘钥
    public static final String entryJFchannelPrizeInfo_AKEY_v1_0 = ConfigProperties.getProperty("entryJFchannelPrizeInfo_AKEY_v1_0");

    /**
     * 配置exchangeCardByRedPack_v1_0接口信息
     */
    // exchangeCardByRedPack_v1_0接口名称
    public static final String exchangeCardByRedPack_Name_v1_0 = ConfigProperties.getProperty("exchangeCardByRedPack_Name_v1_0");
    // exchangeCardByRedPack_v1_0接口方法名
    public static final String exchangeCardByRedPack_Method_v1_0 = ConfigProperties.getProperty("exchangeCardByRedPack_Method_v1_0");
    // exchangeCardByRedPack_v1_0接口url
    public static final String exchangeCardByRedPackURL_v1_0 = ConfigProperties.getProperty("exchangeCardByRedPackURL_v1_0");
    // exchangeCardByRedPack_v1_0接口版本号
    public static final String exchangeCardByRedPack_version_v1_0 = ConfigProperties.getProperty("exchangeCardByRedPack_version_v1_0");
    // exchangeCardByRedPack_v1_0接口认证秘钥
    public static final String exchangeCardByRedPack_AKEY_v1_0 = ConfigProperties.getProperty("exchangeCardByRedPack_AKEY_v1_0");

    /**
     * 配置exchangePoints_v1_0接口信息
     */
    // exchangePoints_v1_0接口名称
    public static final String exchangePoints_Name_v1_0 = ConfigProperties.getProperty("exchangePoints_Name_v1_0");
    // exchangePoints_v1_0接口方法名
    public static final String exchangePoints_Method_v1_0 = ConfigProperties.getProperty("exchangePoints_Method_v1_0");
    // exchangePoints_v1_0接口url
    public static final String exchangePointsURL_v1_0 = ConfigProperties.getProperty("exchangePointsURL_v1_0");
    // exchangePoints_v1_0接口版本号
    public static final String exchangePoints_version_v1_0 = ConfigProperties.getProperty("exchangePoints_version_v1_0");
    // exchangePoints_v1_0接口认证秘钥
    public static final String exchangePoints_AKEY_v1_0 = ConfigProperties.getProperty("exchangePoints_AKEY_v1_0");

    /**
     * 配置getBalanceTransListByNo_v1_0接口信息
     */
    // getBalanceTransListByNo_v1_0接口名称
    public static final String getBalanceTransListByNo_Name_v1_0 = ConfigProperties.getProperty("getBalanceTransListByNo_Name_v1_0");
    // getBalanceTransListByNo_v1_0接口方法名
    public static final String getBalanceTransListByNo_Method_v1_0 = ConfigProperties.getProperty("getBalanceTransListByNo_Method_v1_0");
    // getBalanceTransListByNo_v1_0接口url
    public static final String getBalanceTransListByNoURL_v1_0 = ConfigProperties.getProperty("getBalanceTransListByNoURL_v1_0");
    // getBalanceTransListByNo_v1_0接口版本号
    public static final String getBalanceTransListByNo_version_v1_0 = ConfigProperties.getProperty("getBalanceTransListByNo_version_v1_0");
    // getBalanceTransListByNo_v1_0接口认证秘钥
    public static final String getBalanceTransListByNo_AKEY_v1_0 = ConfigProperties.getProperty("getBalanceTransListByNo_AKEY_v1_0");

    /**
     * 配置getBusinessHallQueInfo_v1_0接口信息
     */
    // getBusinessHallQueInfo_v1_0接口名称
    public static final String getBusinessHallQueInfo_Name_v1_0 = ConfigProperties.getProperty("getBusinessHallQueInfo_Name_v1_0");
    // getBusinessHallQueInfo_v1_0接口方法名
    public static final String getBusinessHallQueInfo_Method_v1_0 = ConfigProperties.getProperty("getBusinessHallQueInfo_Method_v1_0");
    // getBusinessHallQueInfo_v1_0接口url
    public static final String getBusinessHallQueInfoURL_v1_0 = ConfigProperties.getProperty("getBusinessHallQueInfoURL_v1_0");
    // getBusinessHallQueInfo_v1_0接口版本号
    public static final String getBusinessHallQueInfo_version_v1_0 = ConfigProperties.getProperty("getBusinessHallQueInfo_version_v1_0");
    // getBusinessHallQueInfo_v1_0接口认证秘钥
    public static final String getBusinessHallQueInfo_AKEY_v1_0 = ConfigProperties.getProperty("getBusinessHallQueInfo_AKEY_v1_0");

    /**
     * 配置getBusinessTypeByBranchId_v1_0接口信息
     */
    // getBusinessTypeByBranchId_v1_0接口名称
    public static final String getBusinessTypeByBranchId_Name_v1_0 = ConfigProperties.getProperty("getBusinessTypeByBranchId_Name_v1_0");
    // getBusinessTypeByBranchId_v1_0接口方法名
    public static final String getBusinessTypeByBranchId_Method_v1_0 = ConfigProperties.getProperty("getBusinessTypeByBranchId_Method_v1_0");
    // getBusinessTypeByBranchId_v1_0接口url
    public static final String getBusinessTypeByBranchIdURL_v1_0 = ConfigProperties.getProperty("getBusinessTypeByBranchIdURL_v1_0");
    // getBusinessTypeByBranchId_v1_0接口版本号
    public static final String getBusinessTypeByBranchId_version_v1_0 = ConfigProperties.getProperty("getBusinessTypeByBranchId_version_v1_0");
    // getBusinessTypeByBranchId_v1_0接口认证秘钥
    public static final String getBusinessTypeByBranchId_AKEY_v1_0 = ConfigProperties.getProperty("getBusinessTypeByBranchId_AKEY_v1_0");

    /**
     * 配置getCoupon_v1_0接口信息
     */
    // getCoupon_v1_0接口名称
    public static final String getCoupon_Name_v1_0 = ConfigProperties.getProperty("getCoupon_Name_v1_0");
    // getCoupon_v1_0接口方法名
    public static final String getCoupon_Method_v1_0 = ConfigProperties.getProperty("getCoupon_Method_v1_0");
    // getCoupon_v1_0接口url
    public static final String getCouponURL_v1_0 = ConfigProperties.getProperty("getCouponURL_v1_0");
    // getCoupon_v1_0接口版本号
    public static final String getCoupon_version_v1_0 = ConfigProperties.getProperty("getCoupon_version_v1_0");
    // getCoupon_v1_0接口认证秘钥
    public static final String getCoupon_AKEY_v1_0 = ConfigProperties.getProperty("getCoupon_AKEY_v1_0");

    /**
     * 配置getKdYearFeeByBillNo_v1_0接口信息
     */
    // getKdYearFeeByBillNo_v1_0接口名称
    public static final String getKdYearFeeByBillNo_Name_v1_0 = ConfigProperties.getProperty("getKdYearFeeByBillNo_Name_v1_0");
    // getKdYearFeeByBillNo_v1_0接口方法名
    public static final String getKdYearFeeByBillNo_Method_v1_0 = ConfigProperties.getProperty("getKdYearFeeByBillNo_Method_v1_0");
    // getKdYearFeeByBillNo_v1_0接口url
    public static final String getKdYearFeeByBillNoURL_v1_0 = ConfigProperties.getProperty("getKdYearFeeByBillNoURL_v1_0");
    // getKdYearFeeByBillNo_v1_0接口版本号
    public static final String getKdYearFeeByBillNo_version_v1_0 = ConfigProperties.getProperty("getKdYearFeeByBillNo_version_v1_0");
    // getKdYearFeeByBillNo_v1_0接口认证秘钥
    public static final String getKdYearFeeByBillNo_AKEY_v1_0 = ConfigProperties.getProperty("getKdYearFeeByBillNo_AKEY_v1_0");

    /**
     * 配置getOnlineBusinessHall_v1_0接口信息
     */
    // getOnlineBusinessHall_v1_0接口名称
    public static final String getOnlineBusinessHall_Name_v1_0 = ConfigProperties.getProperty("getOnlineBusinessHall_Name_v1_0");
    // getOnlineBusinessHall_v1_0接口方法名
    public static final String getOnlineBusinessHall_Method_v1_0 = ConfigProperties.getProperty("getOnlineBusinessHall_Method_v1_0");
    // getOnlineBusinessHall_v1_0接口url
    public static final String getOnlineBusinessHallURL_v1_0 = ConfigProperties.getProperty("getOnlineBusinessHallURL_v1_0");
    // getOnlineBusinessHall_v1_0接口版本号
    public static final String getOnlineBusinessHall_version_v1_0 = ConfigProperties.getProperty("getOnlineBusinessHall_version_v1_0");
    // getOnlineBusinessHall_v1_0接口认证秘钥
    public static final String getOnlineBusinessHall_AKEY_v1_0 = ConfigProperties.getProperty("getOnlineBusinessHall_AKEY_v1_0");

    /**
     * 配置getPackageFeeNav_v1_0接口信息
     */
    // getPackageFeeNav_v1_0接口名称
    public static final String getPackageFeeNav_Name_v1_0 = ConfigProperties.getProperty("getPackageFeeNav_Name_v1_0");
    // getPackageFeeNav_v1_0接口方法名
    public static final String getPackageFeeNav_Method_v1_0 = ConfigProperties.getProperty("getPackageFeeNav_Method_v1_0");
    // getPackageFeeNav_v1_0接口url
    public static final String getPackageFeeNavURL_v1_0 = ConfigProperties.getProperty("getPackageFeeNavURL_v1_0");
    // getPackageFeeNav_v1_0接口版本号
    public static final String getPackageFeeNav_version_v1_0 = ConfigProperties.getProperty("getPackageFeeNav_version_v1_0");
    // getPackageFeeNav_v1_0接口认证秘钥
    public static final String getPackageFeeNav_AKEY_v1_0 = ConfigProperties.getProperty("getPackageFeeNav_AKEY_v1_0");

    /**
     * 配置getRemoteQueueNumInfo_v1_0接口信息
     */
    // getRemoteQueueNumInfo_v1_0接口名称
    public static final String getRemoteQueueNumInfo_Name_v1_0 = ConfigProperties.getProperty("getRemoteQueueNumInfo_Name_v1_0");
    // getRemoteQueueNumInfo_v1_0接口方法名
    public static final String getRemoteQueueNumInfo_Method_v1_0 = ConfigProperties.getProperty("getRemoteQueueNumInfo_Method_v1_0");
    // getRemoteQueueNumInfo_v1_0接口url
    public static final String getRemoteQueueNumInfoURL_v1_0 = ConfigProperties.getProperty("getRemoteQueueNumInfoURL_v1_0");
    // getRemoteQueueNumInfo_v1_0接口版本号
    public static final String getRemoteQueueNumInfo_version_v1_0 = ConfigProperties.getProperty("getRemoteQueueNumInfo_version_v1_0");
    // getRemoteQueueNumInfo_v1_0接口认证秘钥
    public static final String getRemoteQueueNumInfo_AKEY_v1_0 = ConfigProperties.getProperty("getRemoteQueueNumInfo_AKEY_v1_0");

    /**
     * 配置getRemoteTakeNum_v1_0接口信息
     */
    // getRemoteTakeNum_v1_0接口名称
    public static final String getRemoteTakeNum_Name_v1_0 = ConfigProperties.getProperty("getRemoteTakeNum_Name_v1_0");
    // getRemoteTakeNum_v1_0接口方法名
    public static final String getRemoteTakeNum_Method_v1_0 = ConfigProperties.getProperty("getRemoteTakeNum_Method_v1_0");
    // getRemoteTakeNum_v1_0接口url
    public static final String getRemoteTakeNumURL_v1_0 = ConfigProperties.getProperty("getRemoteTakeNumURL_v1_0");
    // getRemoteTakeNum_v1_0接口版本号
    public static final String getRemoteTakeNum_version_v1_0 = ConfigProperties.getProperty("getRemoteTakeNum_version_v1_0");
    // getRemoteTakeNum_v1_0接口认证秘钥
    public static final String getRemoteTakeNum_AKEY_v1_0 = ConfigProperties.getProperty("getRemoteTakeNum_AKEY_v1_0");

    /**
     * 配置getVoiceFeeNav_v1_0接口信息
     */
    // getVoiceFeeNav_v1_0接口名称
    public static final String getVoiceFeeNav_Name_v1_0 = ConfigProperties.getProperty("getVoiceFeeNav_Name_v1_0");
    // getVoiceFeeNav_v1_0接口方法名
    public static final String getVoiceFeeNav_Method_v1_0 = ConfigProperties.getProperty("getVoiceFeeNav_Method_v1_0");
    // getVoiceFeeNav_v1_0接口url
    public static final String getVoiceFeeNavURL_v1_0 = ConfigProperties.getProperty("getVoiceFeeNavURL_v1_0");
    // getVoiceFeeNav_v1_0接口版本号
    public static final String getVoiceFeeNav_version_v1_0 = ConfigProperties.getProperty("getVoiceFeeNav_version_v1_0");
    // getVoiceFeeNav_v1_0接口认证秘钥
    public static final String getVoiceFeeNav_AKEY_v1_0 = ConfigProperties.getProperty("getVoiceFeeNav_AKEY_v1_0");

    /**
     * 配置LLWYLucky_v1_0接口信息
     */
    // LLWYLucky_v1_0接口名称
    public static final String LLWYLucky_Name_v1_0 = ConfigProperties.getProperty("LLWYLucky_Name_v1_0");
    // LLWYLucky_v1_0接口方法名
    public static final String LLWYLucky_Method_v1_0 = ConfigProperties.getProperty("LLWYLucky_Method_v1_0");
    // LLWYLucky_v1_0接口url
    public static final String LLWYLuckyURL_v1_0 = ConfigProperties.getProperty("LLWYLuckyURL_v1_0");
    // LLWYLucky_v1_0接口版本号
    public static final String LLWYLucky_version_v1_0 = ConfigProperties.getProperty("LLWYLucky_version_v1_0");
    // LLWYLucky_v1_0接口认证秘钥
    public static final String LLWYLucky_AKEY_v1_0 = ConfigProperties.getProperty("LLWYLucky_AKEY_v1_0");

    /**
     * 配置LTE_SVC80055_BUS80001_M_v1_0接口信息
     */
    // LTE_SVC80055_BUS80001_M_v1_0接口名称
    public static final String LTE_SVC80055_BUS80001_M_Name_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_Name_v1_0");
    // LTE_SVC80055_BUS80001_M_v1_0接口方法名
    public static final String LTE_SVC80055_BUS80001_M_Method_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_Method_v1_0");
    // LTE_SVC80055_BUS80001_M_v1_0接口url
    public static final String LTE_SVC80055_BUS80001_MURL_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_MURL_v1_0");
    // LTE_SVC80055_BUS80001_M_v1_0接口版本号
    public static final String LTE_SVC80055_BUS80001_M_version_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_version_v1_0");
    // LTE_SVC80055_BUS80001_M_v1_0接口认证秘钥
    public static final String LTE_SVC80055_BUS80001_M_AKEY_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_AKEY_v1_0");

    /**
     * 配置LTE_SVC80056_BUS80001_M_v1_0接口信息
     */
    // LTE_SVC80056_BUS80001_M_v1_0接口名称
    public static final String LTE_SVC80056_BUS80001_M_Name_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_Name_v1_0");
    // LTE_SVC80056_BUS80001_M_v1_0接口方法名
    public static final String LTE_SVC80056_BUS80001_M_Method_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_Method_v1_0");
    // LTE_SVC80056_BUS80001_M_v1_0接口url
    public static final String LTE_SVC80056_BUS80001_MURL_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_MURL_v1_0");
    // LTE_SVC80056_BUS80001_M_v1_0接口版本号
    public static final String LTE_SVC80056_BUS80001_M_version_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_version_v1_0");
    // LTE_SVC80056_BUS80001_M_v1_0接口认证秘钥
    public static final String LTE_SVC80056_BUS80001_M_AKEY_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_AKEY_v1_0");

    /**
     * 配置LTE_SVC80058_BUS80001_M_v1_0接口信息
     */
    // LTE_SVC80058_BUS80001_M_v1_0接口名称
    public static final String LTE_SVC80058_BUS80001_M_Name_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_Name_v1_0");
    // LTE_SVC80058_BUS80001_M_v1_0接口方法名
    public static final String LTE_SVC80058_BUS80001_M_Method_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_Method_v1_0");
    // LTE_SVC80058_BUS80001_M_v1_0接口url
    public static final String LTE_SVC80058_BUS80001_MURL_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_MURL_v1_0");
    // LTE_SVC80058_BUS80001_M_v1_0接口版本号
    public static final String LTE_SVC80058_BUS80001_M_version_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_version_v1_0");
    // LTE_SVC80058_BUS80001_M_v1_0接口认证秘钥
    public static final String LTE_SVC80058_BUS80001_M_AKEY_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_AKEY_v1_0");

    /**
     * 配置modifyAssetNewOrder_v1_0接口信息
     */
    // modifyAssetNewOrder_v1_0接口名称
    public static final String modifyAssetNewOrder_Name_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrder_Name_v1_0");
    // modifyAssetNewOrder_v1_0接口方法名
    public static final String modifyAssetNewOrder_Method_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrder_Method_v1_0");
    // modifyAssetNewOrder_v1_0接口url
    public static final String modifyAssetNewOrderURL_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrderURL_v1_0");
    // modifyAssetNewOrder_v1_0接口版本号
    public static final String modifyAssetNewOrder_version_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrder_version_v1_0");
    // modifyAssetNewOrder_v1_0接口认证秘钥
    public static final String modifyAssetNewOrder_AKEY_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrder_AKEY_v1_0");

    /**
     * 配置modifyAssetNewOrderAsyn_v1_0接口信息
     */
    // modifyAssetNewOrderAsyn_v1_0接口名称
    public static final String modifyAssetNewOrderAsyn_Name_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrderAsyn_Name_v1_0");
    // modifyAssetNewOrderAsyn_v1_0接口方法名
    public static final String modifyAssetNewOrderAsyn_Method_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrderAsyn_Method_v1_0");
    // modifyAssetNewOrderAsyn_v1_0接口url
    public static final String modifyAssetNewOrderAsynURL_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrderAsynURL_v1_0");
    // modifyAssetNewOrderAsyn_v1_0接口版本号
    public static final String modifyAssetNewOrderAsyn_version_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrderAsyn_version_v1_0");
    // modifyAssetNewOrderAsyn_v1_0接口认证秘钥
    public static final String modifyAssetNewOrderAsyn_AKEY_v1_0 = ConfigProperties.getProperty("modifyAssetNewOrderAsyn_AKEY_v1_0");

    /**
     * 配置newCreateAccountAddress_v1_0接口信息
     */
    // newCreateAccountAddress_v1_0接口名称
    public static final String newCreateAccountAddress_Name_v1_0 = ConfigProperties.getProperty("newCreateAccountAddress_Name_v1_0");
    // newCreateAccountAddress_v1_0接口方法名
    public static final String newCreateAccountAddress_Method_v1_0 = ConfigProperties.getProperty("newCreateAccountAddress_Method_v1_0");
    // newCreateAccountAddress_v1_0接口url
    public static final String newCreateAccountAddressURL_v1_0 = ConfigProperties.getProperty("newCreateAccountAddressURL_v1_0");
    // newCreateAccountAddress_v1_0接口版本号
    public static final String newCreateAccountAddress_version_v1_0 = ConfigProperties.getProperty("newCreateAccountAddress_version_v1_0");
    // newCreateAccountAddress_v1_0接口认证秘钥
    public static final String newCreateAccountAddress_AKEY_v1_0 = ConfigProperties.getProperty("newCreateAccountAddress_AKEY_v1_0");

    /**
     * 配置newCreatePublicAccount_v1_0接口信息
     */
    // newCreatePublicAccount_v1_0接口名称
    public static final String newCreatePublicAccount_Name_v1_0 = ConfigProperties.getProperty("newCreatePublicAccount_Name_v1_0");
    // newCreatePublicAccount_v1_0接口方法名
    public static final String newCreatePublicAccount_Method_v1_0 = ConfigProperties.getProperty("newCreatePublicAccount_Method_v1_0");
    // newCreatePublicAccount_v1_0接口url
    public static final String newCreatePublicAccountURL_v1_0 = ConfigProperties.getProperty("newCreatePublicAccountURL_v1_0");
    // newCreatePublicAccount_v1_0接口版本号
    public static final String newCreatePublicAccount_version_v1_0 = ConfigProperties.getProperty("newCreatePublicAccount_version_v1_0");
    // newCreatePublicAccount_v1_0接口认证秘钥
    public static final String newCreatePublicAccount_AKEY_v1_0 = ConfigProperties.getProperty("newCreatePublicAccount_AKEY_v1_0");

    /**
     * 配置newSingleProductInstallAsyn_v1_0接口信息
     */
    // newSingleProductInstallAsyn_v1_0接口名称
    public static final String newSingleProductInstallAsyn_Name_v1_0 = ConfigProperties.getProperty("newSingleProductInstallAsyn_Name_v1_0");
    // newSingleProductInstallAsyn_v1_0接口方法名
    public static final String newSingleProductInstallAsyn_Method_v1_0 = ConfigProperties.getProperty("newSingleProductInstallAsyn_Method_v1_0");
    // newSingleProductInstallAsyn_v1_0接口url
    public static final String newSingleProductInstallAsynURL_v1_0 = ConfigProperties.getProperty("newSingleProductInstallAsynURL_v1_0");
    // newSingleProductInstallAsyn_v1_0接口版本号
    public static final String newSingleProductInstallAsyn_version_v1_0 = ConfigProperties.getProperty("newSingleProductInstallAsyn_version_v1_0");
    // newSingleProductInstallAsyn_v1_0接口认证秘钥
    public static final String newSingleProductInstallAsyn_AKEY_v1_0 = ConfigProperties.getProperty("newSingleProductInstallAsyn_AKEY_v1_0");

    /**
     * 配置orderORQueryFlow_v1_0接口信息
     */
    // orderORQueryFlow_v1_0接口名称
    public static final String orderORQueryFlow_Name_v1_0 = ConfigProperties.getProperty("orderORQueryFlow_Name_v1_0");
    // orderORQueryFlow_v1_0接口方法名
    public static final String orderORQueryFlow_Method_v1_0 = ConfigProperties.getProperty("orderORQueryFlow_Method_v1_0");
    // orderORQueryFlow_v1_0接口url
    public static final String orderORQueryFlowURL_v1_0 = ConfigProperties.getProperty("orderORQueryFlowURL_v1_0");
    // orderORQueryFlow_v1_0接口版本号
    public static final String orderORQueryFlow_version_v1_0 = ConfigProperties.getProperty("orderORQueryFlow_version_v1_0");
    // orderORQueryFlow_v1_0接口认证秘钥
    public static final String orderORQueryFlow_AKEY_v1_0 = ConfigProperties.getProperty("orderORQueryFlow_AKEY_v1_0");

    /**
     * 配置orderORQueryFlowOCS_v1_0接口信息
     */
    // orderORQueryFlowOCS_v1_0接口名称
    public static final String orderORQueryFlowOCS_Name_v1_0 = ConfigProperties.getProperty("orderORQueryFlowOCS_Name_v1_0");
    // orderORQueryFlowOCS_v1_0接口方法名
    public static final String orderORQueryFlowOCS_Method_v1_0 = ConfigProperties.getProperty("orderORQueryFlowOCS_Method_v1_0");
    // orderORQueryFlowOCS_v1_0接口url
    public static final String orderORQueryFlowOCSURL_v1_0 = ConfigProperties.getProperty("orderORQueryFlowOCSURL_v1_0");
    // orderORQueryFlowOCS_v1_0接口版本号
    public static final String orderORQueryFlowOCS_version_v1_0 = ConfigProperties.getProperty("orderORQueryFlowOCS_version_v1_0");
    // orderORQueryFlowOCS_v1_0接口认证秘钥
    public static final String orderORQueryFlowOCS_AKEY_v1_0 = ConfigProperties.getProperty("orderORQueryFlowOCS_AKEY_v1_0");

    /**
     * 配置queryAddress_v1_0接口信息
     */
    // queryAddress_v1_0接口名称
    public static final String queryAddress_Name_v1_0 = ConfigProperties.getProperty("queryAddress_Name_v1_0");
    // queryAddress_v1_0接口方法名
    public static final String queryAddress_Method_v1_0 = ConfigProperties.getProperty("queryAddress_Method_v1_0");
    // queryAddress_v1_0接口url
    public static final String queryAddressURL_v1_0 = ConfigProperties.getProperty("queryAddressURL_v1_0");
    // queryAddress_v1_0接口版本号
    public static final String queryAddress_version_v1_0 = ConfigProperties.getProperty("queryAddress_version_v1_0");
    // queryAddress_v1_0接口认证秘钥
    public static final String queryAddress_AKEY_v1_0 = ConfigProperties.getProperty("queryAddress_AKEY_v1_0");

    /**
     * 配置queryCallState_v1_0接口信息
     */
    // queryCallState_v1_0接口名称
    public static final String queryCallState_Name_v1_0 = ConfigProperties.getProperty("queryCallState_Name_v1_0");
    // queryCallState_v1_0接口方法名
    public static final String queryCallState_Method_v1_0 = ConfigProperties.getProperty("queryCallState_Method_v1_0");
    // queryCallState_v1_0接口url
    public static final String queryCallStateURL_v1_0 = ConfigProperties.getProperty("queryCallStateURL_v1_0");
    // queryCallState_v1_0接口版本号
    public static final String queryCallState_version_v1_0 = ConfigProperties.getProperty("queryCallState_version_v1_0");
    // queryCallState_v1_0接口认证秘钥
    public static final String queryCallState_AKEY_v1_0 = ConfigProperties.getProperty("queryCallState_AKEY_v1_0");

    /**
     * 配置queryCEPCodeByDQInput_v1_0接口信息
     */
    // queryCEPCodeByDQInput_v1_0接口名称
    public static final String queryCEPCodeByDQInput_Name_v1_0 = ConfigProperties.getProperty("queryCEPCodeByDQInput_Name_v1_0");
    // queryCEPCodeByDQInput_v1_0接口方法名
    public static final String queryCEPCodeByDQInput_Method_v1_0 = ConfigProperties.getProperty("queryCEPCodeByDQInput_Method_v1_0");
    // queryCEPCodeByDQInput_v1_0接口url
    public static final String queryCEPCodeByDQInputURL_v1_0 = ConfigProperties.getProperty("queryCEPCodeByDQInputURL_v1_0");
    // queryCEPCodeByDQInput_v1_0接口版本号
    public static final String queryCEPCodeByDQInput_version_v1_0 = ConfigProperties.getProperty("queryCEPCodeByDQInput_version_v1_0");
    // queryCEPCodeByDQInput_v1_0接口认证秘钥
    public static final String queryCEPCodeByDQInput_AKEY_v1_0 = ConfigProperties.getProperty("queryCEPCodeByDQInput_AKEY_v1_0");

    /**
     * 配置queryProdAssetBasicInfo_v1_0接口信息
     */
    // queryProdAssetBasicInfo_v1_0接口名称
    public static final String queryProdAssetBasicInfo_Name_v1_0 = ConfigProperties.getProperty("queryProdAssetBasicInfo_Name_v1_0");
    // queryProdAssetBasicInfo_v1_0接口方法名
    public static final String queryProdAssetBasicInfo_Method_v1_0 = ConfigProperties.getProperty("queryProdAssetBasicInfo_Method_v1_0");
    // queryProdAssetBasicInfo_v1_0接口url
    public static final String queryProdAssetBasicInfoURL_v1_0 = ConfigProperties.getProperty("queryProdAssetBasicInfoURL_v1_0");
    // queryProdAssetBasicInfo_v1_0接口版本号
    public static final String queryProdAssetBasicInfo_version_v1_0 = ConfigProperties.getProperty("queryProdAssetBasicInfo_version_v1_0");
    // queryProdAssetBasicInfo_v1_0接口认证秘钥
    public static final String queryProdAssetBasicInfo_AKEY_v1_0 = ConfigProperties.getProperty("queryProdAssetBasicInfo_AKEY_v1_0");

    /**
     * 配置queryListDistunteInfo_v1_0接口信息
     */
    // queryListDistunteInfo_v1_0接口名称
    public static final String queryListDistunteInfo_Name_v1_0 = ConfigProperties.getProperty("queryListDistunteInfo_Name_v1_0");
    // queryListDistunteInfo_v1_0接口方法名
    public static final String queryListDistunteInfo_Method_v1_0 = ConfigProperties.getProperty("queryListDistunteInfo_Method_v1_0");
    // queryListDistunteInfo_v1_0接口url
    public static final String queryListDistunteInfoURL_v1_0 = ConfigProperties.getProperty("queryListDistunteInfoURL_v1_0");
    // queryListDistunteInfo_v1_0接口版本号
    public static final String queryListDistunteInfo_version_v1_0 = ConfigProperties.getProperty("queryListDistunteInfo_version_v1_0");
    // queryListDistunteInfo_v1_0接口认证秘钥
    public static final String queryListDistunteInfo_AKEY_v1_0 = ConfigProperties.getProperty("queryListDistunteInfo_AKEY_v1_0");

    /**
     * 配置getPackageDetailsPost_v1_0接口信息
     */
    // getPackageDetailsPost_v1_0接口名称
    public static final String getPackageDetailsPost_Name_v1_0 = ConfigProperties.getProperty("getPackageDetailsPost_Name_v1_0");
    // getPackageDetailsPost_v1_0接口方法名
    public static final String getPackageDetailsPost_Method_v1_0 = ConfigProperties.getProperty("getPackageDetailsPost_Method_v1_0");
    // getPackageDetailsPost_v1_0接口url
    public static final String getPackageDetailsPostURL_v1_0 = ConfigProperties.getProperty("getPackageDetailsPostURL_v1_0");
    // getPackageDetailsPost_v1_0接口版本号
    public static final String getPackageDetailsPost_version_v1_0 = ConfigProperties.getProperty("getPackageDetailsPost_version_v1_0");
    // getPackageDetailsPost_v1_0接口认证秘钥
    public static final String getPackageDetailsPost_AKEY_v1_0 = ConfigProperties.getProperty("getPackageDetailsPost_AKEY_v1_0");

    /**
     * 配置queryPointsBasicInfo_v1_0接口信息
     */
    // queryPointsBasicInfo_v1_0接口名称
    public static final String queryPointsBasicInfo_Name_v1_0 = ConfigProperties.getProperty("queryPointsBasicInfo_Name_v1_0");
    // queryPointsBasicInfo_v1_0接口方法名
    public static final String queryPointsBasicInfo_Method_v1_0 = ConfigProperties.getProperty("queryPointsBasicInfo_Method_v1_0");
    // queryPointsBasicInfo_v1_0接口url
    public static final String queryPointsBasicInfoURL_v1_0 = ConfigProperties.getProperty("queryPointsBasicInfoURL_v1_0");
    // queryPointsBasicInfo_v1_0接口版本号
    public static final String queryPointsBasicInfo_version_v1_0 = ConfigProperties.getProperty("queryPointsBasicInfo_version_v1_0");
    // queryPointsBasicInfo_v1_0接口认证秘钥
    public static final String queryPointsBasicInfo_AKEY_v1_0 = ConfigProperties.getProperty("queryPointsBasicInfo_AKEY_v1_0");

    /**
     * 配置queryPrepayAmount_v1_0接口信息
     */
    // queryPrepayAmount_v1_0接口名称
    public static final String queryPrepayAmount_Name_v1_0 = ConfigProperties.getProperty("queryPrepayAmount_Name_v1_0");
    // queryPrepayAmount_v1_0接口方法名
    public static final String queryPrepayAmount_Method_v1_0 = ConfigProperties.getProperty("queryPrepayAmount_Method_v1_0");
    // queryPrepayAmount_v1_0接口url
    public static final String queryPrepayAmountURL_v1_0 = ConfigProperties.getProperty("queryPrepayAmountURL_v1_0");
    // queryPrepayAmount_v1_0接口版本号
    public static final String queryPrepayAmount_version_v1_0 = ConfigProperties.getProperty("queryPrepayAmount_version_v1_0");
    // queryPrepayAmount_v1_0接口认证秘钥
    public static final String queryPrepayAmount_AKEY_v1_0 = ConfigProperties.getProperty("queryPrepayAmount_AKEY_v1_0");

    /**
     * 配置queryPromInfoByServiceId_v1_0接口信息
     */
    // queryPromInfoByServiceId_v1_0接口名称
    public static final String queryPromInfoByServiceId_Name_v1_0 = ConfigProperties.getProperty("queryPromInfoByServiceId_Name_v1_0");
    // queryPromInfoByServiceId_v1_0接口方法名
    public static final String queryPromInfoByServiceId_Method_v1_0 = ConfigProperties.getProperty("queryPromInfoByServiceId_Method_v1_0");
    // queryPromInfoByServiceId_v1_0接口url
    public static final String queryPromInfoByServiceIdURL_v1_0 = ConfigProperties.getProperty("queryPromInfoByServiceIdURL_v1_0");
    // queryPromInfoByServiceId_v1_0接口版本号
    public static final String queryPromInfoByServiceId_version_v1_0 = ConfigProperties.getProperty("queryPromInfoByServiceId_version_v1_0");
    // queryPromInfoByServiceId_v1_0接口认证秘钥
    public static final String queryPromInfoByServiceId_AKEY_v1_0 = ConfigProperties.getProperty("queryPromInfoByServiceId_AKEY_v1_0");

    /**
     * 配置queryRatableFlowPresentDetail_v1_0接口信息
     */
    // queryRatableFlowPresentDetail_v1_0接口名称
    public static final String queryRatableFlowPresentDetail_Name_v1_0 = ConfigProperties.getProperty("queryRatableFlowPresentDetail_Name_v1_0");
    // queryRatableFlowPresentDetail_v1_0接口方法名
    public static final String queryRatableFlowPresentDetail_Method_v1_0 = ConfigProperties.getProperty("queryRatableFlowPresentDetail_Method_v1_0");
    // queryRatableFlowPresentDetail_v1_0接口url
    public static final String queryRatableFlowPresentDetailURL_v1_0 = ConfigProperties.getProperty("queryRatableFlowPresentDetailURL_v1_0");
    // queryRatableFlowPresentDetail_v1_0接口版本号
    public static final String queryRatableFlowPresentDetail_version_v1_0 = ConfigProperties.getProperty("queryRatableFlowPresentDetail_version_v1_0");
    // queryRatableFlowPresentDetail_v1_0接口认证秘钥
    public static final String queryRatableFlowPresentDetail_AKEY_v1_0 = ConfigProperties.getProperty("queryRatableFlowPresentDetail_AKEY_v1_0");

    /**
     * 配置queryRedPackCountNumByCrmId_v1_0接口信息
     */
    // queryRedPackCountNumByCrmId_v1_0接口名称
    public static final String queryRedPackCountNumByCrmId_Name_v1_0 = ConfigProperties.getProperty("queryRedPackCountNumByCrmId_Name_v1_0");
    // queryRedPackCountNumByCrmId_v1_0接口方法名
    public static final String queryRedPackCountNumByCrmId_Method_v1_0 = ConfigProperties.getProperty("queryRedPackCountNumByCrmId_Method_v1_0");
    // queryRedPackCountNumByCrmId_v1_0接口url
    public static final String queryRedPackCountNumByCrmIdURL_v1_0 = ConfigProperties.getProperty("queryRedPackCountNumByCrmIdURL_v1_0");
    // queryRedPackCountNumByCrmId_v1_0接口版本号
    public static final String queryRedPackCountNumByCrmId_version_v1_0 = ConfigProperties.getProperty("queryRedPackCountNumByCrmId_version_v1_0");
    // queryRedPackCountNumByCrmId_v1_0接口认证秘钥
    public static final String queryRedPackCountNumByCrmId_AKEY_v1_0 = ConfigProperties.getProperty("queryRedPackCountNumByCrmId_AKEY_v1_0");

    /**
     * 配置queryRedPackIdAndName_v1_0接口信息
     */
    // queryRedPackIdAndName_v1_0接口名称
    public static final String queryRedPackIdAndName_Name_v1_0 = ConfigProperties.getProperty("queryRedPackIdAndName_Name_v1_0");
    // queryRedPackIdAndName_v1_0接口方法名
    public static final String queryRedPackIdAndName_Method_v1_0 = ConfigProperties.getProperty("queryRedPackIdAndName_Method_v1_0");
    // queryRedPackIdAndName_v1_0接口url
    public static final String queryRedPackIdAndNameURL_v1_0 = ConfigProperties.getProperty("queryRedPackIdAndNameURL_v1_0");
    // queryRedPackIdAndName_v1_0接口版本号
    public static final String queryRedPackIdAndName_version_v1_0 = ConfigProperties.getProperty("queryRedPackIdAndName_version_v1_0");
    // queryRedPackIdAndName_v1_0接口认证秘钥
    public static final String queryRedPackIdAndName_AKEY_v1_0 = ConfigProperties.getProperty("queryRedPackIdAndName_AKEY_v1_0");

    /**
     * 配置queryRedPackListByCrmId_v1_0接口信息
     */
    // queryRedPackListByCrmId_v1_0接口名称
    public static final String queryRedPackListByCrmId_Name_v1_0 = ConfigProperties.getProperty("queryRedPackListByCrmId_Name_v1_0");
    // queryRedPackListByCrmId_v1_0接口方法名
    public static final String queryRedPackListByCrmId_Method_v1_0 = ConfigProperties.getProperty("queryRedPackListByCrmId_Method_v1_0");
    // queryRedPackListByCrmId_v1_0接口url
    public static final String queryRedPackListByCrmIdURL_v1_0 = ConfigProperties.getProperty("queryRedPackListByCrmIdURL_v1_0");
    // queryRedPackListByCrmId_v1_0接口版本号
    public static final String queryRedPackListByCrmId_version_v1_0 = ConfigProperties.getProperty("queryRedPackListByCrmId_version_v1_0");
    // queryRedPackListByCrmId_v1_0接口认证秘钥
    public static final String queryRedPackListByCrmId_AKEY_v1_0 = ConfigProperties.getProperty("queryRedPackListByCrmId_AKEY_v1_0");

    /**
     * 配置queryRightHis_v1_0接口信息
     */
    // queryRightHis_v1_0接口名称
    public static final String queryRightHis_Name_v1_0 = ConfigProperties.getProperty("queryRightHis_Name_v1_0");
    // queryRightHis_v1_0接口方法名
    public static final String queryRightHis_Method_v1_0 = ConfigProperties.getProperty("queryRightHis_Method_v1_0");
    // queryRightHis_v1_0接口url
    public static final String queryRightHisURL_v1_0 = ConfigProperties.getProperty("queryRightHisURL_v1_0");
    // queryRightHis_v1_0接口版本号
    public static final String queryRightHis_version_v1_0 = ConfigProperties.getProperty("queryRightHis_version_v1_0");
    // queryRightHis_v1_0接口认证秘钥
    public static final String queryRightHis_AKEY_v1_0 = ConfigProperties.getProperty("queryRightHis_AKEY_v1_0");

    /**
     * 配置querySerialnbrListByBPnbr_v1_0接口信息
     */
    // querySerialnbrListByBPnbr_v1_0接口名称
    public static final String querySerialnbrListByBPnbr_Name_v1_0 = ConfigProperties.getProperty("querySerialnbrListByBPnbr_Name_v1_0");
    // querySerialnbrListByBPnbr_v1_0接口方法名
    public static final String querySerialnbrListByBPnbr_Method_v1_0 = ConfigProperties.getProperty("querySerialnbrListByBPnbr_Method_v1_0");
    // querySerialnbrListByBPnbr_v1_0接口url
    public static final String querySerialnbrListByBPnbrURL_v1_0 = ConfigProperties.getProperty("querySerialnbrListByBPnbrURL_v1_0");
    // querySerialnbrListByBPnbr_v1_0接口版本号
    public static final String querySerialnbrListByBPnbr_version_v1_0 = ConfigProperties.getProperty("querySerialnbrListByBPnbr_version_v1_0");
    // querySerialnbrListByBPnbr_v1_0接口认证秘钥
    public static final String querySerialnbrListByBPnbr_AKEY_v1_0 = ConfigProperties.getProperty("querySerialnbrListByBPnbr_AKEY_v1_0");

    /**
     * 配置queryStarCustRank_v1_0接口信息
     */
    // queryStarCustRank_v1_0接口名称
    public static final String queryStarCustRank_Name_v1_0 = ConfigProperties.getProperty("queryStarCustRank_Name_v1_0");
    // queryStarCustRank_v1_0接口方法名
    public static final String queryStarCustRank_Method_v1_0 = ConfigProperties.getProperty("queryStarCustRank_Method_v1_0");
    // queryStarCustRank_v1_0接口url
    public static final String queryStarCustRankURL_v1_0 = ConfigProperties.getProperty("queryStarCustRankURL_v1_0");
    // queryStarCustRank_v1_0接口版本号
    public static final String queryStarCustRank_version_v1_0 = ConfigProperties.getProperty("queryStarCustRank_version_v1_0");
    // queryStarCustRank_v1_0接口认证秘钥
    public static final String queryStarCustRank_AKEY_v1_0 = ConfigProperties.getProperty("queryStarCustRank_AKEY_v1_0");

    /**
     * 配置queryStarCustRight_v1_0接口信息
     */
    // queryStarCustRight_v1_0接口名称
    public static final String queryStarCustRight_Name_v1_0 = ConfigProperties.getProperty("queryStarCustRight_Name_v1_0");
    // queryStarCustRight_v1_0接口方法名
    public static final String queryStarCustRight_Method_v1_0 = ConfigProperties.getProperty("queryStarCustRight_Method_v1_0");
    // queryStarCustRight_v1_0接口url
    public static final String queryStarCustRightURL_v1_0 = ConfigProperties.getProperty("queryStarCustRightURL_v1_0");
    // queryStarCustRight_v1_0接口版本号
    public static final String queryStarCustRight_version_v1_0 = ConfigProperties.getProperty("queryStarCustRight_version_v1_0");
    // queryStarCustRight_v1_0接口认证秘钥
    public static final String queryStarCustRight_AKEY_v1_0 = ConfigProperties.getProperty("queryStarCustRight_AKEY_v1_0");

    /**
     * 配置querySubsInstQrySV_v1_0接口信息
     */
    // querySubsInstQrySV_v1_0接口名称
    public static final String querySubsInstQrySV_Name_v1_0 = ConfigProperties.getProperty("querySubsInstQrySV_Name_v1_0");
    // querySubsInstQrySV_v1_0接口方法名
    public static final String querySubsInstQrySV_Method_v1_0 = ConfigProperties.getProperty("querySubsInstQrySV_Method_v1_0");
    // querySubsInstQrySV_v1_0接口url
    public static final String querySubsInstQrySVURL_v1_0 = ConfigProperties.getProperty("querySubsInstQrySVURL_v1_0");
    // querySubsInstQrySV_v1_0接口版本号
    public static final String querySubsInstQrySV_version_v1_0 = ConfigProperties.getProperty("querySubsInstQrySV_version_v1_0");
    // querySubsInstQrySV_v1_0接口认证秘钥
    public static final String querySubsInstQrySV_AKEY_v1_0 = ConfigProperties.getProperty("querySubsInstQrySV_AKEY_v1_0");

    /**
     * 配置queryMyPoints_v1_0接口信息
     */
    // queryMyPoints_v1_0接口名称
    public static final String queryMyPoints_Name_v1_0 = ConfigProperties.getProperty("queryMyPoints_Name_v1_0");
    // queryMyPoints_v1_0接口方法名
    public static final String queryMyPoints_Method_v1_0 = ConfigProperties.getProperty("queryMyPoints_Method_v1_0");
    // queryMyPoints_v1_0接口url
    public static final String queryMyPointsURL_v1_0 = ConfigProperties.getProperty("queryMyPointsURL_v1_0");
    // queryMyPoints_v1_0接口版本号
    public static final String queryMyPoints_version_v1_0 = ConfigProperties.getProperty("queryMyPoints_version_v1_0");
    // queryMyPoints_v1_0接口认证秘钥
    public static final String queryMyPoints_AKEY_v1_0 = ConfigProperties.getProperty("queryMyPoints_AKEY_v1_0");

    /**
     * 配置searchWastePoints_v1_0接口信息
     */
    // searchWastePoints_v1_0接口名称
    public static final String searchWastePoints_Name_v1_0 = ConfigProperties.getProperty("searchWastePoints_Name_v1_0");
    // searchWastePoints_v1_0接口方法名
    public static final String searchWastePoints_Method_v1_0 = ConfigProperties.getProperty("searchWastePoints_Method_v1_0");
    // searchWastePoints_v1_0接口url
    public static final String searchWastePointsURL_v1_0 = ConfigProperties.getProperty("searchWastePointsURL_v1_0");
    // searchWastePoints_v1_0接口版本号
    public static final String searchWastePoints_version_v1_0 = ConfigProperties.getProperty("searchWastePoints_version_v1_0");
    // searchWastePoints_v1_0接口认证秘钥
    public static final String searchWastePoints_AKEY_v1_0 = ConfigProperties.getProperty("searchWastePoints_AKEY_v1_0");

    /**
     * 配置statusQueryService_v1_0接口信息
     */
    // statusQueryService_v1_0接口名称
    public static final String statusQueryService_Name_v1_0 = ConfigProperties.getProperty("statusQueryService_Name_v1_0");
    // statusQueryService_v1_0接口方法名
    public static final String statusQueryService_Method_v1_0 = ConfigProperties.getProperty("statusQueryService_Method_v1_0");
    // statusQueryService_v1_0接口url
    public static final String statusQueryServiceURL_v1_0 = ConfigProperties.getProperty("statusQueryServiceURL_v1_0");
    // statusQueryService_v1_0接口版本号
    public static final String statusQueryService_version_v1_0 = ConfigProperties.getProperty("statusQueryService_version_v1_0");
    // statusQueryService_v1_0接口认证秘钥
    public static final String statusQueryService_AKEY_v1_0 = ConfigProperties.getProperty("statusQueryService_AKEY_v1_0");

    /**
     * 配置subscribeReqSV_v1_0接口信息
     */
    // subscribeReqSV_v1_0接口名称
    public static final String subscribeReqSV_Name_v1_0 = ConfigProperties.getProperty("subscribeReqSV_Name_v1_0");
    // subscribeReqSV_v1_0接口方法名
    public static final String subscribeReqSV_Method_v1_0 = ConfigProperties.getProperty("subscribeReqSV_Method_v1_0");
    // subscribeReqSV_v1_0接口url
    public static final String subscribeReqSVURL_v1_0 = ConfigProperties.getProperty("subscribeReqSVURL_v1_0");
    // subscribeReqSV_v1_0接口版本号
    public static final String subscribeReqSV_version_v1_0 = ConfigProperties.getProperty("subscribeReqSV_version_v1_0");
    // subscribeReqSV_v1_0接口认证秘钥
    public static final String subscribeReqSV_AKEY_v1_0 = ConfigProperties.getProperty("subscribeReqSV_AKEY_v1_0");

    /**
     * 配置validateCampaign_v1_0接口信息
     */
    // validateCampaign_v1_0接口名称
    public static final String validateCampaign_Name_v1_0 = ConfigProperties.getProperty("validateCampaign_Name_v1_0");
    // validateCampaign_v1_0接口方法名
    public static final String validateCampaign_Method_v1_0 = ConfigProperties.getProperty("validateCampaign_Method_v1_0");
    // validateCampaign_v1_0接口url
    public static final String validateCampaignURL_v1_0 = ConfigProperties.getProperty("validateCampaignURL_v1_0");
    // validateCampaign_v1_0接口版本号
    public static final String validateCampaign_version_v1_0 = ConfigProperties.getProperty("validateCampaign_version_v1_0");
    // validateCampaign_v1_0接口认证秘钥
    public static final String validateCampaign_AKEY_v1_0 = ConfigProperties.getProperty("validateCampaign_AKEY_v1_0");

    /**
     * 配置iPTVUsedDaysQuery_v1_0接口信息
     */
    // iPTVUsedDaysQuery_v1_0接口名称
    public static final String iPTVUsedDaysQuery_Name_v1_0 = ConfigProperties.getProperty("iPTVUsedDaysQuery_Name_v1_0");
    // iPTVUsedDaysQuery_v1_0接口方法名
    public static final String iPTVUsedDaysQuery_Method_v1_0 = ConfigProperties.getProperty("iPTVUsedDaysQuery_Method_v1_0");
    // iPTVUsedDaysQuery_v1_0接口url
    public static final String iPTVUsedDaysQueryURL_v1_0 = ConfigProperties.getProperty("iPTVUsedDaysQueryURL_v1_0");
    // iPTVUsedDaysQuery_v1_0接口版本号
    public static final String iPTVUsedDaysQuery_version_v1_0 = ConfigProperties.getProperty("iPTVUsedDaysQuery_version_v1_0");
    // iPTVUsedDaysQuery_v1_0接口认证秘钥
    public static final String iPTVUsedDaysQuery_AKEY_v1_0 = ConfigProperties.getProperty("iPTVUsedDaysQuery_AKEY_v1_0");

    /**
     * 配置iPTVCurOrdersQuery_v1_0接口信息
     */
    // iPTVCurOrdersQuery_v1_0接口名称
    public static final String iPTVCurOrdersQuery_Name_v1_0 = ConfigProperties.getProperty("iPTVCurOrdersQuery_Name_v1_0");
    // iPTVCurOrdersQuery_v1_0接口方法名
    public static final String iPTVCurOrdersQuery_Method_v1_0 = ConfigProperties.getProperty("iPTVCurOrdersQuery_Method_v1_0");
    // iPTVCurOrdersQuery_v1_0接口url
    public static final String iPTVCurOrdersQueryURL_v1_0 = ConfigProperties.getProperty("iPTVCurOrdersQueryURL_v1_0");
    // iPTVCurOrdersQuery_v1_0接口版本号
    public static final String iPTVCurOrdersQuery_version_v1_0 = ConfigProperties.getProperty("iPTVCurOrdersQuery_version_v1_0");
    // iPTVCurOrdersQuery_v1_0接口认证秘钥
    public static final String iPTVCurOrdersQuery_AKEY_v1_0 = ConfigProperties.getProperty("iPTVCurOrdersQuery_AKEY_v1_0");

    /**
     * 配置iPTVHstOrdersQuery_v1_0接口信息
     */
    // iPTVHstOrdersQuery_v1_0接口名称
    public static final String iPTVHstOrdersQuery_Name_v1_0 = ConfigProperties.getProperty("iPTVHstOrdersQuery_Name_v1_0");
    // iPTVHstOrdersQuery_v1_0接口方法名
    public static final String iPTVHstOrdersQuery_Method_v1_0 = ConfigProperties.getProperty("iPTVHstOrdersQuery_Method_v1_0");
    // iPTVHstOrdersQuery_v1_0接口url
    public static final String iPTVHstOrdersQueryURL_v1_0 = ConfigProperties.getProperty("iPTVHstOrdersQueryURL_v1_0");
    // iPTVHstOrdersQuery_v1_0接口版本号
    public static final String iPTVHstOrdersQuery_version_v1_0 = ConfigProperties.getProperty("iPTVHstOrdersQuery_version_v1_0");
    // iPTVHstOrdersQuery_v1_0接口认证秘钥
    public static final String iPTVHstOrdersQuery_AKEY_v1_0 = ConfigProperties.getProperty("iPTVHstOrdersQuery_AKEY_v1_0");

    /**
     * 配置iPTVVODDetailQuery_v1_0接口信息
     */
    // iPTVVODDetailQuery_v1_0接口名称
    public static final String iPTVVODDetailQuery_Name_v1_0 = ConfigProperties.getProperty("iPTVVODDetailQuery_Name_v1_0");
    // iPTVVODDetailQuery_v1_0接口方法名
    public static final String iPTVVODDetailQuery_Method_v1_0 = ConfigProperties.getProperty("iPTVVODDetailQuery_Method_v1_0");
    // iPTVVODDetailQuery_v1_0接口url
    public static final String iPTVVODDetailQueryURL_v1_0 = ConfigProperties.getProperty("iPTVVODDetailQueryURL_v1_0");
    // iPTVVODDetailQuery_v1_0接口版本号
    public static final String iPTVVODDetailQuery_version_v1_0 = ConfigProperties.getProperty("iPTVVODDetailQuery_version_v1_0");
    // iPTVVODDetailQuery_v1_0接口认证秘钥
    public static final String iPTVVODDetailQuery_AKEY_v1_0 = ConfigProperties.getProperty("iPTVVODDetailQuery_AKEY_v1_0");

    /**
     * 配置iPTVUnsubscribe_v1_0接口信息
     */
    // iPTVUnsubscribe_v1_0接口名称
    public static final String iPTVUnsubscribe_Name_v1_0 = ConfigProperties.getProperty("iPTVUnsubscribe_Name_v1_0");
    // iPTVUnsubscribe_v1_0接口方法名
    public static final String iPTVUnsubscribe_Method_v1_0 = ConfigProperties.getProperty("iPTVUnsubscribe_Method_v1_0");
    // iPTVUnsubscribe_v1_0接口url
    public static final String iPTVUnsubscribeURL_v1_0 = ConfigProperties.getProperty("iPTVUnsubscribeURL_v1_0");
    // iPTVUnsubscribe_v1_0接口版本号
    public static final String iPTVUnsubscribe_version_v1_0 = ConfigProperties.getProperty("iPTVUnsubscribe_version_v1_0");
    // iPTVUnsubscribe_v1_0接口认证秘钥
    public static final String iPTVUnsubscribe_AKEY_v1_0 = ConfigProperties.getProperty("iPTVUnsubscribe_AKEY_v1_0");

    /**
     * 配置iPTVProductQuery_v1_0接口信息
     */
    // iPTVProductQuery_v1_0接口名称
    public static final String iPTVProductQuery_Name_v1_0 = ConfigProperties.getProperty("iPTVProductQuery_Name_v1_0");
    // iPTVProductQuery_v1_0接口方法名
    public static final String iPTVProductQuery_Method_v1_0 = ConfigProperties.getProperty("iPTVProductQuery_Method_v1_0");
    // iPTVProductQuery_v1_0接口url
    public static final String iPTVProductQueryURL_v1_0 = ConfigProperties.getProperty("iPTVProductQueryURL_v1_0");
    // iPTVProductQuery_v1_0接口版本号
    public static final String iPTVProductQuery_version_v1_0 = ConfigProperties.getProperty("iPTVProductQuery_version_v1_0");
    // iPTVProductQuery_v1_0接口认证秘钥
    public static final String iPTVProductQuery_AKEY_v1_0 = ConfigProperties.getProperty("iPTVProductQuery_AKEY_v1_0");

    /**
     * 配置iPTVSubscribe_v1_0接口信息
     */
    // iPTVSubscribe_v1_0接口名称
    public static final String iPTVSubscribe_Name_v1_0 = ConfigProperties.getProperty("iPTVSubscribe_Name_v1_0");
    // iPTVSubscribe_v1_0接口方法名
    public static final String iPTVSubscribe_Method_v1_0 = ConfigProperties.getProperty("iPTVSubscribe_Method_v1_0");
    // iPTVSubscribe_v1_0接口url
    public static final String iPTVSubscribeURL_v1_0 = ConfigProperties.getProperty("iPTVSubscribeURL_v1_0");
    // iPTVSubscribe_v1_0接口版本号
    public static final String iPTVSubscribe_version_v1_0 = ConfigProperties.getProperty("iPTVSubscribe_version_v1_0");
    // iPTVSubscribe_v1_0接口认证秘钥
    public static final String iPTVSubscribe_AKEY_v1_0 = ConfigProperties.getProperty("iPTVSubscribe_AKEY_v1_0");

    /**
     * 配置queryMaxSpeedByServiceId_v1_0接口信息
     */
    // queryMaxSpeedByServiceId_v1_0接口名称
    public static final String queryMaxSpeedByServiceId_Name_v1_0 = ConfigProperties.getProperty("queryMaxSpeedByServiceId_Name_v1_0");
    // queryMaxSpeedByServiceId_v1_0接口方法名
    public static final String queryMaxSpeedByServiceId_Method_v1_0 = ConfigProperties.getProperty("queryMaxSpeedByServiceId_Method_v1_0");
    // queryMaxSpeedByServiceId_v1_0接口url
    public static final String queryMaxSpeedByServiceIdURL_v1_0 = ConfigProperties.getProperty("queryMaxSpeedByServiceIdURL_v1_0");
    // queryMaxSpeedByServiceId_v1_0接口版本号
    public static final String queryMaxSpeedByServiceId_version_v1_0 = ConfigProperties.getProperty("queryMaxSpeedByServiceId_version_v1_0");
    // queryMaxSpeedByServiceId_v1_0接口认证秘钥
    public static final String queryMaxSpeedByServiceId_AKEY_v1_0 = ConfigProperties.getProperty("queryMaxSpeedByServiceId_AKEY_v1_0");

    /**
     * 配置queryUsedRedPackDetail_v2_0接口信息
     */
    // queryUsedRedPackDetail_v2_0接口名称
    public static final String queryUsedRedPackDetail_Name_v2_0 = ConfigProperties.getProperty("queryUsedRedPackDetail_Name_v2_0");
    // queryUsedRedPackDetail_v2_0接口方法名
    public static final String queryUsedRedPackDetail_Method_v2_0 = ConfigProperties.getProperty("queryUsedRedPackDetail_Method_v2_0");
    // queryUsedRedPackDetail_v2_0接口url
    public static final String queryUsedRedPackDetailURL_v2_0 = ConfigProperties.getProperty("queryUsedRedPackDetailURL_v2_0");
    // queryUsedRedPackDetail_v2_0接口版本号
    public static final String queryUsedRedPackDetail_version_v2_0 = ConfigProperties.getProperty("queryUsedRedPackDetail_version_v2_0");
    // queryUsedRedPackDetail_v2_0接口认证秘钥
    public static final String queryUsedRedPackDetail_AKEY_v2_0 = ConfigProperties.getProperty("queryUsedRedPackDetail_AKEY_v2_0");

    /**
     * 配置queryTokenUrl_v2_0接口信息
     */
    // queryTokenUrl_v2_0接口名称
    public static final String queryTokenUrl_Name_v2_0 = ConfigProperties.getProperty("queryTokenUrl_Name_v2_0");
    // queryTokenUrl_v2_0接口方法名
    public static final String queryTokenUrl_Method_v2_0 = ConfigProperties.getProperty("queryTokenUrl_Method_v2_0");
    // queryTokenUrl_v2_0接口url
    public static final String queryTokenUrlURL_v2_0 = ConfigProperties.getProperty("queryTokenUrlURL_v2_0");
    // queryTokenUrl_v2_0接口版本号
    public static final String queryTokenUrl_version_v2_0 = ConfigProperties.getProperty("queryTokenUrl_version_v2_0");
    // queryTokenUrl_v2_0接口认证秘钥
    public static final String queryTokenUrl_AKEY_v2_0 = ConfigProperties.getProperty("queryTokenUrl_AKEY_v2_0");

    /**
     * 配置queryCouponInfoByNO_v1_0接口信息
     */
    // queryCouponInfoByNO_v1_0接口名称
    public static final String queryCouponInfoByNO_Name_v1_0 = ConfigProperties.getProperty("queryCouponInfoByNO_Name_v1_0");
    // queryCouponInfoByNO_v1_0接口方法名
    public static final String queryCouponInfoByNO_Method_v1_0 = ConfigProperties.getProperty("queryCouponInfoByNO_Method_v1_0");
    // queryCouponInfoByNO_v1_0接口url
    public static final String queryCouponInfoByNOURL_v1_0 = ConfigProperties.getProperty("queryCouponInfoByNOURL_v1_0");
    // queryCouponInfoByNO_v1_0接口版本号
    public static final String queryCouponInfoByNO_version_v1_0 = ConfigProperties.getProperty("queryCouponInfoByNO_version_v1_0");
    // queryCouponInfoByNO_v1_0接口认证秘钥
    public static final String queryCouponInfoByNO_AKEY_v1_0 = ConfigProperties.getProperty("queryCouponInfoByNO_AKEY_v1_0");

    /**
     * 配置queryDeviceListByadnbr_v1_0接口信息
     */
    // queryDeviceListByadnbr_v1_0接口名称
    public static final String queryDeviceListByadnbr_Name_v1_0 = ConfigProperties.getProperty("queryDeviceListByadnbr_Name_v1_0");
    // queryDeviceListByadnbr_v1_0接口方法名
    public static final String queryDeviceListByadnbr_Method_v1_0 = ConfigProperties.getProperty("queryDeviceListByadnbr_Method_v1_0");
    // queryDeviceListByadnbr_v1_0接口url
    public static final String queryDeviceListByadnbrURL_v1_0 = ConfigProperties.getProperty("queryDeviceListByadnbrURL_v1_0");
    // queryDeviceListByadnbr_v1_0接口版本号
    public static final String queryDeviceListByadnbr_version_v1_0 = ConfigProperties.getProperty("queryDeviceListByadnbr_version_v1_0");
    // queryDeviceListByadnbr_v1_0接口认证秘钥
    public static final String queryDeviceListByadnbr_AKEY_v1_0 = ConfigProperties.getProperty("queryDeviceListByadnbr_AKEY_v1_0");

    /**
     * 配置queryDLJSInfo_v1_0接口信息
     */
    // queryDLJSInfo_v1_0接口名称
    public static final String queryDLJSInfo_Name_v1_0 = ConfigProperties.getProperty("queryDLJSInfo_Name_v1_0");
    // queryDLJSInfo_v1_0接口方法名
    public static final String queryDLJSInfo_Method_v1_0 = ConfigProperties.getProperty("queryDLJSInfo_Method_v1_0");
    // queryDLJSInfo_v1_0接口url
    public static final String queryDLJSInfoURL_v1_0 = ConfigProperties.getProperty("queryDLJSInfoURL_v1_0");
    // queryDLJSInfo_v1_0接口版本号
    public static final String queryDLJSInfo_version_v1_0 = ConfigProperties.getProperty("queryDLJSInfo_version_v1_0");
    // queryDLJSInfo_v1_0接口认证秘钥
    public static final String queryDLJSInfo_AKEY_v1_0 = ConfigProperties.getProperty("queryDLJSInfo_AKEY_v1_0");

    /**
     * 配置queryEFPInvoice_v1_0接口信息
     */
    // queryEFPInvoice_v1_0接口名称
    public static final String queryEFPInvoice_Name_v1_0 = ConfigProperties.getProperty("queryEFPInvoice_Name_v1_0");
    // queryEFPInvoice_v1_0接口方法名
    public static final String queryEFPInvoice_Method_v1_0 = ConfigProperties.getProperty("queryEFPInvoice_Method_v1_0");
    // queryEFPInvoice_v1_0接口url
    public static final String queryEFPInvoiceURL_v1_0 = ConfigProperties.getProperty("queryEFPInvoiceURL_v1_0");
    // queryEFPInvoice_v1_0接口版本号
    public static final String queryEFPInvoice_version_v1_0 = ConfigProperties.getProperty("queryEFPInvoice_version_v1_0");
    // queryEFPInvoice_v1_0接口认证秘钥
    public static final String queryEFPInvoice_AKEY_v1_0 = ConfigProperties.getProperty("queryEFPInvoice_AKEY_v1_0");

    /**
     * 配置queryExeRightRecord_v1_0接口信息
     */
    // queryExeRightRecord_v1_0接口名称
    public static final String queryExeRightRecord_Name_v1_0 = ConfigProperties.getProperty("queryExeRightRecord_Name_v1_0");
    // queryExeRightRecord_v1_0接口方法名
    public static final String queryExeRightRecord_Method_v1_0 = ConfigProperties.getProperty("queryExeRightRecord_Method_v1_0");
    // queryExeRightRecord_v1_0接口url
    public static final String queryExeRightRecordURL_v1_0 = ConfigProperties.getProperty("queryExeRightRecordURL_v1_0");
    // queryExeRightRecord_v1_0接口版本号
    public static final String queryExeRightRecord_version_v1_0 = ConfigProperties.getProperty("queryExeRightRecord_version_v1_0");
    // queryExeRightRecord_v1_0接口认证秘钥
    public static final String queryExeRightRecord_AKEY_v1_0 = ConfigProperties.getProperty("queryExeRightRecord_AKEY_v1_0");

    /**
     * 配置queryFreeFlowValueByServiceNum_v1_0接口信息
     */
    // queryFreeFlowValueByServiceNum_v1_0接口名称
    public static final String queryFreeFlowValueByServiceNum_Name_v1_0 = ConfigProperties.getProperty("queryFreeFlowValueByServiceNum_Name_v1_0");
    // queryFreeFlowValueByServiceNum_v1_0接口方法名
    public static final String queryFreeFlowValueByServiceNum_Method_v1_0 = ConfigProperties.getProperty("queryFreeFlowValueByServiceNum_Method_v1_0");
    // queryFreeFlowValueByServiceNum_v1_0接口url
    public static final String queryFreeFlowValueByServiceNumURL_v1_0 = ConfigProperties.getProperty("queryFreeFlowValueByServiceNumURL_v1_0");
    // queryFreeFlowValueByServiceNum_v1_0接口版本号
    public static final String queryFreeFlowValueByServiceNum_version_v1_0 = ConfigProperties.getProperty("queryFreeFlowValueByServiceNum_version_v1_0");
    // queryFreeFlowValueByServiceNum_v1_0接口认证秘钥
    public static final String queryFreeFlowValueByServiceNum_AKEY_v1_0 = ConfigProperties.getProperty("queryFreeFlowValueByServiceNum_AKEY_v1_0");

    /**
     * 配置queryGrantBalance_v1_0接口信息
     */
    // queryGrantBalance_v1_0接口名称
    public static final String queryGrantBalance_Name_v1_0 = ConfigProperties.getProperty("queryGrantBalance_Name_v1_0");
    // queryGrantBalance_v1_0接口方法名
    public static final String queryGrantBalance_Method_v1_0 = ConfigProperties.getProperty("queryGrantBalance_Method_v1_0");
    // queryGrantBalance_v1_0接口url
    public static final String queryGrantBalanceURL_v1_0 = ConfigProperties.getProperty("queryGrantBalanceURL_v1_0");
    // queryGrantBalance_v1_0接口版本号
    public static final String queryGrantBalance_version_v1_0 = ConfigProperties.getProperty("queryGrantBalance_version_v1_0");
    // queryGrantBalance_v1_0接口认证秘钥
    public static final String queryGrantBalance_AKEY_v1_0 = ConfigProperties.getProperty("queryGrantBalance_AKEY_v1_0");

    /**
     * 配置queryGroupPackageUse_v1_0接口信息
     */
    // queryGroupPackageUse_v1_0接口名称
    public static final String queryGroupPackageUse_Name_v1_0 = ConfigProperties.getProperty("queryGroupPackageUse_Name_v1_0");
    // queryGroupPackageUse_v1_0接口方法名
    public static final String queryGroupPackageUse_Method_v1_0 = ConfigProperties.getProperty("queryGroupPackageUse_Method_v1_0");
    // queryGroupPackageUse_v1_0接口url
    public static final String queryGroupPackageUseURL_v1_0 = ConfigProperties.getProperty("queryGroupPackageUseURL_v1_0");
    // queryGroupPackageUse_v1_0接口版本号
    public static final String queryGroupPackageUse_version_v1_0 = ConfigProperties.getProperty("queryGroupPackageUse_version_v1_0");
    // queryGroupPackageUse_v1_0接口认证秘钥
    public static final String queryGroupPackageUse_AKEY_v1_0 = ConfigProperties.getProperty("queryGroupPackageUse_AKEY_v1_0");

    /**
     * 配置queryHisFlue_v1_0接口信息
     */
    // queryHisFlue_v1_0接口名称
    public static final String queryHisFlue_Name_v1_0 = ConfigProperties.getProperty("queryHisFlue_Name_v1_0");
    // queryHisFlue_v1_0接口方法名
    public static final String queryHisFlue_Method_v1_0 = ConfigProperties.getProperty("queryHisFlue_Method_v1_0");
    // queryHisFlue_v1_0接口url
    public static final String queryHisFlueURL_v1_0 = ConfigProperties.getProperty("queryHisFlueURL_v1_0");
    // queryHisFlue_v1_0接口版本号
    public static final String queryHisFlue_version_v1_0 = ConfigProperties.getProperty("queryHisFlue_version_v1_0");
    // queryHisFlue_v1_0接口认证秘钥
    public static final String queryHisFlue_AKEY_v1_0 = ConfigProperties.getProperty("queryHisFlue_AKEY_v1_0");

    /**
     * 配置queryICCIDChangeLog_v1_0接口信息
     */
    // queryICCIDChangeLog_v1_0接口名称
    public static final String queryICCIDChangeLog_Name_v1_0 = ConfigProperties.getProperty("queryICCIDChangeLog_Name_v1_0");
    // queryICCIDChangeLog_v1_0接口方法名
    public static final String queryICCIDChangeLog_Method_v1_0 = ConfigProperties.getProperty("queryICCIDChangeLog_Method_v1_0");
    // queryICCIDChangeLog_v1_0接口url
    public static final String queryICCIDChangeLogURL_v1_0 = ConfigProperties.getProperty("queryICCIDChangeLogURL_v1_0");
    // queryICCIDChangeLog_v1_0接口版本号
    public static final String queryICCIDChangeLog_version_v1_0 = ConfigProperties.getProperty("queryICCIDChangeLog_version_v1_0");
    // queryICCIDChangeLog_v1_0接口认证秘钥
    public static final String queryICCIDChangeLog_AKEY_v1_0 = ConfigProperties.getProperty("queryICCIDChangeLog_AKEY_v1_0");

    /**
     * 配置queryJFItemStorageByItemId_v1_0接口信息
     */
    // queryJFItemStorageByItemId_v1_0接口名称
    public static final String queryJFItemStorageByItemId_Name_v1_0 = ConfigProperties.getProperty("queryJFItemStorageByItemId_Name_v1_0");
    // queryJFItemStorageByItemId_v1_0接口方法名
    public static final String queryJFItemStorageByItemId_Method_v1_0 = ConfigProperties.getProperty("queryJFItemStorageByItemId_Method_v1_0");
    // queryJFItemStorageByItemId_v1_0接口url
    public static final String queryJFItemStorageByItemIdURL_v1_0 = ConfigProperties.getProperty("queryJFItemStorageByItemIdURL_v1_0");
    // queryJFItemStorageByItemId_v1_0接口版本号
    public static final String queryJFItemStorageByItemId_version_v1_0 = ConfigProperties.getProperty("queryJFItemStorageByItemId_version_v1_0");
    // queryJFItemStorageByItemId_v1_0接口认证秘钥
    public static final String queryJFItemStorageByItemId_AKEY_v1_0 = ConfigProperties.getProperty("queryJFItemStorageByItemId_AKEY_v1_0");

    /**
     * 配置queryKDKXCardSale_v1_0接口信息
     */
    // queryKDKXCardSale_v1_0接口名称
    public static final String queryKDKXCardSale_Name_v1_0 = ConfigProperties.getProperty("queryKDKXCardSale_Name_v1_0");
    // queryKDKXCardSale_v1_0接口方法名
    public static final String queryKDKXCardSale_Method_v1_0 = ConfigProperties.getProperty("queryKDKXCardSale_Method_v1_0");
    // queryKDKXCardSale_v1_0接口url
    public static final String queryKDKXCardSaleURL_v1_0 = ConfigProperties.getProperty("queryKDKXCardSaleURL_v1_0");
    // queryKDKXCardSale_v1_0接口版本号
    public static final String queryKDKXCardSale_version_v1_0 = ConfigProperties.getProperty("queryKDKXCardSale_version_v1_0");
    // queryKDKXCardSale_v1_0接口认证秘钥
    public static final String queryKDKXCardSale_AKEY_v1_0 = ConfigProperties.getProperty("queryKDKXCardSale_AKEY_v1_0");

    /**
     * 配置queryListDetailByListId_v1_0接口信息
     */
    // queryListDetailByListId_v1_0接口名称
    public static final String queryListDetailByListId_Name_v1_0 = ConfigProperties.getProperty("queryListDetailByListId_Name_v1_0");
    // queryListDetailByListId_v1_0接口方法名
    public static final String queryListDetailByListId_Method_v1_0 = ConfigProperties.getProperty("queryListDetailByListId_Method_v1_0");
    // queryListDetailByListId_v1_0接口url
    public static final String queryListDetailByListIdURL_v1_0 = ConfigProperties.getProperty("queryListDetailByListIdURL_v1_0");
    // queryListDetailByListId_v1_0接口版本号
    public static final String queryListDetailByListId_version_v1_0 = ConfigProperties.getProperty("queryListDetailByListId_version_v1_0");
    // queryListDetailByListId_v1_0接口认证秘钥
    public static final String queryListDetailByListId_AKEY_v1_0 = ConfigProperties.getProperty("queryListDetailByListId_AKEY_v1_0");

    /**
     * 配置queryListPageByCrmId_v1_0接口信息
     */
    // queryListPageByCrmId_v1_0接口名称
    public static final String queryListPageByCrmId_Name_v1_0 = ConfigProperties.getProperty("queryListPageByCrmId_Name_v1_0");
    // queryListPageByCrmId_v1_0接口方法名
    public static final String queryListPageByCrmId_Method_v1_0 = ConfigProperties.getProperty("queryListPageByCrmId_Method_v1_0");
    // queryListPageByCrmId_v1_0接口url
    public static final String queryListPageByCrmIdURL_v1_0 = ConfigProperties.getProperty("queryListPageByCrmIdURL_v1_0");
    // queryListPageByCrmId_v1_0接口版本号
    public static final String queryListPageByCrmId_version_v1_0 = ConfigProperties.getProperty("queryListPageByCrmId_version_v1_0");
    // queryListPageByCrmId_v1_0接口认证秘钥
    public static final String queryListPageByCrmId_AKEY_v1_0 = ConfigProperties.getProperty("queryListPageByCrmId_AKEY_v1_0");

    /**
     * 配置queryOrderInforByOrderNumber_v1_0接口信息
     */
    // queryOrderInforByOrderNumber_v1_0接口名称
    public static final String queryOrderInforByOrderNumber_Name_v1_0 = ConfigProperties.getProperty("queryOrderInforByOrderNumber_Name_v1_0");
    // queryOrderInforByOrderNumber_v1_0接口方法名
    public static final String queryOrderInforByOrderNumber_Method_v1_0 = ConfigProperties.getProperty("queryOrderInforByOrderNumber_Method_v1_0");
    // queryOrderInforByOrderNumber_v1_0接口url
    public static final String queryOrderInforByOrderNumberURL_v1_0 = ConfigProperties.getProperty("queryOrderInforByOrderNumberURL_v1_0");
    // queryOrderInforByOrderNumber_v1_0接口版本号
    public static final String queryOrderInforByOrderNumber_version_v1_0 = ConfigProperties.getProperty("queryOrderInforByOrderNumber_version_v1_0");
    // queryOrderInforByOrderNumber_v1_0接口认证秘钥
    public static final String queryOrderInforByOrderNumber_AKEY_v1_0 = ConfigProperties.getProperty("queryOrderInforByOrderNumber_AKEY_v1_0");

    /**
     * 配置queryOrderInforByServiceId_v1_0接口信息
     */
    // queryOrderInforByServiceId_v1_0接口名称
    public static final String queryOrderInforByServiceId_Name_v1_0 = ConfigProperties.getProperty("queryOrderInforByServiceId_Name_v1_0");
    // queryOrderInforByServiceId_v1_0接口方法名
    public static final String queryOrderInforByServiceId_Method_v1_0 = ConfigProperties.getProperty("queryOrderInforByServiceId_Method_v1_0");
    // queryOrderInforByServiceId_v1_0接口url
    public static final String queryOrderInforByServiceIdURL_v1_0 = ConfigProperties.getProperty("queryOrderInforByServiceIdURL_v1_0");
    // queryOrderInforByServiceId_v1_0接口版本号
    public static final String queryOrderInforByServiceId_version_v1_0 = ConfigProperties.getProperty("queryOrderInforByServiceId_version_v1_0");
    // queryOrderInforByServiceId_v1_0接口认证秘钥
    public static final String queryOrderInforByServiceId_AKEY_v1_0 = ConfigProperties.getProperty("queryOrderInforByServiceId_AKEY_v1_0");

    /**
     * 配置queryOrderListByAccountNumber_v1_0接口信息
     */
    // queryOrderListByAccountNumber_v1_0接口名称
    public static final String queryOrderListByAccountNumber_Name_v1_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber_Name_v1_0");
    // queryOrderListByAccountNumber_v1_0接口方法名
    public static final String queryOrderListByAccountNumber_Method_v1_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber_Method_v1_0");
    // queryOrderListByAccountNumber_v1_0接口url
    public static final String queryOrderListByAccountNumberURL_v1_0 = ConfigProperties.getProperty("queryOrderListByAccountNumberURL_v1_0");
    // queryOrderListByAccountNumber_v1_0接口版本号
    public static final String queryOrderListByAccountNumber_version_v1_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber_version_v1_0");
    // queryOrderListByAccountNumber_v1_0接口认证秘钥
    public static final String queryOrderListByAccountNumber_AKEY_v1_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber_AKEY_v1_0");

    /**
     * 配置queryOrderNumByMSGID_v1_0接口信息
     */
    // queryOrderNumByMSGID_v1_0接口名称
    public static final String queryOrderNumByMSGID_Name_v1_0 = ConfigProperties.getProperty("queryOrderNumByMSGID_Name_v1_0");
    // queryOrderNumByMSGID_v1_0接口方法名
    public static final String queryOrderNumByMSGID_Method_v1_0 = ConfigProperties.getProperty("queryOrderNumByMSGID_Method_v1_0");
    // queryOrderNumByMSGID_v1_0接口url
    public static final String queryOrderNumByMSGIDURL_v1_0 = ConfigProperties.getProperty("queryOrderNumByMSGIDURL_v1_0");
    // queryOrderNumByMSGID_v1_0接口版本号
    public static final String queryOrderNumByMSGID_version_v1_0 = ConfigProperties.getProperty("queryOrderNumByMSGID_version_v1_0");
    // queryOrderNumByMSGID_v1_0接口认证秘钥
    public static final String queryOrderNumByMSGID_AKEY_v1_0 = ConfigProperties.getProperty("queryOrderNumByMSGID_AKEY_v1_0");

    /**
     * 配置queryOWEByAccountName_v1_0接口信息
     */
    // queryOWEByAccountName_v1_0接口名称
    public static final String queryOWEByAccountName_Name_v1_0 = ConfigProperties.getProperty("queryOWEByAccountName_Name_v1_0");
    // queryOWEByAccountName_v1_0接口方法名
    public static final String queryOWEByAccountName_Method_v1_0 = ConfigProperties.getProperty("queryOWEByAccountName_Method_v1_0");
    // queryOWEByAccountName_v1_0接口url
    public static final String queryOWEByAccountNameURL_v1_0 = ConfigProperties.getProperty("queryOWEByAccountNameURL_v1_0");
    // queryOWEByAccountName_v1_0接口版本号
    public static final String queryOWEByAccountName_version_v1_0 = ConfigProperties.getProperty("queryOWEByAccountName_version_v1_0");
    // queryOWEByAccountName_v1_0接口认证秘钥
    public static final String queryOWEByAccountName_AKEY_v1_0 = ConfigProperties.getProperty("queryOWEByAccountName_AKEY_v1_0");

    /**
     * 配置queryPaymentRecharge_v1_0接口信息
     */
    // queryPaymentRecharge_v1_0接口名称
    public static final String queryPaymentRecharge_Name_v1_0 = ConfigProperties.getProperty("queryPaymentRecharge_Name_v1_0");
    // queryPaymentRecharge_v1_0接口方法名
    public static final String queryPaymentRecharge_Method_v1_0 = ConfigProperties.getProperty("queryPaymentRecharge_Method_v1_0");
    // queryPaymentRecharge_v1_0接口url
    public static final String queryPaymentRechargeURL_v1_0 = ConfigProperties.getProperty("queryPaymentRechargeURL_v1_0");
    // queryPaymentRecharge_v1_0接口版本号
    public static final String queryPaymentRecharge_version_v1_0 = ConfigProperties.getProperty("queryPaymentRecharge_version_v1_0");
    // queryPaymentRecharge_v1_0接口认证秘钥
    public static final String queryPaymentRecharge_AKEY_v1_0 = ConfigProperties.getProperty("queryPaymentRecharge_AKEY_v1_0");

    /**
     * 配置queryPointCosumeHistory_v1_0接口信息
     */
    // queryPointCosumeHistory_v1_0接口名称
    public static final String queryPointCosumeHistory_Name_v1_0 = ConfigProperties.getProperty("queryPointCosumeHistory_Name_v1_0");
    // queryPointCosumeHistory_v1_0接口方法名
    public static final String queryPointCosumeHistory_Method_v1_0 = ConfigProperties.getProperty("queryPointCosumeHistory_Method_v1_0");
    // queryPointCosumeHistory_v1_0接口url
    public static final String queryPointCosumeHistoryURL_v1_0 = ConfigProperties.getProperty("queryPointCosumeHistoryURL_v1_0");
    // queryPointCosumeHistory_v1_0接口版本号
    public static final String queryPointCosumeHistory_version_v1_0 = ConfigProperties.getProperty("queryPointCosumeHistory_version_v1_0");
    // queryPointCosumeHistory_v1_0接口认证秘钥
    public static final String queryPointCosumeHistory_AKEY_v1_0 = ConfigProperties.getProperty("queryPointCosumeHistory_AKEY_v1_0");

    /**
     * 配置queryRedPackBalRefund_v1_0接口信息
     */
    // queryRedPackBalRefund_v1_0接口名称
    public static final String queryRedPackBalRefund_Name_v1_0 = ConfigProperties.getProperty("queryRedPackBalRefund_Name_v1_0");
    // queryRedPackBalRefund_v1_0接口方法名
    public static final String queryRedPackBalRefund_Method_v1_0 = ConfigProperties.getProperty("queryRedPackBalRefund_Method_v1_0");
    // queryRedPackBalRefund_v1_0接口url
    public static final String queryRedPackBalRefundURL_v1_0 = ConfigProperties.getProperty("queryRedPackBalRefundURL_v1_0");
    // queryRedPackBalRefund_v1_0接口版本号
    public static final String queryRedPackBalRefund_version_v1_0 = ConfigProperties.getProperty("queryRedPackBalRefund_version_v1_0");
    // queryRedPackBalRefund_v1_0接口认证秘钥
    public static final String queryRedPackBalRefund_AKEY_v1_0 = ConfigProperties.getProperty("queryRedPackBalRefund_AKEY_v1_0");

    /**
     * 配置queryStarHis_v1_0接口信息
     */
    // queryStarHis_v1_0接口名称
    public static final String queryStarHis_Name_v1_0 = ConfigProperties.getProperty("queryStarHis_Name_v1_0");
    // queryStarHis_v1_0接口方法名
    public static final String queryStarHis_Method_v1_0 = ConfigProperties.getProperty("queryStarHis_Method_v1_0");
    // queryStarHis_v1_0接口url
    public static final String queryStarHisURL_v1_0 = ConfigProperties.getProperty("queryStarHisURL_v1_0");
    // queryStarHis_v1_0接口版本号
    public static final String queryStarHis_version_v1_0 = ConfigProperties.getProperty("queryStarHis_version_v1_0");
    // queryStarHis_v1_0接口认证秘钥
    public static final String queryStarHis_AKEY_v1_0 = ConfigProperties.getProperty("queryStarHis_AKEY_v1_0");

    /**
     * 配置queryStarSalesChangeHis_v1_0接口信息
     */
    // queryStarSalesChangeHis_v1_0接口名称
    public static final String queryStarSalesChangeHis_Name_v1_0 = ConfigProperties.getProperty("queryStarSalesChangeHis_Name_v1_0");
    // queryStarSalesChangeHis_v1_0接口方法名
    public static final String queryStarSalesChangeHis_Method_v1_0 = ConfigProperties.getProperty("queryStarSalesChangeHis_Method_v1_0");
    // queryStarSalesChangeHis_v1_0接口url
    public static final String queryStarSalesChangeHisURL_v1_0 = ConfigProperties.getProperty("queryStarSalesChangeHisURL_v1_0");
    // queryStarSalesChangeHis_v1_0接口版本号
    public static final String queryStarSalesChangeHis_version_v1_0 = ConfigProperties.getProperty("queryStarSalesChangeHis_version_v1_0");
    // queryStarSalesChangeHis_v1_0接口认证秘钥
    public static final String queryStarSalesChangeHis_AKEY_v1_0 = ConfigProperties.getProperty("queryStarSalesChangeHis_AKEY_v1_0");

    /**
     * 配置receiptReprintRequest_v1_0接口信息
     */
    // receiptReprintRequest_v1_0接口名称
    public static final String receiptReprintRequest_Name_v1_0 = ConfigProperties.getProperty("receiptReprintRequest_Name_v1_0");
    // receiptReprintRequest_v1_0接口方法名
    public static final String receiptReprintRequest_Method_v1_0 = ConfigProperties.getProperty("receiptReprintRequest_Method_v1_0");
    // receiptReprintRequest_v1_0接口url
    public static final String receiptReprintRequestURL_v1_0 = ConfigProperties.getProperty("receiptReprintRequestURL_v1_0");
    // receiptReprintRequest_v1_0接口版本号
    public static final String receiptReprintRequest_version_v1_0 = ConfigProperties.getProperty("receiptReprintRequest_version_v1_0");
    // receiptReprintRequest_v1_0接口认证秘钥
    public static final String receiptReprintRequest_AKEY_v1_0 = ConfigProperties.getProperty("receiptReprintRequest_AKEY_v1_0");

    /**
     * 配置returnKDKXCard_v1_0接口信息
     */
    // returnKDKXCard_v1_0接口名称
    public static final String returnKDKXCard_Name_v1_0 = ConfigProperties.getProperty("returnKDKXCard_Name_v1_0");
    // returnKDKXCard_v1_0接口方法名
    public static final String returnKDKXCard_Method_v1_0 = ConfigProperties.getProperty("returnKDKXCard_Method_v1_0");
    // returnKDKXCard_v1_0接口url
    public static final String returnKDKXCardURL_v1_0 = ConfigProperties.getProperty("returnKDKXCardURL_v1_0");
    // returnKDKXCard_v1_0接口版本号
    public static final String returnKDKXCard_version_v1_0 = ConfigProperties.getProperty("returnKDKXCard_version_v1_0");
    // returnKDKXCard_v1_0接口认证秘钥
    public static final String returnKDKXCard_AKEY_v1_0 = ConfigProperties.getProperty("returnKDKXCard_AKEY_v1_0");

    /**
     * 配置selfhelpReset_v1_0接口信息
     */
    // selfhelpReset_v1_0接口名称
    public static final String selfhelpReset_Name_v1_0 = ConfigProperties.getProperty("selfhelpReset_Name_v1_0");
    // selfhelpReset_v1_0接口方法名
    public static final String selfhelpReset_Method_v1_0 = ConfigProperties.getProperty("selfhelpReset_Method_v1_0");
    // selfhelpReset_v1_0接口url
    public static final String selfhelpResetURL_v1_0 = ConfigProperties.getProperty("selfhelpResetURL_v1_0");
    // selfhelpReset_v1_0接口版本号
    public static final String selfhelpReset_version_v1_0 = ConfigProperties.getProperty("selfhelpReset_version_v1_0");
    // selfhelpReset_v1_0接口认证秘钥
    public static final String selfhelpReset_AKEY_v1_0 = ConfigProperties.getProperty("selfhelpReset_AKEY_v1_0");

    /**
     * 配置sendEFPInvoiceSMSByFPH_v1_0接口信息
     */
    // sendEFPInvoiceSMSByFPH_v1_0接口名称
    public static final String sendEFPInvoiceSMSByFPH_Name_v1_0 = ConfigProperties.getProperty("sendEFPInvoiceSMSByFPH_Name_v1_0");
    // sendEFPInvoiceSMSByFPH_v1_0接口方法名
    public static final String sendEFPInvoiceSMSByFPH_Method_v1_0 = ConfigProperties.getProperty("sendEFPInvoiceSMSByFPH_Method_v1_0");
    // sendEFPInvoiceSMSByFPH_v1_0接口url
    public static final String sendEFPInvoiceSMSByFPHURL_v1_0 = ConfigProperties.getProperty("sendEFPInvoiceSMSByFPHURL_v1_0");
    // sendEFPInvoiceSMSByFPH_v1_0接口版本号
    public static final String sendEFPInvoiceSMSByFPH_version_v1_0 = ConfigProperties.getProperty("sendEFPInvoiceSMSByFPH_version_v1_0");
    // sendEFPInvoiceSMSByFPH_v1_0接口认证秘钥
    public static final String sendEFPInvoiceSMSByFPH_AKEY_v1_0 = ConfigProperties.getProperty("sendEFPInvoiceSMSByFPH_AKEY_v1_0");

    /**
     * 配置webQueryPromInfoByServiceId_v1_0接口信息
     */
    // webQueryPromInfoByServiceId_v1_0接口名称
    public static final String webQueryPromInfoByServiceId_Name_v1_0 = ConfigProperties.getProperty("webQueryPromInfoByServiceId_Name_v1_0");
    // webQueryPromInfoByServiceId_v1_0接口方法名
    public static final String webQueryPromInfoByServiceId_Method_v1_0 = ConfigProperties.getProperty("webQueryPromInfoByServiceId_Method_v1_0");
    // webQueryPromInfoByServiceId_v1_0接口url
    public static final String webQueryPromInfoByServiceIdURL_v1_0 = ConfigProperties.getProperty("webQueryPromInfoByServiceIdURL_v1_0");
    // webQueryPromInfoByServiceId_v1_0接口版本号
    public static final String webQueryPromInfoByServiceId_version_v1_0 = ConfigProperties.getProperty("webQueryPromInfoByServiceId_version_v1_0");
    // webQueryPromInfoByServiceId_v1_0接口认证秘钥
    public static final String webQueryPromInfoByServiceId_AKEY_v1_0 = ConfigProperties.getProperty("webQueryPromInfoByServiceId_AKEY_v1_0");

    /**
     * 配置getMonthlyRentFeeNav_v1_0接口信息
     */
    // getMonthlyRentFeeNav_v1_0接口名称
    public static final String getMonthlyRentFeeNav_Name_v1_0 = ConfigProperties.getProperty("getMonthlyRentFeeNav_Name_v1_0");
    // getMonthlyRentFeeNav_v1_0接口方法名
    public static final String getMonthlyRentFeeNav_Method_v1_0 = ConfigProperties.getProperty("getMonthlyRentFeeNav_Method_v1_0");
    // getMonthlyRentFeeNav_v1_0接口url
    public static final String getMonthlyRentFeeNavURL_v1_0 = ConfigProperties.getProperty("getMonthlyRentFeeNavURL_v1_0");
    // getMonthlyRentFeeNav_v1_0接口版本号
    public static final String getMonthlyRentFeeNav_version_v1_0 = ConfigProperties.getProperty("getMonthlyRentFeeNav_version_v1_0");
    // getMonthlyRentFeeNav_v1_0接口认证秘钥
    public static final String getMonthlyRentFeeNav_AKEY_v1_0 = ConfigProperties.getProperty("getMonthlyRentFeeNav_AKEY_v1_0");

    /**
     * 配置queryOrderNumByMSGID2_v2_0接口信息
     */
    // queryOrderNumByMSGID2_v2_0接口名称
    public static final String queryOrderNumByMSGID2_Name_v2_0 = ConfigProperties.getProperty("queryOrderNumByMSGID2_Name_v2_0");
    // queryOrderNumByMSGID2_v2_0接口方法名
    public static final String queryOrderNumByMSGID2_Method_v2_0 = ConfigProperties.getProperty("queryOrderNumByMSGID2_Method_v2_0");
    // queryOrderNumByMSGID2_v2_0接口url
    public static final String queryOrderNumByMSGID2URL_v2_0 = ConfigProperties.getProperty("queryOrderNumByMSGID2URL_v2_0");
    // queryOrderNumByMSGID2_v2_0接口版本号
    public static final String queryOrderNumByMSGID2_version_v2_0 = ConfigProperties.getProperty("queryOrderNumByMSGID2_version_v2_0");
    // queryOrderNumByMSGID2_v2_0接口认证秘钥
    public static final String queryOrderNumByMSGID2_AKEY_v2_0 = ConfigProperties.getProperty("queryOrderNumByMSGID2_AKEY_v2_0");
    
    /**
     * 配置queryOrderNumByMSGID2_v3_0接口信息
     */
    // queryOrderNumByMSGID3_v3_0接口名称
    public static final String queryOrderNumByMSGID3_Name_v3_0 = ConfigProperties.getProperty("queryOrderNumByMSGID3_Name_v3_0");
    // queryOrderNumByMSGID3_v3_0接口方法名
    public static final String queryOrderNumByMSGID3_Method_v3_0 = ConfigProperties.getProperty("queryOrderNumByMSGID3_Method_v3_0");
    // queryOrderNumByMSGID3_v3_0接口url
    public static final String queryOrderNumByMSGID3URL_v3_0 = ConfigProperties.getProperty("queryOrderNumByMSGID3URL_v3_0");
    // queryOrderNumByMSGID3_v3_0接口版本号
    public static final String queryOrderNumByMSGID3_version_v3_0 = ConfigProperties.getProperty("queryOrderNumByMSGID3_version_v3_0");
    // queryOrderNumByMSGID3_v3_0接口认证秘钥
    public static final String queryOrderNumByMSGID3_AKEY_v3_0 = ConfigProperties.getProperty("queryOrderNumByMSGID3_AKEY_v3_0");
    
    /**
     * 配置verifyPublicAccountInfo2_v2_0接口信息
     */
    // verifyPublicAccountInfo2_v2_0接口名称
    public static final String verifyPublicAccountInfo2_Name_v2_0 = ConfigProperties.getProperty("verifyPublicAccountInfo2_Name_v2_0");
    // verifyPublicAccountInfo2_v2_0接口方法名
    public static final String verifyPublicAccountInfo2_Method_v2_0 = ConfigProperties.getProperty("verifyPublicAccountInfo2_Method_v2_0");
    // verifyPublicAccountInfo2_v2_0接口url
    public static final String verifyPublicAccountInfo2URL_v2_0 = ConfigProperties.getProperty("verifyPublicAccountInfo2URL_v2_0");
    // verifyPublicAccountInfo2_v2_0接口版本号
    public static final String verifyPublicAccountInfo2_version_v2_0 = ConfigProperties.getProperty("verifyPublicAccountInfo2_version_v2_0");
    // verifyPublicAccountInfo2_v2_0接口认证秘钥
    public static final String verifyPublicAccountInfo2_AKEY_v2_0 = ConfigProperties.getProperty("verifyPublicAccountInfo2_AKEY_v2_0");

    /**
     * 配置queryOrderListByAccountNumber2_v2_0接口信息
     */
    // queryOrderListByAccountNumber2_v2_0接口名称
    public static final String queryOrderListByAccountNumber2_Name_v2_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber2_Name_v2_0");
    // queryOrderListByAccountNumber2_v2_0接口方法名
    public static final String queryOrderListByAccountNumber2_Method_v2_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber2_Method_v2_0");
    // queryOrderListByAccountNumber2_v2_0接口url
    public static final String queryOrderListByAccountNumber2URL_v2_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber2URL_v2_0");
    // queryOrderListByAccountNumber2_v2_0接口版本号
    public static final String queryOrderListByAccountNumber2_version_v2_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber2_version_v2_0");
    // queryOrderListByAccountNumber2_v2_0接口认证秘钥
    public static final String queryOrderListByAccountNumber2_AKEY_v2_0 = ConfigProperties.getProperty("queryOrderListByAccountNumber2_AKEY_v2_0");

    /**
     * 配置queryCreditCoupon_v1_0接口信息
     */
    // queryCreditCoupon_v1_0接口名称
    public static final String queryCreditCoupon_Name_v1_0 = ConfigProperties.getProperty("queryCreditCoupon_Name_v1_0");
    // queryCreditCoupon_v1_0接口方法名
    public static final String queryCreditCoupon_Method_v1_0 = ConfigProperties.getProperty("queryCreditCoupon_Method_v1_0");
    // queryCreditCoupon_v1_0接口url
    public static final String queryCreditCouponURL_v1_0 = ConfigProperties.getProperty("queryCreditCouponURL_v1_0");
    // queryCreditCoupon_v1_0接口版本号
    public static final String queryCreditCoupon_version_v1_0 = ConfigProperties.getProperty("queryCreditCoupon_version_v1_0");
    // queryCreditCoupon_v1_0接口认证秘钥
    public static final String queryCreditCoupon_AKEY_v1_0 = ConfigProperties.getProperty("queryCreditCoupon_AKEY_v1_0");

    /**
     * 配置queryOrOccupyOrReleaseCDMANumByIDNum_v1_0接口信息
     */
    // queryOrOccupyOrReleaseCDMANumByIDNum_v1_0接口名称
    public static final String queryOrOccupyOrReleaseCDMANumByIDNum_Name_v1_0 = ConfigProperties.getProperty("queryOrOccupyOrReleaseCDMANumByIDNum_Name_v1_0");
    // queryOrOccupyOrReleaseCDMANumByIDNum_v1_0接口方法名
    public static final String queryOrOccupyOrReleaseCDMANumByIDNum_Method_v1_0 = ConfigProperties.getProperty("queryOrOccupyOrReleaseCDMANumByIDNum_Method_v1_0");
    // queryOrOccupyOrReleaseCDMANumByIDNum_v1_0接口url
    public static final String queryOrOccupyOrReleaseCDMANumByIDNumURL_v1_0 = ConfigProperties.getProperty("queryOrOccupyOrReleaseCDMANumByIDNumURL_v1_0");
    // queryOrOccupyOrReleaseCDMANumByIDNum_v1_0接口版本号
    public static final String queryOrOccupyOrReleaseCDMANumByIDNum_version_v1_0 = ConfigProperties.getProperty("queryOrOccupyOrReleaseCDMANumByIDNum_version_v1_0");
    // queryOrOccupyOrReleaseCDMANumByIDNum_v1_0接口认证秘钥
    public static final String queryOrOccupyOrReleaseCDMANumByIDNum_AKEY_v1_0 = ConfigProperties.getProperty("queryOrOccupyOrReleaseCDMANumByIDNum_AKEY_v1_0");

    /**
     * 配置queryTnsJt_v1_0接口信息
     */
    // queryTnsJt_v1_0接口名称
    public static final String queryTnsJt_Name_v1_0 = ConfigProperties.getProperty("queryTnsJt_Name_v1_0");
    // queryTnsJt_v1_0接口方法名
    public static final String queryTnsJt_Method_v1_0 = ConfigProperties.getProperty("queryTnsJt_Method_v1_0");
    // queryTnsJt_v1_0接口url
    public static final String queryTnsJtURL_v1_0 = ConfigProperties.getProperty("queryTnsJtURL_v1_0");
    // queryTnsJt_v1_0接口版本号
    public static final String queryTnsJt_version_v1_0 = ConfigProperties.getProperty("queryTnsJt_version_v1_0");
    // queryTnsJt_v1_0接口认证秘钥
    public static final String queryTnsJt_AKEY_v1_0 = ConfigProperties.getProperty("queryTnsJt_AKEY_v1_0");

    /**
     * 配置complexOccupyCDMANumByIDNum_v1_0接口信息
     */
    // complexOccupyCDMANumByIDNum_v1_0接口名称
    public static final String complexOccupyCDMANumByIDNum_Name_v1_0 = ConfigProperties.getProperty("complexOccupyCDMANumByIDNum_Name_v1_0");
    // complexOccupyCDMANumByIDNum_v1_0接口方法名
    public static final String complexOccupyCDMANumByIDNum_Method_v1_0 = ConfigProperties.getProperty("complexOccupyCDMANumByIDNum_Method_v1_0");
    // complexOccupyCDMANumByIDNum_v1_0接口url
    public static final String complexOccupyCDMANumByIDNumURL_v1_0 = ConfigProperties.getProperty("complexOccupyCDMANumByIDNumURL_v1_0");
    // complexOccupyCDMANumByIDNum_v1_0接口版本号
    public static final String complexOccupyCDMANumByIDNum_version_v1_0 = ConfigProperties.getProperty("complexOccupyCDMANumByIDNum_version_v1_0");
    // complexOccupyCDMANumByIDNum_v1_0接口认证秘钥
    public static final String complexOccupyCDMANumByIDNum_AKEY_v1_0 = ConfigProperties.getProperty("complexOccupyCDMANumByIDNum_AKEY_v1_0");

    /**
     * 配置checkYZWHByIDNum_v1_0接口信息
     */
    // checkYZWHByIDNum_v1_0接口名称
    public static final String checkYZWHByIDNum_Name_v1_0 = ConfigProperties.getProperty("checkYZWHByIDNum_Name_v1_0");
    // checkYZWHByIDNum_v1_0接口方法名
    public static final String checkYZWHByIDNum_Method_v1_0 = ConfigProperties.getProperty("checkYZWHByIDNum_Method_v1_0");
    // checkYZWHByIDNum_v1_0接口url
    public static final String checkYZWHByIDNumURL_v1_0 = ConfigProperties.getProperty("checkYZWHByIDNumURL_v1_0");
    // checkYZWHByIDNum_v1_0接口版本号
    public static final String checkYZWHByIDNum_version_v1_0 = ConfigProperties.getProperty("checkYZWHByIDNum_version_v1_0");
    // checkYZWHByIDNum_v1_0接口认证秘钥
    public static final String checkYZWHByIDNum_AKEY_v1_0 = ConfigProperties.getProperty("checkYZWHByIDNum_AKEY_v1_0");

    /**
     * 配置diagnoseRoaming_v1_0接口信息
     */
    // diagnoseRoaming_v1_0接口名称
    public static final String diagnoseRoaming_Name_v1_0 = ConfigProperties.getProperty("diagnoseRoaming_Name_v1_0");
    // diagnoseRoaming_v1_0接口方法名
    public static final String diagnoseRoaming_Method_v1_0 = ConfigProperties.getProperty("diagnoseRoaming_Method_v1_0");
    // diagnoseRoaming_v1_0接口url
    public static final String diagnoseRoamingURL_v1_0 = ConfigProperties.getProperty("diagnoseRoamingURL_v1_0");
    // diagnoseRoaming_v1_0接口版本号
    public static final String diagnoseRoaming_version_v1_0 = ConfigProperties.getProperty("diagnoseRoaming_version_v1_0");
    // diagnoseRoaming_v1_0接口认证秘钥
    public static final String diagnoseRoaming_AKEY_v1_0 = ConfigProperties.getProperty("diagnoseRoaming_AKEY_v1_0");

    /**
     * 配置diagnoseMobileTrafficDispute_v1_0接口信息
     */
    // diagnoseMobileTrafficDispute_v1_0接口名称
    public static final String diagnoseMobileTrafficDispute_Name_v1_0 = ConfigProperties.getProperty("diagnoseMobileTrafficDispute_Name_v1_0");
    // diagnoseMobileTrafficDispute_v1_0接口方法名
    public static final String diagnoseMobileTrafficDispute_Method_v1_0 = ConfigProperties.getProperty("diagnoseMobileTrafficDispute_Method_v1_0");
    // diagnoseMobileTrafficDispute_v1_0接口url
    public static final String diagnoseMobileTrafficDisputeURL_v1_0 = ConfigProperties.getProperty("diagnoseMobileTrafficDisputeURL_v1_0");
    // diagnoseMobileTrafficDispute_v1_0接口版本号
    public static final String diagnoseMobileTrafficDispute_version_v1_0 = ConfigProperties.getProperty("diagnoseMobileTrafficDispute_version_v1_0");
    // diagnoseMobileTrafficDispute_v1_0接口认证秘钥
    public static final String diagnoseMobileTrafficDispute_AKEY_v1_0 = ConfigProperties.getProperty("diagnoseMobileTrafficDispute_AKEY_v1_0");

    /**
     * 配置diagnoseComprehensiveCosts_v1_0接口信息
     */
    // diagnoseComprehensiveCosts_v1_0接口名称
    public static final String diagnoseComprehensiveCosts_Name_v1_0 = ConfigProperties.getProperty("diagnoseComprehensiveCosts_Name_v1_0");
    // diagnoseComprehensiveCosts_v1_0接口方法名
    public static final String diagnoseComprehensiveCosts_Method_v1_0 = ConfigProperties.getProperty("diagnoseComprehensiveCosts_Method_v1_0");
    // diagnoseComprehensiveCosts_v1_0接口url
    public static final String diagnoseComprehensiveCostsURL_v1_0 = ConfigProperties.getProperty("diagnoseComprehensiveCostsURL_v1_0");
    // diagnoseComprehensiveCosts_v1_0接口版本号
    public static final String diagnoseComprehensiveCosts_version_v1_0 = ConfigProperties.getProperty("diagnoseComprehensiveCosts_version_v1_0");
    // diagnoseComprehensiveCosts_v1_0接口认证秘钥
    public static final String diagnoseComprehensiveCosts_AKEY_v1_0 = ConfigProperties.getProperty("diagnoseComprehensiveCosts_AKEY_v1_0");

    /**
     * 配置LTE_SVC80055_BUS80001_M_GUOMAN_v1_0接口信息
     */
    // LTE_SVC80055_BUS80001_M_GUOMAN_v1_0接口名称
    public static final String LTE_SVC80055_BUS80001_M_GUOMAN_Name_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_GUOMAN_Name_v1_0");
    // LTE_SVC80055_BUS80001_M_GUOMAN_v1_0接口方法名
    public static final String LTE_SVC80055_BUS80001_M_GUOMAN_Method_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_GUOMAN_Method_v1_0");
    // LTE_SVC80055_BUS80001_M_GUOMAN_v1_0接口url
    public static final String LTE_SVC80055_BUS80001_M_GUOMANURL_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_GUOMANURL_v1_0");
    // LTE_SVC80055_BUS80001_M_GUOMAN_v1_0接口版本号
    public static final String LTE_SVC80055_BUS80001_M_GUOMAN_version_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_GUOMAN_version_v1_0");
    // LTE_SVC80055_BUS80001_M_GUOMAN_v1_0接口认证秘钥
    public static final String LTE_SVC80055_BUS80001_M_GUOMAN_AKEY_v1_0 = ConfigProperties.getProperty("LTE_SVC80055_BUS80001_M_GUOMAN_AKEY_v1_0");

    /**
     * 配置LTE_SVC80056_BUS80001_M_GUOMAN_v1_0接口信息
     */
    // LTE_SVC80056_BUS80001_M_GUOMAN_v1_0接口名称
    public static final String LTE_SVC80056_BUS80001_M_GUOMAN_Name_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_GUOMAN_Name_v1_0");
    // LTE_SVC80056_BUS80001_M_GUOMAN_v1_0接口方法名
    public static final String LTE_SVC80056_BUS80001_M_GUOMAN_Method_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_GUOMAN_Method_v1_0");
    // LTE_SVC80056_BUS80001_M_GUOMAN_v1_0接口url
    public static final String LTE_SVC80056_BUS80001_M_GUOMANURL_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_GUOMANURL_v1_0");
    // LTE_SVC80056_BUS80001_M_GUOMAN_v1_0接口版本号
    public static final String LTE_SVC80056_BUS80001_M_GUOMAN_version_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_GUOMAN_version_v1_0");
    // LTE_SVC80056_BUS80001_M_GUOMAN_v1_0接口认证秘钥
    public static final String LTE_SVC80056_BUS80001_M_GUOMAN_AKEY_v1_0 = ConfigProperties.getProperty("LTE_SVC80056_BUS80001_M_GUOMAN_AKEY_v1_0");

    /**
     * 配置LTE_SVC80058_BUS80001_M_GUOMAN_v1_0接口信息
     */
    // LTE_SVC80058_BUS80001_M_GUOMAN_v1_0接口名称
    public static final String LTE_SVC80058_BUS80001_M_GUOMAN_Name_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_GUOMAN_Name_v1_0");
    // LTE_SVC80058_BUS80001_M_GUOMAN_v1_0接口方法名
    public static final String LTE_SVC80058_BUS80001_M_GUOMAN_Method_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_GUOMAN_Method_v1_0");
    // LTE_SVC80058_BUS80001_M_GUOMAN_v1_0接口url
    public static final String LTE_SVC80058_BUS80001_M_GUOMANURL_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_GUOMANURL_v1_0");
    // LTE_SVC80058_BUS80001_M_GUOMAN_v1_0接口版本号
    public static final String LTE_SVC80058_BUS80001_M_GUOMAN_version_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_GUOMAN_version_v1_0");
    // LTE_SVC80058_BUS80001_M_GUOMAN_v1_0接口认证秘钥
    public static final String LTE_SVC80058_BUS80001_M_GUOMAN_AKEY_v1_0 = ConfigProperties.getProperty("LTE_SVC80058_BUS80001_M_GUOMAN_AKEY_v1_0");

    /**
     * 配置queryPrepaymentInfo_v1_0接口信息
     */
    // queryPrepaymentInfo_v1_0接口名称
    public static final String queryPrepaymentInfo_Name_v1_0 = ConfigProperties.getProperty("queryPrepaymentInfo_Name_v1_0");
    // queryPrepaymentInfo_v1_0接口方法名
    public static final String queryPrepaymentInfo_Method_v1_0 = ConfigProperties.getProperty("queryPrepaymentInfo_Method_v1_0");
    // queryPrepaymentInfo_v1_0接口url
    public static final String queryPrepaymentInfoURL_v1_0 = ConfigProperties.getProperty("queryPrepaymentInfoURL_v1_0");
    // queryPrepaymentInfo_v1_0接口版本号
    public static final String queryPrepaymentInfo_version_v1_0 = ConfigProperties.getProperty("queryPrepaymentInfo_version_v1_0");
    // queryPrepaymentInfo_v1_0接口认证秘钥
    public static final String queryPrepaymentInfo_AKEY_v1_0 = ConfigProperties.getProperty("queryPrepaymentInfo_AKEY_v1_0");

    /**
     * 配置queryCustInfoByCustNumSelfBroadband_v1_0接口信息
     */
    // queryCustInfoByCustNumSelfBroadband_v1_0接口名称
    public static final String queryCustInfoByCustNumSelfBroadband_Name_v1_0 = ConfigProperties.getProperty("queryCustInfoByCustNumSelfBroadband_Name_v1_0");
    // queryCustInfoByCustNumSelfBroadband_v1_0接口方法名
    public static final String queryCustInfoByCustNumSelfBroadband_Method_v1_0 = ConfigProperties.getProperty("queryCustInfoByCustNumSelfBroadband_Method_v1_0");
    // queryCustInfoByCustNumSelfBroadband_v1_0接口url
    public static final String queryCustInfoByCustNumSelfBroadbandURL_v1_0 = ConfigProperties.getProperty("queryCustInfoByCustNumSelfBroadbandURL_v1_0");
    // queryCustInfoByCustNumSelfBroadband_v1_0接口版本号
    public static final String queryCustInfoByCustNumSelfBroadband_version_v1_0 = ConfigProperties.getProperty("queryCustInfoByCustNumSelfBroadband_version_v1_0");
    // queryCustInfoByCustNumSelfBroadband_v1_0接口认证秘钥
    public static final String queryCustInfoByCustNumSelfBroadband_AKEY_v1_0 = ConfigProperties.getProperty("queryCustInfoByCustNumSelfBroadband_AKEY_v1_0");

    /**
     * 配置complexElectronicInvoiceData_v1_0接口信息
     */
    // complexElectronicInvoiceData_v1_0接口名称
    public static final String complexElectronicInvoiceData_Name_v1_0 = ConfigProperties.getProperty("complexElectronicInvoiceData_Name_v1_0");
    // complexElectronicInvoiceData_v1_0接口方法名
    public static final String complexElectronicInvoiceData_Method_v1_0 = ConfigProperties.getProperty("complexElectronicInvoiceData_Method_v1_0");
    // complexElectronicInvoiceData_v1_0接口url
    public static final String complexElectronicInvoiceDataURL_v1_0 = ConfigProperties.getProperty("complexElectronicInvoiceDataURL_v1_0");
    // complexElectronicInvoiceData_v1_0接口版本号
    public static final String complexElectronicInvoiceData_version_v1_0 = ConfigProperties.getProperty("complexElectronicInvoiceData_version_v1_0");
    // complexElectronicInvoiceData_v1_0接口认证秘钥
    public static final String complexElectronicInvoiceData_AKEY_v1_0 = ConfigProperties.getProperty("complexElectronicInvoiceData_AKEY_v1_0");

    /**
     * 配置judgeBillNewOROld_v1_0接口信息
     */
    // judgeBillNewOROld_v1_0接口名称
    public static final String judgeBillNewOROld_Name_v1_0 = ConfigProperties.getProperty("judgeBillNewOROld_Name_v1_0");
    // judgeBillNewOROld_v1_0接口方法名
    public static final String judgeBillNewOROld_Method_v1_0 = ConfigProperties.getProperty("judgeBillNewOROld_Method_v1_0");
    // judgeBillNewOROld_v1_0接口url
    public static final String judgeBillNewOROldURL_v1_0 = ConfigProperties.getProperty("judgeBillNewOROldURL_v1_0");
    // judgeBillNewOROld_v1_0接口版本号
    public static final String judgeBillNewOROld_version_v1_0 = ConfigProperties.getProperty("judgeBillNewOROld_version_v1_0");
    // judgeBillNewOROld_v1_0接口认证秘钥
    public static final String judgeBillNewOROld_AKEY_v1_0 = ConfigProperties.getProperty("judgeBillNewOROld_AKEY_v1_0");

    /**
     * 配置printNewInvoice_v1_0接口信息
     */
    // printNewInvoice_v1_0接口名称
    public static final String printNewInvoice_Name_v1_0 = ConfigProperties.getProperty("printNewInvoice_Name_v1_0");
    // printNewInvoice_v1_0接口方法名
    public static final String printNewInvoice_Method_v1_0 = ConfigProperties.getProperty("printNewInvoice_Method_v1_0");
    // printNewInvoice_v1_0接口url
    public static final String printNewInvoiceURL_v1_0 = ConfigProperties.getProperty("printNewInvoiceURL_v1_0");
    // printNewInvoice_v1_0接口版本号
    public static final String printNewInvoice_version_v1_0 = ConfigProperties.getProperty("printNewInvoice_version_v1_0");
    // printNewInvoice_v1_0接口认证秘钥
    public static final String printNewInvoice_AKEY_v1_0 = ConfigProperties.getProperty("printNewInvoice_AKEY_v1_0");

    /**
     * 配置printSGWInvoice_v1_0接口信息
     */
    // printSGWInvoice_v1_0接口名称
    public static final String printSGWInvoice_Name_v1_0 = ConfigProperties.getProperty("printSGWInvoice_Name_v1_0");
    // printSGWInvoice_v1_0接口方法名
    public static final String printSGWInvoice_Method_v1_0 = ConfigProperties.getProperty("printSGWInvoice_Method_v1_0");
    // printSGWInvoice_v1_0接口url
    public static final String printSGWInvoiceURL_v1_0 = ConfigProperties.getProperty("printSGWInvoiceURL_v1_0");
    // printSGWInvoice_v1_0接口版本号
    public static final String printSGWInvoice_version_v1_0 = ConfigProperties.getProperty("printSGWInvoice_version_v1_0");
    // printSGWInvoice_v1_0接口认证秘钥
    public static final String printSGWInvoice_AKEY_v1_0 = ConfigProperties.getProperty("printSGWInvoice_AKEY_v1_0");

    /**
     * 配置accountInfo_v1_0接口信息
     */
    // accountInfo_v1_0接口名称
    public static final String accountInfo_Name_v1_0 = ConfigProperties.getProperty("accountInfo_Name_v1_0");
    // accountInfo_v1_0接口方法名
    public static final String accountInfo_Method_v1_0 = ConfigProperties.getProperty("accountInfo_Method_v1_0");
    // accountInfo_v1_0接口url
    public static final String accountInfoURL_v1_0 = ConfigProperties.getProperty("accountInfoURL_v1_0");
    // accountInfo_v1_0接口版本号
    public static final String accountInfo_version_v1_0 = ConfigProperties.getProperty("accountInfo_version_v1_0");
    // accountInfo_v1_0接口认证秘钥
    public static final String accountInfo_AKEY_v1_0 = ConfigProperties.getProperty("accountInfo_AKEY_v1_0");

    /**
     * 配置createPointOrderRedPack_v1_0接口信息
     */
    // createPointOrderRedPack_v1_0接口名称
    public static final String createPointOrderRedPack_Name_v1_0 = ConfigProperties.getProperty("createPointOrderRedPack_Name_v1_0");
    // createPointOrderRedPack_v1_0接口方法名
    public static final String createPointOrderRedPack_Method_v1_0 = ConfigProperties.getProperty("createPointOrderRedPack_Method_v1_0");
    // createPointOrderRedPack_v1_0接口url
    public static final String createPointOrderRedPackURL_v1_0 = ConfigProperties.getProperty("createPointOrderRedPackURL_v1_0");
    // createPointOrderRedPack_v1_0接口版本号
    public static final String createPointOrderRedPack_version_v1_0 = ConfigProperties.getProperty("createPointOrderRedPack_version_v1_0");
    // createPointOrderRedPack_v1_0接口认证秘钥
    public static final String createPointOrderRedPack_AKEY_v1_0 = ConfigProperties.getProperty("createPointOrderRedPack_AKEY_v1_0");
    
    /**
     * 配置createPointOrderRedPackup_v1_0接口信息
     */
    // createPointOrderRedPackup_v1_0接口名称
    public static final String createPointOrderRedPackup_Name_v1_0 = ConfigProperties.getProperty("createPointOrderRedPackup_Name_v1_0");
    // createPointOrderRedPackup_v1_0接口方法名
    public static final String createPointOrderRedPackup_Method_v1_0 = ConfigProperties.getProperty("createPointOrderRedPackup_Method_v1_0");
    // createPointOrderRedPackup_v1_0接口url
    public static final String createPointOrderRedPackupURL_v1_0 = ConfigProperties.getProperty("createPointOrderRedPackupURL_v1_0");
    // createPointOrderRedPackup_v1_0接口版本号
    public static final String createPointOrderRedPackup_version_v1_0 = ConfigProperties.getProperty("createPointOrderRedPackup_version_v1_0");
    // createPointOrderRedPackup_v1_0接口认证秘钥
    public static final String createPointOrderRedPackup_AKEY_v1_0 = ConfigProperties.getProperty("createPointOrderRedPackup_AKEY_v1_0");

    /**
     * 配置queryPromAssetInforByAccountNum_v3_0接口信息
     */
    // queryPromAssetInforByAccountNum_v3_0接口名称
    public static final String queryPromAssetInforByAccountNum_Name_v3_0 = ConfigProperties.getProperty("queryPromAssetInforByAccountNum_Name_v3_0");
    // queryPromAssetInforByAccountNum_v3_0接口方法名
    public static final String queryPromAssetInforByAccountNum_Method_v3_0 = ConfigProperties.getProperty("queryPromAssetInforByAccountNum_Method_v3_0");
    // queryPromAssetInforByAccountNum_v3_0接口url
    public static final String queryPromAssetInforByAccountNumURL_v3_0 = ConfigProperties.getProperty("queryPromAssetInforByAccountNumURL_v3_0");
    // queryPromAssetInforByAccountNum_v3_0接口版本号
    public static final String queryPromAssetInforByAccountNum_version_v3_0 = ConfigProperties.getProperty("queryPromAssetInforByAccountNum_version_v3_0");
    // queryPromAssetInforByAccountNum_v3_0接口认证秘钥
    public static final String queryPromAssetInforByAccountNum_AKEY_v3_0 = ConfigProperties.getProperty("queryPromAssetInforByAccountNum_AKEY_v3_0");

    /**
     * 配置checkIsFocus_v1_0接口信息
     */
    // checkIsFocus_v1_0接口名称
    public static final String checkIsFocus_Name_v1_0 = ConfigProperties.getProperty("checkIsFocus_Name_v1_0");
    // checkIsFocus_v1_0接口方法名
    public static final String checkIsFocus_Method_v1_0 = ConfigProperties.getProperty("checkIsFocus_Method_v1_0");
    // checkIsFocus_v1_0接口url
    public static final String checkIsFocusURL_v1_0 = ConfigProperties.getProperty("checkIsFocusURL_v1_0");
    // checkIsFocus_v1_0接口版本号
    public static final String checkIsFocus_version_v1_0 = ConfigProperties.getProperty("checkIsFocus_version_v1_0");
    // checkIsFocus_v1_0接口认证秘钥
    public static final String checkIsFocus_AKEY_v1_0 = ConfigProperties.getProperty("checkIsFocus_AKEY_v1_0");

    /**
     * 配置checkIsBound_v1_0接口信息
     */
    // checkIsBound_v1_0接口名称
    public static final String checkIsBound_Name_v1_0 = ConfigProperties.getProperty("checkIsBound_Name_v1_0");
    // checkIsBound_v1_0接口方法名
    public static final String checkIsBound_Method_v1_0 = ConfigProperties.getProperty("checkIsBound_Method_v1_0");
    // checkIsBound_v1_0接口url
    public static final String checkIsBoundURL_v1_0 = ConfigProperties.getProperty("checkIsBoundURL_v1_0");
    // checkIsBound_v1_0接口版本号
    public static final String checkIsBound_version_v1_0 = ConfigProperties.getProperty("checkIsBound_version_v1_0");
    // checkIsBound_v1_0接口认证秘钥
    public static final String checkIsBound_AKEY_v1_0 = ConfigProperties.getProperty("checkIsBound_AKEY_v1_0");

    /**
     * 配置doBound_v1_0接口信息
     */
    // doBound_v1_0接口名称
    public static final String doBound_Name_v1_0 = ConfigProperties.getProperty("doBound_Name_v1_0");
    // doBound_v1_0接口方法名
    public static final String doBound_Method_v1_0 = ConfigProperties.getProperty("doBound_Method_v1_0");
    // doBound_v1_0接口url
    public static final String doBoundURL_v1_0 = ConfigProperties.getProperty("doBoundURL_v1_0");
    // doBound_v1_0接口版本号
    public static final String doBound_version_v1_0 = ConfigProperties.getProperty("doBound_version_v1_0");
    // doBound_v1_0接口认证秘钥
    public static final String doBound_AKEY_v1_0 = ConfigProperties.getProperty("doBound_AKEY_v1_0");

    /**
     * 配置customerNbr_v1_0接口信息
     */
    // customerNbr_v1_0接口名称
    public static final String customerNbr_Name_v1_0 = ConfigProperties.getProperty("customerNbr_Name_v1_0");
    // customerNbr_v1_0接口方法名
    public static final String customerNbr_Method_v1_0 = ConfigProperties.getProperty("customerNbr_Method_v1_0");
    // customerNbr_v1_0接口url
    public static final String customerNbrURL_v1_0 = ConfigProperties.getProperty("customerNbrURL_v1_0");
    // customerNbr_v1_0接口版本号
    public static final String customerNbr_version_v1_0 = ConfigProperties.getProperty("customerNbr_version_v1_0");
    // customerNbr_v1_0接口认证秘钥
    public static final String customerNbr_AKEY_v1_0 = ConfigProperties.getProperty("customerNbr_AKEY_v1_0"); 
    
    /**
     * 配置erpGetFilesState_v1_0接口信息
     */
    // erpGetFilesState_v1_0接口名称
    public static final String erpGetFilesState_Name_v1_0 = ConfigProperties.getProperty("erpGetFilesState_Name_v1_0");
    // erpGetFilesState_v1_0接口方法名
    public static final String erpGetFilesState_Method_v1_0 = ConfigProperties.getProperty("erpGetFilesState_Method_v1_0");
    // erpGetFilesState_v1_0接口url
    public static final String erpGetFilesStateURL_v1_0 = ConfigProperties.getProperty("erpGetFilesStateURL_v1_0");
    // erpGetFilesState_v1_0接口版本号
    public static final String erpGetFilesState_version_v1_0 = ConfigProperties.getProperty("erpGetFilesState_version_v1_0");
    // erpGetFilesState_v1_0接口认证秘钥
    public static final String erpGetFilesState_AKEY_v1_0 = ConfigProperties.getProperty("erpGetFilesState_AKEY_v1_0"); 
}
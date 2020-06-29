package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.dataUtil;

import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.SignatureUtil;
import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.jsonUtil.JsonUtils;
import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.safetyBean.SignatureBean;
import cn.sh.ideal.valueaddedserver.common.util.StringUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Map;


@Slf4j
public class ParameterEncapsulation {
    

	public ParameterEncapsulation() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 公共参数封装
	 * @param request_Channel
	 * @param server_Name
	 * @param server_Method
	 * @param server_Version
	 * @param server_Timestamp
	 * @param server_NonceStr
	 * @param authentication_Key
	 * @param sign_tokenKey
	 * @param dataObject={deviceNum=XXX, openId=XXXX,orderCode=XXX....}]业务数据对象（根据所需类型转换） Map对象
	 * @return
	 */
	public static SignatureBean publicParameter(String request_Channel, String server_Name,
												String server_Method, String server_Version,
												String server_Timestamp, String server_NonceStr,
												String authentication_Key, String sign_tokenKey, Object dataObject){
		
		
		SignatureBean signatureBean = new SignatureBean(request_Channel, server_Name,
				server_Method, server_Version, server_Timestamp,
				server_NonceStr, authentication_Key, sign_tokenKey, dataObject);
		
		return signatureBean;
	}
	
	   /**
     * 
     * @author chendi
     * @date Aug 28, 20186:13:01 PM
     * 
     * @param url 接口地址
     * @param request_Channel 调用服务渠道
     * @param server_Name 服务接口名称
     * @param server_Method 服务接口方法
     * @param server_Version 服务版本号
     * @param authentication_Key 认证秘钥
     * @param deviceNum 设备号为关键性参数，必传字段
     * @param openId 微信号为关键性参数，必传字段
     * @param orderCode 透传订单号（与接口所需订单号保持一致）为关键性参数，必传字段
     * @param requestClass 调用的类为关键性参数，必传字段
     * @param requestMethod 调用的方法为关键性参数，必传字段
     * @throws Exception
     *
     */
	public static String interfaceInvoking(String url, String request_Channel,
			String server_Name, String server_Method, String server_Version,
			String authentication_Key, String openId, String deviceNum,
			String orderCode, String requestClass, String requestMethod,
			Map<String, Object> dataObject) throws Exception {
            
        // 时间戳 10位
        String server_Timestamp = "";
        // 随机生成的字符串16位
        String server_NonceStr = "";
        //签名key
        String sign_tokenKey = "";

        //Object转json
        String paramJson = "nullValue";
        
		if (isEmpty(openId) || isEmpty(deviceNum) || isEmpty(orderCode)
				|| isEmpty(requestClass) || isEmpty(requestMethod)) {
			log.error("dataObject关键属性值为空，openId=" + openId + ",deviceNum="
					+ deviceNum + ",orderCode=" + orderCode + ",requestClass="
					+ requestClass + ",requestMethod=" + requestMethod);
		} else {
            
            dataObject.put("openId", openId);
            dataObject.put("deviceNum", deviceNum);
            
            //TODO　修复受理订单类　业务流水号和接口请求流水覆盖问题
            // 当业务流水号存在，则默认业务流水号为请求流水号
            // 否则将请求流水号put到dataObject对象
            String oCode = String.valueOf(dataObject.get("orderCode"));
            if (StringUtil.isEmpty(oCode)) {
            	dataObject.put("orderCode", orderCode);
			}
            
            dataObject.put("requestClass", requestClass);
            dataObject.put("requestMethod", requestMethod);
            
            SignatureBean signatureBean = ParameterEncapsulation.publicParameter(request_Channel, server_Name,
                server_Method, server_Version, server_Timestamp,
                server_NonceStr, authentication_Key, sign_tokenKey, dataObject);
            log.info("signatureBean="+signatureBean);
            
            //签名后的bean
            signatureBean = SignatureUtil.Signature(signatureBean);
            
            try {
                paramJson = JsonUtils.objectToJson(signatureBean);
                
                log.info("jsonMap="+paramJson);
            } catch (IOException e) {
                e.printStackTrace();
                log.error("jsonMapError="+e.getMessage());
            }
        }
        return paramJson;
    }

    /**
     * 判断是否为空
     * @author chendi
     * @date Aug 28, 20186:19:25 PM
     * 
     * @param obj
     * @return 
     *
     */
    public static boolean isEmpty(String obj) {
        if(obj == null || obj.isEmpty() || obj.trim().equals("") || obj.equals("null")) {
            return true;
        }else {
            return false;
        }
    }

}

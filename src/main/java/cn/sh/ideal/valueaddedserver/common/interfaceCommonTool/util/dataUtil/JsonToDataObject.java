package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.dataUtil;

import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.config.ConstantsCommon;
import cn.sh.ideal.valueaddedserver.common.util.http.HttpRequest;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
//import net.sf.json.JSONObject;

/**
 * 解析接口返回数据，示例：
 * success：{"code":"0000","info":"请求接口成功","dataObject":"原返回xml报文/原返回json报文"}
 *  fail：{"code":"401","info":"IpAddr is forbidden!","dataObject":"nullValue"} 其中失败编码
 * @author chendi
 * @date Aug 24, 20181:44:57 PM
 *
 */
@Slf4j
@Component
public class JsonToDataObject {

	private static final String NullValue = "nullValue";

	@Autowired
	private HttpRequest httpRequest;
	
	/**
	 *  动态获取接口配置url
	 * @param interfaceMethod
	 * @return
	 */
	public static String constantCommon_getUrl(String interfaceMethod) {
		
		String [] strs = interfaceMethod.split("_v");
		String method = strs[0];
		String version = "_v"+strs[1];
		
		//	接口地址
		String url = ConstantsCommon.getValue(method+"URL"+version);
		return url;
	}
    
	
	/**
	 * 动态获取接口配置封装接口json参数
	 * @param interfaceMethod 接口方法名
	 * @param deviceNum 设备号为关键性参数，必传字段
     * @param openId 微信号为关键性参数，必传字段
     * @param orderCode 透传订单号（与接口所需订单号保持一致）为关键性参数，必传字段
     * @param requestClass 调用的类为关键性参数，必传字段
     * @param requestMethod 调用的方法为关键性参数，必传字段
	 * @param dataObject 接口所需参数（调用接口所传参数实在是无法提供，则默认值为 nullValue_XXX调用方法,以便追随查证）
	 */
	public static String constantCommon_ParamPackage(String interfaceMethod,
			String openId, String deviceNum, String orderCode,
			String requestClass, String requestMethod,
			Map<String, Object> dataObject) {
		
		String [] strs = interfaceMethod.split("_v");
		String method = strs[0];
		String version = "_v"+strs[1];
		
		//	接口地址
		String url = ConstantsCommon.getValue(method+"URL"+version);
		// 调用服务渠道
		String request_Channel = ConstantsCommon.request_Channel;
		// 服务接口名称
		String server_Name = ConstantsCommon.getValue(method+"_Name"+version);
		// 服务接口方法
		String server_Method = ConstantsCommon.getValue(method+"_Method"+version);
		// 服务版本号
		String server_Version = ConstantsCommon.getValue(method+"_version"+version);
		// 认证秘钥
		String authentication_Key = ConstantsCommon.getValue(method+"_AKEY"+version);
		
		String jsonMap = "nullValue";
		
		try {
			jsonMap = ParameterEncapsulation.interfaceInvoking(url,
					request_Channel, server_Name, server_Method, server_Version,
					authentication_Key, openId, deviceNum, orderCode, requestClass,
					requestMethod, dataObject);
		} catch (Exception e) {
			log.error("调用"+interfaceMethod+"接口,动态获取接口配置封装接口json参数异常,入参json="+jsonMap);
			jsonMap = "nullValue";
		}
		return jsonMap;
	}
    
	
	
	/**
	 * 调用接口获取返回报文
	 * @param dataObject
	 * @param methodName
	 * @return
	 */
	public  String getDataObject(String methodName,String openId, String deviceNum,
			String orderCode, String requestClass, String requestMethod,
			Map<String, Object> dataObject) {
		
		String json = constantCommon_ParamPackage(methodName, openId, deviceNum,
				orderCode, requestClass, requestMethod, dataObject);
		
		String url = JsonToDataObject.constantCommon_getUrl(methodName);
		
	    try {
	        log.info("调用"+methodName+"接口,入参json="+json);
	        
	        String resultJson = NullValue;
	        
//	        resultJson = NetUtil.postJson(url,json);
			resultJson=httpRequest.HttpPost(url,json);
	        
	        log.info("调用"+methodName+"接口,出参resultJson="+resultJson);
	        
	        //JSONObject jsonObject = JSONObject.fromObject(resultJson);
	        Map<String, Object> jsonObject = JSONObject.parseObject(resultJson);
	        
	        if(jsonObject.get("code")=="0000" || "0000".equals(jsonObject.get("code"))) {
	        	//return jsonObject.getString("dataObject");
	        	return String.valueOf(jsonObject.get("dataObject"));
	        }else {
	            log.error("调用"+methodName+"接口异常，默认返回nullValue，异常原因：code="+jsonObject.get("code")+ 
	                ", info="+jsonObject.get("info"));
	            return NullValue;
	        }
	    } catch (Exception e) {
	        log.error("调用"+methodName+"接口异常，默认返回nullValue，异常原因="+e.getCause()+";异常信息="+e.getMessage());
            return NullValue;
        }
	}
	
}

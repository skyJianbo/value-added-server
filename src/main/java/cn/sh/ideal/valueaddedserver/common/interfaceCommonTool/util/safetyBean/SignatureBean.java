
package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.safetyBean;

import java.io.Serializable;


/**
 * 签名认证属性
 * ClassName: SignatureBean <br/>
 * Function:  TODO ADD FUNCTION. <br/>
 * Reason:      TODO ADD REASON. <br/>
 * Date:      2018年6月7日 下午11:48:06 <br/>
 * @author   振鹏
 * @version  
 * @see      
 */

public class SignatureBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	request_Channel:调用服务的请求渠道号
	server_Name：服务接口名称
	server_Method:服务接口方法
	server_Version:服务版本号
	server_Timestamp:时间戳 10位
	server_NonceStr:随机生成的字符串16位
	authentication_Key：认证秘钥
	sign_tokenKey：二次签名秘钥
	dataObject : 业务数据对象（根据所需类型转换）
	*/
	
	//调用服务的请求渠道号
	private String request_Channel;
	
	//服务接口名称
	private String server_Name;
	
	//服务接口方法
	private String server_Method;
	
	//服务版本号
	private String server_Version;
	
	//时间戳 10位
	private String server_Timestamp;
	
	//随机生成的字符串16位
	private String server_NonceStr;
	
	//认证秘钥
	private String authentication_Key;
	
	//二次签名秘钥即（sign_tokenKey）
	private String sign_tokenKey;
	
	//业务数据对象（根据所需类型转换）
	private Object dataObject ;
	
	
	public SignatureBean(String request_Channel, String server_Name,
			String server_Method, String server_Version,
			String server_Timestamp, String server_NonceStr,
			String authentication_Key, String sign_tokenKey, Object dataObject) {
		super();
		this.request_Channel = request_Channel;
		this.server_Name = server_Name;
		this.server_Method = server_Method;
		this.server_Version = server_Version;
		this.server_Timestamp = server_Timestamp;
		this.server_NonceStr = server_NonceStr;
		this.authentication_Key = authentication_Key;
		this.sign_tokenKey = sign_tokenKey;
		this.dataObject = dataObject;
	}



	public String getServer_Name() {
		return server_Name;
	}

	public void setServer_Name(String server_Name) {
		this.server_Name = server_Name;
	}

	public String getServer_Method() {
		return server_Method;
	}

	public void setServer_Method(String server_Method) {
		this.server_Method = server_Method;
	}

	public String getServer_Version() {
		return server_Version;
	}

	public void setServer_Version(String server_Version) {
		this.server_Version = server_Version;
	}

	public String getServer_Timestamp() {
		return server_Timestamp;
	}

	public void setServer_Timestamp(String server_Timestamp) {
		this.server_Timestamp = server_Timestamp;
	}

	public String getServer_NonceStr() {
		return server_NonceStr;
	}

	public void setServer_NonceStr(String server_NonceStr) {
		this.server_NonceStr = server_NonceStr;
	}

	public String getAuthentication_Key() {
		return authentication_Key;
	}

	public void setAuthentication_Key(String authentication_Key) {
		this.authentication_Key = authentication_Key;
	}
	
	public String getSign_tokenKey() {
		return sign_tokenKey;
	}

	public void setSign_tokenKey(String sign_tokenKey) {
		this.sign_tokenKey = sign_tokenKey;
	}
	
	
	

	public String getRequest_Channel() {
		return request_Channel;
	}

	public void setRequest_Channel(String request_Channel) {
		this.request_Channel = request_Channel;
	}

	public Object getDataObject() {
		return dataObject;
	}

	public void setDataObject(Object dataObject) {
		this.dataObject = dataObject;
	}

	
	@Override
	public String toString() {
		return "SignatureBean [request_Channel=" + request_Channel + ", server_Name=" + server_Name + ", server_Method="
				+ server_Method + ", server_Version=" + server_Version + ", server_Timestamp=" + server_Timestamp
				+ ", server_NonceStr=" + server_NonceStr + ", authentication_Key=" + authentication_Key
				+ ", sign_tokenKey=" + sign_tokenKey + ", dataObject=" + dataObject + "]";
	}
	
		

}


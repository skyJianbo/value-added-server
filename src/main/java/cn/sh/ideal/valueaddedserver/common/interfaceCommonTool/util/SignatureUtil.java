package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util;

import cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.safetyBean.SignatureBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;



/**
 *  接口调用签名工具类
 *  @author  振鹏  
 *  @ClassName  : SignatureUtil*  
 *  @Version  版本 *  
 *  @ModifiedBy 修改人 * 
 *  @Copyright  公司名称 * 
 *  @date  2018年8月23日 下午12:58:47
 */
@Component
@Slf4j
public class SignatureUtil {
	

	public SignatureUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 接口调用签名
	 * @param signatureBean
	 * @return
	 */
	public static SignatureBean Signature(SignatureBean signatureBean){
		
		//调用服务渠道
		String request_Channel = signatureBean.getRequest_Channel();
		
		// 服务接口名称
		String server_Name = signatureBean.getServer_Name();
		
		// 服务接口方法
		String server_Method = signatureBean.getServer_Method();
		
		// 服务版本号
		String server_Version = signatureBean.getServer_Version();
		
		// 时间戳 10位
		String timestamp = (int)((Math.random() * 9 + 1) * 1000)
				+""+(int)((Math.random() * 9 + 1) * 100000);
		
		String server_Timestamp = String.valueOf(timestamp);
		log.info("时间戳 10位 server_Timestamp："+server_Timestamp);
		signatureBean.setServer_Timestamp(server_Timestamp);
		
		// 随机生成的字符串16位
		String server_NonceStr = CreatenNonceUtil.createnNonce_str();
		log.info("随机生成的字符串16位 server_NonceStr："+server_NonceStr);
		signatureBean.setServer_NonceStr(server_NonceStr);
		
		// 认证秘钥
		String authentication_Key = signatureBean.getAuthentication_Key();
	
		/*
		 * 1）将 authentication_Key、 server_NonceStr、 server_Timestamp、 server_Version、server_Method、 server_Name 、request_Channel 七个参数进行字典序排序
		 * 2）将六个参数字符串拼接成一个字符串进行sha1加密
		 * 3）开发者获得加密后的字符串可与signature对比
		 */
		String[] str = { authentication_Key, server_NonceStr, server_Timestamp, server_Version, server_Method,server_Name,request_Channel};
		Arrays.sort(str);
		String bigStr = str[0] + str[1] + str[2] + str[3] + str[4] + str[5] + str[6];
		String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();
		log.info("二次签名秘钥digest："+digest);
		signatureBean.setSign_tokenKey(digest);
		return signatureBean;
	}

}

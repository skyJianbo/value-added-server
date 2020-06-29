package cn.sh.ideal.valueaddedserver.common.util;

import cn.sh.ideal.valueaddedserver.common.Base64;
import lombok.extern.slf4j.Slf4j;

import java.net.URLEncoder;


/** 
 * @description TODO 套餐查查数据处理
 * @version 1.0
 *
 */
@Slf4j
public class QueryPackageUseUtil {
	/**
	 * @description 字符串的加密 encode
	 * @return String
	 */
	public static String addPassEncode(String str) throws Exception{
		if(str == null){
			return "";
		}
		byte[] userIdByteArr = str.getBytes();
		byte[] encodeByteArr = Base64.encode(userIdByteArr);
		str = new String(encodeByteArr);
		try {
			str = URLEncoder.encode(str,"UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	
	/**
	 * @description 字符串的解密 encode
	 * @return String
	 */
	public static String replacePassEncode(String str) throws Exception{
		if(str == null){
			return "";
		}
			byte[] strByteArr = str.getBytes();
			byte[] decodeByteArr = Base64.decode(strByteArr);
			str = new String(decodeByteArr);
		return str;
	}
	//---------------------------------------------------------------------------套餐详细信息xml数据处理
	/**
	 * @description 套餐详情请求报文
	 * @return String
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
	/*	String[] list= {"12345678","oHQuEjjMR4Our4lSbFJoR2Fwv-B4","oHQuEji9kErwQbI1c1fvz09MAofU","oHQuEjgO2Ihb-X4tcEjF5rQn-jzg","oHQuEjoEmrFGdww69lwISeAJSsHY","oHQuEjn3JLiZExZcSqvBw4v5xJeQ"};
		
		for(int i=0;i<list.length;i++) {
			System.out.println(QueryPackageUseUtil.addPassEncode(list[i]));//对用户openId进行加密
		}*/
		System.out.println(QueryPackageUseUtil.replacePassEncode("b0hRdUVqaTlrRXJ3UWJJMWMxZnZ6MDlNQW9mVQ=="));//对用户openId进行加密
		System.out.println(QueryPackageUseUtil.addPassEncode("oHQuEjspSEO1NkZFCxhs-3NYOAnw"));//对用户openId进行加密
		
	}
}

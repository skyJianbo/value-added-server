package cn.sh.ideal.valueaddedserver.common.util;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	
	private static final char [] cs={'楼','层'};
	
	private static final char [] addrs={'镇','区','市'};
	
	
	/**
	 * 检测是否为常用汉字字符。<br>
	 * 范围为Unicode 5.2定义的常用汉字区，即 0x4E00 到 0x9FCB。<br>
	 * 此区域内全部为可见字符，包含2008香港增补、少量偏旁部首。
	 * 
	 * @param c 要检测的字符
	 * @return 是否是常用汉字字符
	 */
	public static boolean isChinese52(final int c) {
		return c >= 0x4E00 && c <= 0x9FCB;
	}
	
	
	
	/***
	 * 验证是否为英文字母
	 * @param c
	 * @return
	 */
	public static boolean isAlphabet(final int c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
	
	public static boolean isNumber10(final int c) {
		return c >= '0' && c <= '9';
	}

	
	
	/***
	 * 校验是否为中文和英文
	 * @param str 字符串
	 * @return 返回true 和false
	 */
	public static boolean isCE(String str){
		if(str==null||str.equals("")||str.equals("null")){
			return false;
		}
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(isAlphabet(c)||isChinese52(c)||isNumber10(c)){
			}else {
				return false;
			}
		}
		return true;
	}
	
	
	
	/***
	 * 校验宽带设备号
	 * @param devNumber 设备号
	 * @return 验证通过true 
	 */
	public static boolean isBroadBand(String devNumber){
		if(devNumber.length()==12){
			String str1=devNumber.substring(0, 2);
			if(str1.equals("ey")||str1.equals("EY")){
				return false;
			}
			for(int i=0;i<str1.length();i++){
				char c=str1.charAt(i);
				if(isAlphabet(c)==false){
					return false;
				}
			}
			String str=devNumber.substring(2, devNumber.length());
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				if(isNumber10(c)==false){
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
	
	
	
	/***
	 * 验证固话
	 * @param tel 固话
	 * @return
	 */
	public static boolean isTel(String tel){
		if(tel.length()!=8){
			return false;
		}else {
			for(int i=0;i<tel.length();i++){
				char c=tel.charAt(i);
				if(c<'0'&&c>'9'){
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	/***
	 * 验证手机格式是否正确
	 * 
	 * @param mobile
	 * @return
	 */
	public static boolean validate_Mobile(String mobile) {
		// ^1[3|4|5|8][0-9]\d{8,8}$
		Pattern mobiles = Pattern.compile("^1[3|4|5|8|7|9][0-9]\\d{8,8}$"); // 手机正则验证
		Matcher m = mobiles.matcher(mobile);
		if (!m.matches()) {// 手机格式不正确
			return false;
		}
		return true;
	}
	
	
	
	
	/**
	 * 验证设备类型
	 * @return
	 */
	public static String validateDevildType(String devild){
		String type = null;
		if(StringUtils.isNotEmpty(devild)){
			//验证是否为手机
			if(StringUtil.validate_Mobile(devild)){
				type = "1";
			}
			//验证是否为固话
			if(StringUtil.isTel(devild)){
				type = "2";
			}
			//验证是否为宽带
			if(StringUtil.isBroadBand(devild)){
				type = "3";
			}
		}
		return type;
	}
	
	public static String validateDevildType1(String devild){
		String type = null;
		if(StringUtils.isNotEmpty(devild)){
			//验证是否为手机
			if(StringUtil.validate_Mobile(devild)){
				type = "1";
			}
			//验证是否为固话
			if(StringUtil.isTel(devild)){
				type = "2";
			}
		}
		return type;
	}
	
	
	
	/***
	 * 随机生成验证码
	 * @return 验证码 
	 */
	public static String getCode(){
		Random rd=new Random();
		int c=rd.nextInt(100000)+99999;
		return c+"";
	}
	
	
	
	/***
	 * 转换编码UTF-8
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String changeUTF8(String str) throws UnsupportedEncodingException{
		if(str==null||str.equals("")){
		}else{
			boolean b=true;
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				if(StringUtil.isChinese52(c)||StringUtil.isNumber10(c)||StringUtil.isAlphabet(c)){
				}else{
					b=false;
					break;
				}
			}
			if(b==false){
				str = new String(str.getBytes("ISO-8859-1"),"UTF-8");
			}
		}
		return str;
	}
	
	
	
	
	public static boolean contrast(String sysAdd,String inputAdd){
		if(sysAdd.equals(inputAdd)){
			return true;
		}
		//匹配路默认为true
		boolean roadFlag = true;
		if(sysAdd.indexOf("路") > 0){
			if(inputAdd.indexOf("路") > 0){
				//系统地址中存在路;则必须匹配
				if(sysAdd.substring(0, sysAdd.indexOf("路")).equals(
						inputAdd.substring(0, inputAdd.indexOf("路")))){
					roadFlag = true;
				}else{
					roadFlag = false;
				}
			}else{
				roadFlag = false;
			}
		}
		
		//匹配弄
		boolean nongFlag = true;
		if(sysAdd.indexOf("弄") > 0){
			if(inputAdd.indexOf("弄") > 0){
				//系统地址中存在弄；则必须匹配
				if(getAddNumber(sysAdd,"弄").equals(getAddNumber(inputAdd,"弄"))){
					//弄的单位完全匹配
					nongFlag = true;
				}else{
					nongFlag = false;
				}
			}else{
				nongFlag = false;
			}
		}
		
		//匹配号
		boolean haoFlag = true;
		if(sysAdd.indexOf("号") > 0){
			if(inputAdd.indexOf("号") > 0){
				//系统地址中存在弄；则必须匹配
				if(getAddNumber(sysAdd,"号").equals(getAddNumber(inputAdd,"号"))){
					//弄的单位完全匹配
					haoFlag = true;
				}else{
					haoFlag = false;
				}
			}else{
				haoFlag = false;
			}
		}
		
		
		//匹配楼
		boolean louFlag = true;
		if(inputAdd.indexOf("楼") > 0){
			if(sysAdd.indexOf("楼") > 0){
				//input地址中存在楼；则必须匹配
				if(getAddNumber(sysAdd,"楼").equals(getAddNumber(inputAdd,"楼"))){
					//弄的单位完全匹配
					louFlag = true;
				}else{
					louFlag = false;
				}
			}else{
				louFlag = false;
			}
		}
		//匹配层
		boolean cengFlag = true;
		if(inputAdd.indexOf("层") > 0){
			if(sysAdd.indexOf("层") > 0){
				//系统地址中存在弄；则必须匹配
				if(getAddNumber(sysAdd,"层").equals(getAddNumber(inputAdd,"层"))){
					//弄的单位完全匹配
					cengFlag = true;
				}else{
					cengFlag = false;
				}
			}else{
				cengFlag = false;
			}
		}
		
		//匹配室
		boolean shiFlag = true;
		if(sysAdd.indexOf("室") > 0){
			//获取室的数据号
			String sysShiNumber = getAddNumber(sysAdd,"室");
			//验证用户有没有输入室
			String inputShiNumber = "";
			if(inputAdd.indexOf("室") > 0){
				inputShiNumber = getAddNumber(inputAdd,"室");
				if(inputShiNumber.equals(sysShiNumber)){
					shiFlag = true;
				}else{
					shiFlag = false;
				}
			}else{
				//系统中有室；但用户没有输入室
				char[] str = inputAdd.toCharArray();
				StringBuffer sub = new StringBuffer();
				for (int i = str.length - 1; i > 0 ; i--) {
					if(isNumber10(str[i])){
						sub.append(str[i]);
					}else{
						break;
					}
				}
				if(sub.toString().equals(sysShiNumber)){
					shiFlag = true;
				}else{
					shiFlag = false;
				}
			}
		}
		if(roadFlag && nongFlag && louFlag && cengFlag && shiFlag && haoFlag){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public static String getAddNumber(String str,String dx){
		String str2 = str.substring(0, str.indexOf(dx));
		char[] str3 = str2.toCharArray();
		StringBuffer sub = new StringBuffer();
		for (int i = str3.length - 1; i > 0 ; i--) {
			if(isNumber10(str3[i])){
				sub.append(str3[i]);
			}else{
				break;
			}
		}
		return sub.toString();
	}
	

	private static String changeNumber(String a){
		String d="";
		int index=0;
		if(a.indexOf("楼")>0){
			index=a.indexOf("楼");
		}else {
			index=a.indexOf("层");
		}
		if(index>0){
			String	b=a.substring(0,index);
			String c1=a.substring(index+1, a.length());
			String [] c=c1.split("室");
			if(c[0].length()==2){
				d=b+c[0];
			}else if(c[0].length()==3||c[0].length()==4){
				d=c[0];
			}else if (c[0].length()==1) {
				d=b+"0"+c[0];
			}
		}else {
			String [] c=a.split("室");
			d=c[0];
		}
		return d;
	}
	
	public static String [] changeChinese(String number){
		String [] strings=null;
		String a="";
		String b="";
		StringBuffer sb=new StringBuffer();
		if(number.length()==3){
			a=number.substring(0, 1);
			b=number.substring(1, number.length());
		}else if(number.length()==4) {
			a=number.substring(0, 2);
			b=number.substring(2, number.length());
		}
		for(int i=0;i<cs.length;i++){
			sb.append(a+cs[i]+Integer.parseInt(b)+"室").append(",");
			sb.append(a+cs[i]+b+"室").append(",");
			sb.append(a+cs[i]+number+"室").append(",");
		}
		sb.append(number+"室").append(",");
		sb.append(number).append(",");
		strings=sb.toString().split(",");
		return strings;
	}
	
	/***
	 * 把数字英文用*替换
	 * @param str
	 * @return
	 */
	public static String replace(String str){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(isAlphabet(c)||isNumber10(c)){
				sb.append("*");
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	/***
	 * 是否为电信号码
	 * @param phone
	 * @return
	 */
	public static boolean isPhone(String phone){
		Pattern pattern=Pattern.compile("^(133|153|189|180|181|177|173|199|191)\\d{8}$");
		Matcher m = pattern.matcher(phone);
		if(m.matches()){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 用户信息脱敏处理
	 * @param userName
	 * @param phone
	 * @return
	 */
	public static Map<String, Object> userInfo_Desensitization(String userName,String phone){
		
		phone = telDesensitization(phone);
		userName = nameDesensitization(userName);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", userName);
		map.put("phone", phone);
		
		return map;
	}
	
	/**
	 * 设备号脱敏
	 * @param phone
	 * @return
	 */
	public static String telDesensitization(String phone){
		
		if(phone.length() == 11){
			 //手机号 隐藏中间4位
			phone=phone.substring(0, 3)+"****"+phone.substring(7, phone.length());
		 }else if (phone.length() == 12) {
			//宽带 隐藏中间4位
			 phone=phone.substring(0, 4)+"****"+phone.substring(8, phone.length());
		}else if (phone.length() == 8) {
			//固话 隐藏中间4位
			phone=phone.substring(0, 2)+"****"+phone.substring(6, phone.length());
		}
		return phone;
	}
	
	
	/**
	 * 姓名脱敏
	 * @param userName
	 * @return
	 */
	public static String nameDesensitization(String userName){
		
		//姓名只留一个字其余都*号代替
		String substr_userName = userName.substring(0, 1);
		
		StringBuffer str = new StringBuffer();
		for (int j = 0 ; j<userName.length()-1;j++){
			str.append("*");
		}
		
		userName = substr_userName + str;
		return userName;
	}
	
	
	
	
	
	/**
	 * 	判断是否为空
	 * @param obj
	 * @return
	 */
	 public static boolean isEmpty(String obj) {
	        if(obj == null || obj.isEmpty() || obj.trim().equals("") || obj.equals("null")) {
	            return true;
	        }else {
	            return false;
	        }
	    }
	 
	 
	/**
	 * @param str
	 * @return 如果str为null或空白字符串，返回true
	 */
	public static boolean isBlank(String str) {
		return str == null ? true : str.trim().length() == 0;
	}
	
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isMargin(String str) {
		if (null != str && "".endsWith(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isHasValue(String str) {
		if (null != str && !"".equals(str)) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * 根据长度替换拦截字符内
	 * 
	 * @param objectStr
	 * @param length
	 * @return
	 */
	public static String splitAndFilterString(String objectStr, int length) {
		if (objectStr == null || objectStr.trim().equals("")) {
			return "";
		}
		String str = objectStr.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll(
				"<[^>]*>", "");
		str = str.replaceAll("[(/>)<]", "");
		int len = str.length();
		if (len <= length) {
			return str;
		} else {
			str = str.substring(0, length);
			str += "......";
		}
		return str;
	}

	/**
	 * 替换拦截字符内
	 * 
	 * @param objectStr
	 * @return
	 */
	public static String replaceAllFilterString(String objectStr) {
		if (objectStr == null || objectStr.trim().equals("")) {
			return "";
		}
		String str = objectStr.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll(
				"<[^>]*>", "");
		str = str.replaceAll("[(/>)<]", "");
		return str;
	}

	/**
	 * "abcd"-->"Abcd"
	 * 
	 * @param str
	 * @return
	 */
	public static String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	/***
	 * String -->string
	 * 
	 * @param str
	 * @return
	 */
	public static String title(String str) {
		return str.substring(0, 1).toLowerCase() + str.substring(1);
	}
	
	
	/***
	 * 判断 String 是否是 int
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isInteger(String str){
		Matcher mer = Pattern.compile("^[+-]?[0-9]+$").matcher(str);
		return mer.find();
	}
	
	public static boolean isDouble(String str){
		Matcher mer = Pattern.compile("^[+-]?[0-9.]+$").matcher(str);
		return mer.find();
	}
	
	
	/***
	 * Get specified length of the string from the specified position.
	 * 
	 * @param data
	 * @param start
	 * @param len
	 * @return
	 */
	public static String subSpecifiedStr(String data, int start, int len) {
		return data.substring(start, start + len);
	}
	
	
	/***
	 * 类似于 linux sed命令的y参数
	 * @param source
	 * @param old
	 * @param target
	 * @return
	 */
	public static String replaceY(String source,String old,String target){
		if(old.length()!=target.length()){
			return null;
		}
		for(int i=0;i<old.length();i++){
			source=source.replace(old.charAt(i), target.charAt(i));
		}
		return source;
	}



	/**
	 *  身份证号脱敏  显示前6位  后4位
	 * @param crtNum
	 * @return
	 */
	public static String crtNumDesensitization(String crtNum){
		if(crtNum == null || crtNum.length() < 10){
			return crtNum;
		}
		String prefix = crtNum.substring(0,6);
		String suffix =  crtNum.substring(crtNum.length()-4);
		int len = crtNum.length()-10;
		String stars="";
		for(int i=0 ;i < len;i++){
			stars += "*";
		}
		return  prefix+stars+suffix;
	}


	public static UUID getRandomUUID(String str) {
		// 产生UUID
		if (str == null) {
			return UUID.randomUUID();
		} else {
			return UUID.nameUUIDFromBytes(str.getBytes());
		}
	}

}

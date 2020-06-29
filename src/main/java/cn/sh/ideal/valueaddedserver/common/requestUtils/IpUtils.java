
 /**
 * Project Name: P2-OnLine-Offline
 * File Name: IpUtils.java
 * Package Name: cn.sh.ideal.microcloud.common.requestUtils
 * Date: 2019年5月2日下午9:48:10
 * Copyright (c) 2019, shanghai Ideal company All Rights Reserved.
 *
*/

package cn.sh.ideal.valueaddedserver.common.requestUtils;


 import cn.sh.ideal.valueaddedserver.common.util.StringUtil;

 import javax.servlet.http.HttpServletRequest;
 import java.util.ArrayList;
 import java.util.StringTokenizer;

 /**
  * ip操作工具类
  * ClassName: IpUtils <br/>
  * Date:      2019年5月2日 下午9:48:10 <br/>
  * @author   NingZhenPeng
  * @version
  * @since    JDK 1.8u171
  * @see
  */
 public class IpUtils {

     public static String getIp(HttpServletRequest request) throws Exception {
         if (request == null) {
             throw (new Exception("getIpAddr method HttpServletRequest Object is null"));
         }
         String ipString = request.getHeader("x-forwarded-for");
         if (StringUtil.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
             ipString = request.getHeader("Proxy-Client-IP");
         }
         if (StringUtil.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
             ipString = request.getHeader("WL-Proxy-Client-IP");
         }
         if (StringUtil.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
             ipString = request.getRemoteAddr();
         }

         // 多个路由时，取第一个非unknown的ip
         final String[] arr = ipString.split(",");
         for (final String str : arr) {
             if (!"unknown".equalsIgnoreCase(str)) {
                 ipString = str;
                 break;
             }
         }

         return ipString;
     }



     /**
      * 判断是否无效格式ip
      * 检查ip格式是否正确
      * To determine whether the input string is a legal ip
      *
      * @param IP
      *            the ip to be checked
      * @return true if the input string is a legal IP
      * @author copy from StringParse.java
      */
     public static boolean isValidIP(String IP) {
         if (IP == null || IP.length() < 1) {
             return false;
         }
         if (IP.indexOf(':') > -1) {
             return isValidV6IP(IP);
         } else {
             return isValidV4IP(IP);
         }
     }

     /**
      * To determine whether the input string is a legal IPV6 ip
      *
      * @param ip
      *            the ip to be checked
      * @return true if the input string is a legal IP
      * @author copy from StringParse.java
      */
     public static boolean isValidV6IP(String ip) {
         if (ip == null || ip.length() < 3) {
             return false;
         }
         int interfaceIndex = ip.lastIndexOf('%');
         if (interfaceIndex > -1) {
             String num = ip.substring(interfaceIndex + 1);
             try {
                 Integer.parseInt(num);
             } catch (NumberFormatException e) {
                 return false;
             }

             ip = ip.substring(0, interfaceIndex);
         }
         int singleIdx = ip.indexOf("::");
         int hasDouble = 0;
         ArrayList<String> tokens = new ArrayList<String>();
         if ((ip.startsWith(":") && (!ip.startsWith("::")))
                 || (ip.endsWith(":") && (!ip.endsWith("::")))) {
             return false;
         }
         if (singleIdx != -1) {
             hasDouble = 1;
             if (ip.indexOf("::", singleIdx + 1) != -1) {
                 return false;
             }
         }
         StringTokenizer st = new StringTokenizer(ip, ":");
         while (st.hasMoreTokens()) {
             String token = st.nextToken();
             if (token.length() > 4) {
                 return false;
             }
             char[] chars = token.toCharArray();
             for (int i = 0; i < chars.length; i++) {
                 if (!(Character.isDigit(chars[i])
                         || (chars[i] >= 'a' && chars[i] <= 'f') || (chars[i] >= 'A' && chars[i] <= 'F'))) {
                     return false;
                 }
             }
             tokens.add(token);
         }

         if ((tokens.size() + hasDouble) > 8
                 || (tokens.size() < 8 && hasDouble == 0)) {
             return false;
         }

         return true;
     }

     /**
      * To determine whether the input string is a legal IPV4 ip
      *
      * @param ip
      *            the ip to be checked
      * @return true if the input string is a legal IP
      * @author copy from StringParse.java
      */
     public static boolean isValidV4IP(String ip) {
         if (ip == null) {
             return false;
         }

         if (ip.trim().indexOf("..") > -1 || ip.trim().startsWith(".")
                 || ip.trim().endsWith(".")) {
             return false;
         }

         StringTokenizer stringtokenizer = new StringTokenizer(ip, ".");
         if (stringtokenizer.countTokens() != 4) {
             return false;
         }

         try {
             int tempInt = 0;
             while (stringtokenizer.hasMoreTokens()) {
                 tempInt = Integer.parseInt(stringtokenizer.nextToken());
                 if (tempInt > 255 || tempInt < 0) {
                     return false;
                 }
             }
         } catch (NumberFormatException e) {
             return false;
         }

         return true;
     }


 }


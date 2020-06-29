
 /**
 * Project Name: P2-OnLine-Offline
 * File Name: RequestUtils.java
 * Package Name: cn.sh.ideal.microcloud.common
 * Date: 2019年3月27日下午10:35:20
 * Copyright (c) 2019, shanghai Ideal company All Rights Reserved.
 *
*/

package cn.sh.ideal.valueaddedserver.common.requestUtils;

 import org.apache.commons.lang3.StringUtils;

 import javax.servlet.http.HttpServletRequest;

 /**
  * ClassName: RequestUtils <br/>
  * Date:      2019年3月27日 下午10:35:20 <br/>
  * @author   NingZhenPeng
  * @version
  * @since    JDK 1.8u171
  * @see
  */
 public class RequestUtils {



     /**
      * isAjax: ( 判断是否是ajax请求). <br/>
      * @author NingZhenPeng
      * @param req
      * @return
      * @since JDK 1.8u171
      */
     public static boolean isAjax(HttpServletRequest req){
         //判断是否为ajax请求，默认不是
         boolean isAjaxRequest = false;
         if(!StringUtils.isBlank(req.getHeader("x-requested-with")) && req.getHeader("x-requested-with").equals("XMLHttpRequest")){
             isAjaxRequest = true;
         }
         return isAjaxRequest;
     }

 }


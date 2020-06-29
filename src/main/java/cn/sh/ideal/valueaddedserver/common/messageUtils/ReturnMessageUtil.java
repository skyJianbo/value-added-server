
 /**
 * Project Name: P2-OnLine-Offline
 * File Name: ReturnMessageUtil.java
 * Package Name: cn.sh.ideal.microcloud.common
 * Date: 2019年3月27日下午10:59:32
 * Copyright (c) 2019, shanghai Ideal company All Rights Reserved.
 *
*/

package cn.sh.ideal.valueaddedserver.common.messageUtils;

import cn.sh.ideal.valueaddedserver.common.constantUtils.Constants;

 /**
  * ClassName: ReturnMessageUtil <br/>
  * Date:      2019年3月27日 下午10:59:32 <br/>
  * @author   NingZhenPeng
  * @version
  * @since    JDK 1.8u171
  * @see
  */
 public class ReturnMessageUtil {


     /**
      *  build: (自定义statusCode、statusMessage、data返回内容). <br/>
      *
      * @author NingZhenPeng
      * @param statusCode
      * @param statusMessage
      * @param data
      * @return
      * @since JDK 1.8u171
      */
     public static ReturnMessage build(Integer statusCode, String statusMessage, Object data) {
         return new ReturnMessage(statusCode, statusMessage, data);
     }




     /**
      * 	无异常 请求成功并有具体内容返回
      * @param data
      * @return
      */
     public static ReturnMessage success(Object data) {
         ReturnMessage message = new ReturnMessage(Constants.BUSINESS_SUCCESS,Constants.BUSINESS_SUCCESS_MSG,data);
         return message;
     }




     /**
      * 	无异常 请求成功并无具体内容返回
      * @return
      */
     public static ReturnMessage success() {
         ReturnMessage message = new ReturnMessage(Constants.BUSINESS_SUCCESS,Constants.BUSINESS_SUCCESS_MSG);
         return message;
     }




     /**
      * 	自定义错误异常信息无具体内容返回
      * @param statusCode
      * @param statusMessage
      * @return
      */
     public static ReturnMessage errorDefaultData(Integer statusCode,String statusMessage) {
         ReturnMessage message = new ReturnMessage(statusCode,statusMessage,Constants.DEFAULT_ERROR_DATA);
         return message;
     }

     /**
      * 	自定义错误异常信息无具体内容返回
      * @param statusCode
      * @param statusMessage
      * @return
      */
     public static ReturnMessage errorNoData(Integer statusCode,String statusMessage) {
         ReturnMessage message = new ReturnMessage(statusCode,statusMessage);
         return message;
     }



     /**
      * 自定义错误异常信息code、错误信息、错误内容
      *
      * @author NingZhenPeng
      * @param statusCode
      * @param statusMessage
      * @param data
      * @return
      * @since JDK 1.8u171
      */
     public static ReturnMessage error(Integer statusCode,String statusMessage,Object data) {
         ReturnMessage message = new ReturnMessage(statusCode,statusMessage,data);
         return message;
     }


     /**
      * 自定义错误异常信息有具体内容返回
      *
      * @author NingZhenPeng
      * @param data
      * @return
      * @since JDK 1.8u171
      */
     public static ReturnMessage error(Object data) {
         ReturnMessage message = new ReturnMessage(Constants.BUSINESS_FAIL,Constants.BUSINESS_FAIL_MSG,data);
         return message;
     }


     /**
      * 错误异常信息无具体内容返回
      *
      * @author NingZhenPeng
      * @return
      * @since JDK 1.8u171
      */
     public static ReturnMessage error() {
         ReturnMessage message = new ReturnMessage(Constants.BUSINESS_ERROR,Constants.DEFAULT_ERROR_DATA);
         return message;
     }



 }


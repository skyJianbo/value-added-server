
/**
* Project Name: P2-OnLine-Offline
* File Name: GlobalDefaultExceptionHandler.java
* Package Name: cn.sh.ideal.microcloud.common.exception
* Date: 2019年3月24日下午11:54:28
* Copyright (c) 2019, shanghai Ideal company All Rights Reserved.
*
*/

package cn.sh.ideal.valueaddedserver.common.exception;


import cn.sh.ideal.valueaddedserver.common.constantUtils.Constants;
import cn.sh.ideal.valueaddedserver.common.messageUtils.ReturnMessageUtil;
import cn.sh.ideal.valueaddedserver.common.requestUtils.RequestUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 	全局异常处理类(处理默认Exception、RunTimeException、自定义BusinessException)
 * 	返回两种消息类型：view、data
 * ClassName: GlobalDefaultExceptionHandler <br/>
 * Date: 2019年3月24日 下午11:54:28 <br/>
 * 
 * @author NingZhenPeng
 * @version
 * @since JDK 1.8u171
 * @see
 */
@Slf4j
@RestControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	
	/**
	 * defaultErrorHandler: (Exception默认异常处理). <br/>
	 * @author NingZhenPeng
	 * @param request
	 * @param e
	 * @return
	 * @since JDK 1.8u171
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Object defaultErrorHandler(HttpServletRequest request, Exception e) {

		log.error("请求：{},异常{}",request.getRequestURL().toString(), e.getMessage());
		return ReturnMessageUtil.errorDefaultData(Constants.EXCEPTION, e.getMessage());
	}
	
	
	
	
	
	/**
	 * 
	 * defaultErrorHandler: (RuntimeException运行时异常处理). <br/>
	 * @author NingZhenPeng
	 * @param request
	 * @param e
	 * @return
	 * @since JDK 1.8u171
	 */
	@ResponseBody
	@ExceptionHandler(value = RuntimeException.class)
	public Object handleRuntimeException(HttpServletRequest request, RuntimeException e) {

		log.error("请求：{},异常{}",request.getRequestURL().toString(), e.getMessage());

		//判断是否是ajax请求
    	if (RequestUtils.isAjax(request)) {
    		return ReturnMessageUtil.errorDefaultData(500, e.getMessage());
    	} else {
    		ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", request.getRequestURL());
			mav.setViewName(String.valueOf(Constants.EXCEPTION));
            return mav;
    	}
	}
	
	

	/**
	 * 自定义业务异常处理
	 * handleBusinessException: (BusinessException自定义业务异常处理). <br/>
	 * @author NingZhenPeng
	 * @param e
	 * @param request
	 * @return
	 * @since JDK 1.8u171
	 */
	@ExceptionHandler(BusinessException.class)
	public Object handleBusinessException(HttpServletRequest request, BusinessException e) {


		log.error("请求：{},异常{}",request.getRequestURL().toString(), e.getMessage());

		//判断是否是ajax请求
    	if (RequestUtils.isAjax(request)) {
    		return ReturnMessageUtil.errorDefaultData(e.getStatusCode(), e.getMessage());
    	} else {
    		
    		/*
    		ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", request.getRequestURL());
            mav.setViewName(Constants.ERROR_VIEW);
            return mav;
            */
            
            return ReturnMessageUtil.errorNoData(e.getStatusCode(), e.getMessage());
    	}
	}
	
	
}

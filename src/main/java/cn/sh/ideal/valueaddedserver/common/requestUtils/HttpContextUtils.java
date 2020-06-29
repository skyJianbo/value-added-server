package cn.sh.ideal.valueaddedserver.common.requestUtils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  获取HttpContext
 * ClassName:  HttpContextUtils <br/>
 * date:  2019年10月21日 下午11:10:43 <br/>
 *
 * @author NingZhenPeng
 * @version 
 * @since JDK 1.8u171
 */
public class HttpContextUtils {
	
	
	/**
	 * 
	 * getHttpServletRequest: (获取HttpServletRequest). <br/>
	 * @author NingZhenPeng
	 * @return
	 * @since JDK 1.8u171
	 */
	public static HttpServletRequest getHttpServletRequest() {
	    ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	    HttpServletRequest request = servletRequestAttributes.getRequest();
	    return request;
	}
	
	
	/**
	 * 
	 * getHttpServletResponse: (获取HttpServletResponse). <br/>
	 * @author NingZhenPeng
	 * @return
	 * @since JDK 1.8u171
	 */
	public static HttpServletResponse getHttpServletResponse() {
	    ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	    HttpServletResponse response = servletRequestAttributes.getResponse();
	    return response;
	}
	 
}

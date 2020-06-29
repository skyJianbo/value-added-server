package cn.sh.ideal.valueaddedserver.common.messageUtils;

import cn.sh.ideal.valueaddedserver.common.constantUtils.Constants;
import cn.sh.ideal.valueaddedserver.common.util.DateUtil;

import java.util.Date;

/**
 *	自定义全局(包括正常、异常)响应数据结构
 * ClassName:  ReturnMessage <br/>
 * date:  2019年3月27日 下午10:07:57 <br/>
 *
 * @author NingZhenPeng
 * @version 
 * @since JDK 1.8u171
 */
public class ReturnMessage {
	
	
    // 状态码
    private Integer statusCode;

    // 状态消息
    private String statusMessage;

    // 返回具体数据内容
    private Object data = Constants.DEFAULT_ERROR_DATA;
    
    // 响应时间
    private String date;
    
    

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
    
	
	
	public ReturnMessage() {
		// TODO Auto-generated constructor stub
	}
	
    
	/**
	 * 有参构造器
	 * Creates a new instance of ReturnMessage.
	 *
	 * @param code
	 * @param msg
	 * @param data
	 * @param date
	 */
    public ReturnMessage(Integer code, String msg, Object data,String date) {
    	super();
        this.statusCode = code;
        this.statusMessage = msg;
        this.data = data;
        this.date = date;
    }
    
    /**
	 * 	有参构造器
	 * Creates a new instance of ReturnMessage.
	 *
	 * @param code
	 * @param msg
	 * @param data
	 */
    public ReturnMessage(Integer code, String msg, Object data) {
    	super();
        this.statusCode = code;
        this.statusMessage = msg;
        this.data = data;
        this.date = DateUtil.getDateTimeStr(new Date());
    }
    
    
    /**
	 * 	有参构造器
	 * Creates a new instance of ReturnMessage.
	 *
	 * @param code
	 * @param msg
	 */
    public ReturnMessage(Integer code, String msg) {
    	//super();
        this.statusCode = code;
        this.statusMessage = msg;
        this.date = DateUtil.getDateTimeStr(new Date());
    }
    
    
}

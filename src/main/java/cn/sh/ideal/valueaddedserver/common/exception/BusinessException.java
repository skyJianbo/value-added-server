package cn.sh.ideal.valueaddedserver.common.exception;

import cn.sh.ideal.valueaddedserver.common.constantUtils.Constants;

import java.io.Serializable;

/**
 * 	自定义业务BusinessException异常
 * ClassName:  BusinessException <br/>
 * date:  2019年3月27日 下午10:40:46 <br/>
 * @author NingZhenPeng
 * @version 
 * @since JDK 1.8u171
 */
public class BusinessException extends RuntimeException implements Serializable {
	
	
	 /**
	  * 序列化版本uid
	  * @since JDK 1.8u171
	 */
	private static final long serialVersionUID = -4136910417061087080L;
	
	
	//BusinessException异常码
	private int statusCode = Constants.BUSINESS_EXCEPTION;
	
	//BusinessException异常信息（具体异常信息）
    private String statusMessage;
    
    //BusinessException返回数据内容（可能有数据信息返回）
    private Object data;
    
    
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
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
	
	
	//无惨构造
	public BusinessException() {
		super();
	}
	
	
	
	public BusinessException(String statusMessage) {
		super(statusMessage);
		this.statusMessage = statusMessage;
	}
	
	
	public BusinessException(String statusMessage, Throwable e) {
		super(statusMessage,e);
		this.statusMessage = statusMessage;
	}
	
	
	public BusinessException(int statusCode, String statusMessage) {
		super(statusMessage);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	
	
	
	public BusinessException(int statusCode, String statusMessage, Throwable e) {
		super(statusMessage,e);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	
	
	
	public BusinessException(int statusCode, String statusMessage, Object data) {
		super(statusMessage);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.data = data;
	}
	
	
	public BusinessException(int statusCode, String statusMessage, Object data,Throwable e) {
		super(statusMessage,e);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.data = data;
	}


}

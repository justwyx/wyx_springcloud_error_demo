package com.wyx.common.exception;

/**
 * @author : Just wyx
 * @Description : TODO 2020/8/27
 * @Date : 2020/8/27
 */
public class ExceptionInfo {
	private Long timestamp;

	private Integer status;
	//异常包结构-"com.crazy.cloud.common.exception.DataConflictException"
	private String exception;
	//信息--手机已注册
	private String message;

	private String path;

	private String error;

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}

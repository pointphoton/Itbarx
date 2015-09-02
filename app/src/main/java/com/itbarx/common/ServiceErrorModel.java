package com.itbarx.common;

import java.util.Date;

public class ServiceErrorModel<T> {

	private String errorCode;
	private String description;
	private Date errorDate;

	private T errorModelType;

	public String getErrorCode() {
	return errorCode;
	}

	public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public Date getErrorDate() {
	return errorDate;
	}

	public void setErrorDate(Date errorDate) {
	this.errorDate = errorDate;
	}

	public T getErrorType() {
	return errorModelType;
	}

	public void setErrorType(T errorType) {
	this.errorModelType = errorType;
	}
}

package com.mindbowser.util;

import java.sql.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mindbowser.exception.ValidatioErrorResponse;

@JsonInclude(Include.NON_DEFAULT)
public class ErrorResponse {

	private String details;

	private int statusCode;

	private String error;

	private Date timestamp;

	private String message;

	private List<ValidatioErrorResponse> validationErros;

	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(String details, int statusCode, String error, Date timestamp, String message) {
		super();
		this.details = details;
		this.statusCode = statusCode;
		this.error = error;
		this.timestamp = timestamp;
		this.message = message;
	}

	public ErrorResponse(java.util.Date date, String string, String message2, int code, String message3) {
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(String message2, int errorCode, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public List<ValidatioErrorResponse> getValidationErros() {
		return validationErros;
	}

	public void setValidationErros(List<ValidatioErrorResponse> validationErros) {
		this.validationErros = validationErros;
	}

	public String getDetails() {
		return details;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getError() {
		return error;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

}

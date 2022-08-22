package com.mindbowser.util;

public class SucessResponse<T> {

	private String message;
	private int code;
	private T data;

	public SucessResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SucessResponse(T data, int code) {
		super();
		this.data = data;
		this.code = code;
	}

	public SucessResponse(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}

	public SucessResponse(String message, T data, int code) {
		super();
		this.message = message;
		this.data = data;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public T getData() {
		return data;
	}

}

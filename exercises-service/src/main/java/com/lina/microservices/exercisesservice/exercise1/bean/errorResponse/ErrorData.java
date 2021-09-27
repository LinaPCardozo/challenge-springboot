package com.lina.microservices.exercisesservice.exercise1.bean.errorResponse;

public class ErrorData {

	private String code;
	
	private String detail;
	
	private String title;

	public ErrorData() {
		
	}
	
	public ErrorData(String detail, String title) {
		super();
		int c = (int) (Math.random() * 9001 + 1000);
		this.code = Integer.toString(c);
		this.detail = detail;
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}

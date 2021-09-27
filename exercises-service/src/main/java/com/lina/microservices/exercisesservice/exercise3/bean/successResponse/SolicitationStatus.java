package com.lina.microservices.exercisesservice.exercise3.bean.successResponse;

public class SolicitationStatus {

	private int statusCode;
	
	private String statusDescription;
	
	private int errorCode;
	
	private ErrorDescription errorDescription;
	
	private AvailableAmount availableAmount;

	public SolicitationStatus() {
		
	}
	
	public SolicitationStatus(int statusCode, String statusDescription, int errorCode,
			ErrorDescription errorDescription, AvailableAmount availableAmount) {
		super();
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		this.availableAmount = availableAmount;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public ErrorDescription getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(ErrorDescription errorDescription) {
		this.errorDescription = errorDescription;
	}

	public AvailableAmount getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(AvailableAmount availableAmount) {
		this.availableAmount = availableAmount;
	}
	
}

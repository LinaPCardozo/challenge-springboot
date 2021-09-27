package com.lina.microservices.exercisesservice.exercise3.bean.successResponse;

public class ErrorDescription {

	private int productId;
	
	private String clientName;
	
	public ErrorDescription() {
		super();
		this.productId = 0;
		this.clientName = "N/A";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
}

package com.lina.microservices.exercisesservice.exercise1.bean.successResponse;

public class SuccessAttributeConfirmation implements SuccessAttribute {
	
	private String transactionDate;
	
	private int confirmNumber;

	public SuccessAttributeConfirmation() {
		
	}
	
	public SuccessAttributeConfirmation(String transactionDate, int confirmNumber) {
		super();
		this.transactionDate = transactionDate;
		this.confirmNumber = (int) (Math.random() * 90001 + 10000);
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getConfirmNumber() {
		return confirmNumber;
	}

	public void setConfirmNumber(int confirmNumber) {
		this.confirmNumber = confirmNumber;
	}
	
}

package com.lina.microservices.exercisesservice.exercise3.bean.successResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AvailableAmount {

	private String currency;
	
	private int amount;
	
	private String expirationDate;

	public AvailableAmount() {
		
	}
	
	public AvailableAmount(String currency, int amount) {
		super();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		
		this.currency = currency;
		this.amount = amount;
		this.expirationDate = dtf.format(now);
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}

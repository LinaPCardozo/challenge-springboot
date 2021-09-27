package com.lina.microservices.exercisesservice.exercise1.bean.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attribute {

	@Id
	@GeneratedValue
	private int id;
	
	private String transactionDate;
	
	private String consumerId;
	
	private String accessToken;
	
	private String clientIp;
	
	private String clientId;

	public Attribute() {
		
	}
	
	public Attribute(String transactionDate, String consumerId, String accessToken, String clientIp, String clientId) {
		super();
		this.transactionDate = transactionDate;
		this.consumerId = consumerId;
		this.accessToken = accessToken;
		this.clientIp = clientIp;
		this.clientId = clientId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
}

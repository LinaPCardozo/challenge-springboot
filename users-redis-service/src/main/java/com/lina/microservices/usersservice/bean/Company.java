package com.lina.microservices.usersservice.bean;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("company")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -658037179601843375L;

	private String name;
	
	private String catchPhrase;
	
	private String bs;
	
	public Company() {
		
	}
	
	public Company(String name, String catchPhrase, String bs) {
		super();
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCatchPhrase() {
		return catchPhrase;
	}
	
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	
	public String getBs() {
		return bs;
	}
	
	public void setBs(String bs) {
		this.bs = bs;
	}
	
	
}
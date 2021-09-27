package com.lina.microservices.exercisesservice.exercise1.bean.successResponse;

public class SuccessData {

	private SuccessAttribute attributes;
	
	private int id;
	
	private String type;

	public SuccessData() {
		
	}
	
	public SuccessData(SuccessAttribute attributes, String type) {
		super();
		this.attributes = attributes;
		this.id = (int) (Math.random() * 9001 + 1000);
		this.type = type;
	}

	public SuccessAttribute getAttributes() {
		return attributes;
	}

	public void setAttributes(SuccessAttribute attributes) {
		this.attributes = attributes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

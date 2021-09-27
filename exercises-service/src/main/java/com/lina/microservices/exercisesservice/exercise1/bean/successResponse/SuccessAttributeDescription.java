package com.lina.microservices.exercisesservice.exercise1.bean.successResponse;

public class SuccessAttributeDescription implements SuccessAttribute {

	private String description;

	public SuccessAttributeDescription() {
		
	}
	
	public SuccessAttributeDescription(String description) {
		super();
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

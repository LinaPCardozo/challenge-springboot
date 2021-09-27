package com.lina.microservices.exercisesservice.exercise1.bean.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Data {

	private String type;
	
	@Id
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Attribute attributes;

	public Data() {
		
	}
	
	public Data(String type, int id, Attribute attributes) {
		super();
		this.type = type;
		this.id = id;
		this.attributes = attributes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Attribute getAttributes() {
		return attributes;
	}

	public void setAttributes(Attribute attributes) {
		this.attributes = attributes;
	}
	
}

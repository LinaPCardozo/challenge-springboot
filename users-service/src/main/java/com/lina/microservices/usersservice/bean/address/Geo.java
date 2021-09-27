package com.lina.microservices.usersservice.bean.address;

public class Geo {

	private String lat;
	
	private String lng;

	public Geo() {
		
	}
	
	public Geo(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}

	public String getlat() {
		return lat;
	}

	public void setlat(String lat) {
		this.lat = lat;
	}

	public String getlng() {
		return lng;
	}

	public void setlng(String lng) {
		this.lng = lng;
	}
	
}
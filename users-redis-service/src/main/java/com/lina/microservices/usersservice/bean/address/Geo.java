package com.lina.microservices.usersservice.bean.address;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("geo")
public class Geo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1706756550521460923L;

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
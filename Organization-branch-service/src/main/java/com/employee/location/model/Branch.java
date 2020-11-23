package com.employee.location.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long zipCode;
	private String city;
	private String street;
	private int port;
	
	public Branch() {
		
	}
	
	public Branch(String city, String street, int port) {
		super();
		this.city = city;
		this.street = street;
		this.port = port;
	}
	
	

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}

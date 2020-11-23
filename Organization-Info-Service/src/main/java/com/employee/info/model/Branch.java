package com.employee.info.model;

public class Branch {
	
	
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

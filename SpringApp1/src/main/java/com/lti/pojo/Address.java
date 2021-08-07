package com.lti.pojo;

public class Address {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//use this param. constructor when we are using class config with annotation and not bean xml file
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Address() {  //this constructor is used for scope prototype and singleton
		super();
		// TODO Auto-generated constructor stub
	}
	

}

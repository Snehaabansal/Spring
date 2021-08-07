package com.lti.pojo;

public class Employee {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void displayEmpMsg() {
		System.out.println("Message to Emp is :"+message);
		
	}

}

package com.lti.pojo;

public class Department {
	private String deptname;
	private String location;
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void display() {
		System.out.println("Department name: "+deptname+" Location: "+location);
	}
	

}

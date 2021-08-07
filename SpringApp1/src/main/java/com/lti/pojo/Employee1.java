package com.lti.pojo;

public class Employee1 {
	private int empno;
	private String name;
	private Address address;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//use constructor when we are using class config with annotation and not bean xml file
	public Employee1(int empno, String name, Address address) {
		super();
		this.empno = empno;
		this.name = name;
		this.address = address;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) { //this constructor is used for scope prototype and singleton
		this.address = address;
	}
	public Employee1(int empno, String name) {  //this constructor is used for scope prototype and singleton
		super();
		this.empno = empno;
		this.name = name;
	}

}

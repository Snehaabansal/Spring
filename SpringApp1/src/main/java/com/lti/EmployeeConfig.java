package com.lti;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.lti.pojo.Address;

import com.lti.pojo.Employee1;

@Configuration
public class EmployeeConfig {
	@Bean(name="empAddress")
	public Address getAddress() {
		return new Address("gwl", "MP");
	}
	@Bean(name="empBean1")
	@Scope("prototype")
	//@Scope("singleton")
	public Employee1 getEmployee1()
	{
		return new Employee1(101,"Ram", getAddress());
	}

}

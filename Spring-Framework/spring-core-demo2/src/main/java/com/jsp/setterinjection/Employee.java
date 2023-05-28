package com.jsp.setterinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empid;
	private String name;
	private String email;
	
	@Value(value = "1234")
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Value(value = "xyz")
	public void setName(String name) {
		this.name = name;
	}
	@Value(value = "xyz@mail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void print() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
	}
	
	

}

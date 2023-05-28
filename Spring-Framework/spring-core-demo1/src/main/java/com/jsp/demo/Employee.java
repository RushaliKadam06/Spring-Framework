package com.jsp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value="1024")
	int empid;
	@Value(value="xyz")
	String name;
	@Value(value="xyz")
	String email;
	
	public void print() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
	}

}

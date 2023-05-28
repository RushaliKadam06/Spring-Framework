package com.jsp.constructorinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int empid;
	String name;
	String email;
	
	
	public Employee( @Value(value = "1234") int empid, @Value(value = "abc") String name,@Value(value = "abc@mail.com") String email) {
		
		this.empid = empid;
		this.name = name;
		this.email = email;
	}
	
	public void print() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
	}
	

}

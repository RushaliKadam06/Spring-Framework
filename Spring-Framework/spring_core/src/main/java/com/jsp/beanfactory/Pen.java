package com.jsp.beanfactory;

public class Pen {
	
	 String colour;
	 String brand;
	 int price;
	
	public Pen(String colour, String brand, int price) {
		
		this.colour = colour;
		this.brand = brand;
		this.price = price;
	}

	

	Pen(){
		System.out.println("pen object created by spring");
	}
	
	public void write() {
		System.out.println(this.colour);
		System.out.println(this.brand);
		System.out.println(this.price);
	}

}

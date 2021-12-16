package com.example.demo.model;

public class Invoice {
	
	private int invoiceNumber; //instance variable
	
	private static double discount;  //static or class variable
	
	//Declaring a constant should be ALL CAPS
	public static final int STARTNUMBER=100;
	
	//instance method can access both instance and static variable
	public void show() {        
		
		System.out.println(invoiceNumber);
		System.out.println(discount);
		 showAll();
	}
	
	//static method can access only static variable and static methods
	
	public static void showAll() {
		
		//System.out.println(invoiceNumber);
		System.out.println(discount);
		Math.sqrt(4);
		double radian30=Math.toRadians(30);
		System.out.println(radian30);
	

	}
	
	

}

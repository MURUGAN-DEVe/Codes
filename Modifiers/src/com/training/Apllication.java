package com.training;

public class Apllication {

	public static void main(String[] args) {
		
		Student ram = new Student();
		//can't access the private variable
		//System.out.println(ram.firstname);
		//can access if it is package or default
		System.out.println(ram.fees);

	}

}

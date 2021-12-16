package com.example.demo.model;

public class Apllication {
	public static void main(String[] args) {
		
		Employee arun = new Employee(101,"Arun","Developer",10000);
		Employee wilson = new Employee(101,"Arun","Developer",10000);
		
		boolean isEqual=arun.equals(wilson);
		System.out.println("Excepted: True Actuall=> "+isEqual);
		
		// True because of Same Reference not the values
		Employee oneMoreArun=arun;
		boolean isSame=arun.equals(oneMoreArun);
		System.out.println("Excepted: True Actuall=> "+isSame);
		
	}

}

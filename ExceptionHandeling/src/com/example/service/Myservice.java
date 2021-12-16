package com.example.service;

public class Myservice {
	
	public double mark() {
		//Object stMark=new String("ninety");
		Object stMark= Integer.valueOf(45);
		int mark=0;
		
		try {
			mark = (Integer)stMark;
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println(mark);
		return 0;
		
	}
	
	public double markWithNestedTryCatch(String markScored) {
		Object stMark= Integer.valueOf(45);
		int mark=0;
		double testScore =0.0;
		try {
			try {
				mark = (Integer)stMark;
			} catch (Exception e) {
				e.printStackTrace();
			}
			testScore=Double.parseDouble(markScored);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(testScore);
		return 0;
		
	}
	
	
	public double markWitheMultipleTryCatch(String i) {
		Object stMark= Integer.valueOf(45);
		int mark=0;
		double testScore =0.0;
		try {
			mark = (Integer)stMark;
			testScore=Double.parseDouble(i);
		} catch (NumberFormatException|ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println(mark);
		System.out.println(testScore);
		return 0;
		
	}
	
	
	//Declare Exception instead of handling
	public String exampleForDeclare(String name)throws NullPointerException {
		
		return name.toUpperCase();
		
	}
	
	

}

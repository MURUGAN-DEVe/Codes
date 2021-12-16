package com.training;

public class Testgreeting {

	public static void main(String[] args) {
		
		Greeting grtObj = new Greeting();
		System.out.println(grtObj.getMessage(args[0]));
		System.out.println(Greeting.print());

	}
}
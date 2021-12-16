package com.example.demo;

import com.example.training.CureencyConverter;
import com.example.training.TempController;

public class Apllication {

	public static void printValue(Function[] obj) {
		
		for(Function eachFunction:obj)
		{
			System.out.println(eachFunction.apply(50));
		}
		
	}
	
	public static void main(String[] args) {

		Function f1=new CureencyConverter();
		Function f2=new TempController();
		
		Function[] fun= {f1,f2};
		
		printValue(fun);

	}

}

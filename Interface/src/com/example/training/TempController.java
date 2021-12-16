package com.example.training;

import com.example.demo.Function;

public class TempController implements Function {
	
	//Celsius to Faren

	@Override
	public double apply(double arg) {
		return (arg*9/5)+32;
	}

}

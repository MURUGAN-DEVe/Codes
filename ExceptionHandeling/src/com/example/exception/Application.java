package com.example.exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.logging.utils.LogggingUtility;
import com.example.service.Myservice;

public class Application {

	public static void main(String[] args) {
		
		Myservice service=new Myservice();
		service.mark();
		service.markWithNestedTryCatch("50");
		service.markWitheMultipleTryCatch("60");
		String city=null;
		
			try {
				service.exampleForDeclare(city);
			} catch (NullPointerException e) {

				System.err.println(e.getMessage());
			}
			
			
		


	}

}

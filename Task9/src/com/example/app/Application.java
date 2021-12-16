package com.example.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.customer.Customeer;
import com.example.logging.utils.LogggingUtility;
import com.example.task.InvalidEmailException;

public class Application {

	public static void main(String[] args) {
		
		
		Logger logger=LogggingUtility.getLogger(Application.class);
		FileHandler handler;
		try {
			handler=new FileHandler("mylogs.log",true);
			logger.addHandler(handler);
			Customeer cus=new Customeer(101, "Arun", "arun@gamil.com");
			logger.info(cus.toString());
		} catch (InvalidEmailException |SecurityException|IOException e) {
			e.printStackTrace();
		}
		

	}

}

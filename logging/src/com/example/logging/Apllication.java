package com.example.logging;

import java.io.IOException;
import java.util.logging.*;

import com.example.logging.utils.LogggingUtility;

public class Apllication {
	
	
	public static void main(String[] args) {
		
		Logger logger =LogggingUtility.getLogger(Apllication.class);
		
		try {
			FileHandler handler=new FileHandler("mylogs.log",true);
			logger.addHandler(handler);
			
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		//logger.setLevel(Level.SEVERE);
		
		logger.info("logger Success");
		logger.warning("Warning");
		logger.severe("Severe");
		logger.fine("Fine");
	}

}

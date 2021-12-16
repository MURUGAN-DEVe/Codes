package com.example.logging.utils;

import java.util.logging.Logger;

public class LogggingUtility {
	
	public static Logger getLogger(Class clsName) {
		
		      String path = clsName.getClassLoader()
		                  .getResource("logging.properties")
		                  .getFile();
		      
		      System.setProperty("java.util.logging.config.file",path);
		      return Logger.getLogger(clsName.getName());
		     
	}		
}

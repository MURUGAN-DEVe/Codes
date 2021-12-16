package com.example.exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.logging.utils.LogggingUtility;

public class TestCustomException {

	public static void main(String[] args) {

		
		
		Logger logger=LogggingUtility.getLogger(TestCustomException.class);
		Employee ram=new Employee();
		ram.setEmployeeId(101);
		ram.setEmployeeName("Ram");
		ram.setDesignation("Tester");
		ram.setSalary(20000);
		
		try {
			Employee ramesh=new Employee(101,"Arun","tester",10000);
			logger.info(ram.toString());
		} catch (RangeCheckException e) {
			e.printStackTrace();
			logger.warning("warning");
		}
		
		Logger logger1 =LogggingUtility.getLogger(Application.class);
		FileHandler handler;
		try {
			handler=new FileHandler("mylogs.log",true);
			logger1.addHandler(handler);
			
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		Employee[] employee = {ram,ram,ram};
		EmployeeService svc=new EmployeeService();
	
		System.out.println(svc.calculateTotalSalary(employee));
		
	
	}

}

package com.example.demo;

import java.util.Scanner;

import com.example.demo.model.Employee;
import com.example.demo.model.Invoice;
import com.example.demo.service.EmployeeService;

public class Apllication {

	public static void main(String[] args) {
		//Using Wrapper class 
		int employeeId = Integer.parseInt(args[0]);
		String employeeName = args[1];
		String designation = args[2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the Name");
		String name =sc.next();
		System.out.println("Enter the Desgnation");
		String des=sc.next();
		System.out.println("Enter the salary");
		double sa=sc.nextDouble();
		sc.close();
		
		Double salary2 = Double.valueOf(10000);
		int intSalary = (int)(salary2.doubleValue());
		
		
		double salary = Double.parseDouble(args[3]);
		Employee arun =new Employee(id, name, des, sa);
		Employee wilson=new Employee(102, "Wilson", "IT team", 10000);
		Employee willy=new Employee(102, "Willy", "IT team", 10000);
		//calling Overload Method
		
		EmployeeService sev = new EmployeeService();
		System.out.println("Expected: 3300.0 => Actual: "+sev.calculateBonus(arun.getSalary()));
		System.out.println("Expected: 3300.0 => Actual: "+sev.calculateBonus(wilson));
		System.out.println("Expected: 4300.0 => Actual: "+sev.calculateBonus(salary2));
		sev.updateSalary(willy);
		System.out.println("Updated Salary: "+willy.getSalary());
		
		
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
		System.out.println(designation);
		System.out.println(intSalary);
		
		Invoice.showAll();
	}

}

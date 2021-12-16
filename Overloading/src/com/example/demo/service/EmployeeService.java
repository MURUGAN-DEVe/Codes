package com.example.demo.service;

import com.example.demo.model.*;
public class EmployeeService {

	// DRY Principal followed
	public double calculateBonus(Employee emp) {
		
		return calculateBonus(emp.getSalary());
	}
	//Overloaded Method
	
	public double calculateBonus(double salary) {
		
		return salary*0.33;
	}
	//Overload with AutoBoxing
	
	public double calculateBonus(Double salary) {
		return salary*0.33+1000;
		
	}
	public Employee updateSalary(Employee emp) {
		double update=emp.getSalary()+ 20000;
		emp.setSalary(update);
		return emp;
	}
}

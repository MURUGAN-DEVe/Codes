package com.training;

import com.training.emp.Employee;

public class EmployeeService {
	
	public double calculatebonus(Employee emp) {
		
		double bonus=(emp.getSalary())*(0.33);
		double total= emp.getSalary()+bonus;
		return total;
		
	}

}

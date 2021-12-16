package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
import com.example.demo.service.EmployeeService;

public class Apllication {

	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"Arun","Tester",10000);
		String[] skills= {"java","dotnet","AWS"};
		Manager man=new Manager(101,"Arun","Manager",50000,skills);
		System.out.println(emp);
		System.out.println(man.getEmployeeName()+man.getDesignation()+man.getSalary()+man.getEmployeeId());

        for(String a:man.getSkillSet()) 
		{
		System.out.println(a);
		}
        
        
		Employee[] employee= {emp,man};
		EmployeeService emsvc= new EmployeeService();
		emsvc.printEmployee(employee);

	}

}

package com.training;

import com.training.emp.Employee;
import com.training.hotel.Hotel;

public class MainApplication {

	public static void main(String[] args) {
		
		Customer cus = new Customer("Arun",25,"Arun@gmail.com");
		Employee emp = new Employee();
		Hotel ho = new Hotel();
		EmployeeService emps = new EmployeeService();
		
//		cus.setName("Arun");
//		cus.setAge(25);
//		cus.setEmail("Arun@gmail.com");
		
		System.out.println("Name: "+cus.getName());
		System.out.println("Age: "+cus.getAge());
		System.out.println("Email: "+cus.getEmail());
		System.out.println("------------------------------");
		
		emp.setId(101);
		emp.setName("Ellango");
		emp.setSalary(20000);
		emp.setPaid(true);
		
		System.out.println("Id:"+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Paid Status: "+emp.isPaid());
		System.out.println("Bonus: "+emps.calculatebonus(emp));
		System.out.println("------------------------------");
		
		ho.setName("Holiday INN");
		ho.setLocation("OMR road");
		ho.setEmployeeVacinated(true);
		
		System.out.println("Hotel Name: "+ho.getName());
		System.out.println("Location: "+ho.getLocation());
		System.out.println("Vacinated Status: "+ho.isEmployeeVacinated());
		System.out.println("------------------------------");
		

	}

}

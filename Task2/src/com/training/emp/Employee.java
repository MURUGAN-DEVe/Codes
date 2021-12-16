package com.training.emp;

public class Employee {
	
	private String name;
	private int Id;
	private double salary;
	private boolean isPaid;
	public Employee() {
		super();
		
	}
	
	public Employee(String name, int id, double salary, boolean isPaid) {
		super();
		this.name = name;
		Id = id;
		this.salary = salary;
		this.isPaid = isPaid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

}

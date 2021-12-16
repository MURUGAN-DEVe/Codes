package com.example.exception;

public class Employee {

	
	private int employeeId;
	private String employeeName;
	private String designation;
	private double salary;
	public Employee() {
		super();
		
	}
	
	public Employee(int employeeId, String employeeName, String designation, double salary) 
	throws RangeCheckException{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		if(salary<=0) {
			throw new RangeCheckException("salary should be Positive");
			
		}else {
			this.salary=salary;
		}
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<=0) {
			try {
				throw new RangeCheckException("salary should be Positive");
			} catch (RangeCheckException e) {
				e.printStackTrace();
			}
		}else {
		this.salary = salary;
		}
	}
	
    public String toString() {
		
		return this.employeeId+","+this.employeeName+","+this.designation+","+this.salary;
	}
	
}

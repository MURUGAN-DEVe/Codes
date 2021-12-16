package com.training.hotel;

public class Hotel {
	 private String name;
	 private String location;
	 private boolean employeeVacinated;
	public Hotel() {
		super();
		
	}
	public Hotel(String name, String location, boolean employeeVacinated) {
		super();
		this.name = name;
		this.location = location;
		this.employeeVacinated = employeeVacinated;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isEmployeeVacinated() {
		return employeeVacinated;
	}
	public void setEmployeeVacinated(boolean employeeVacinated) {
		this.employeeVacinated = employeeVacinated;
	}
	

}

package com.example.customer;

import com.example.task.InvalidEmailException;

public class Customeer {
	
	private int customerId;
	private String customerName;
	private String email;
	public Customeer() {
		super();
	}
	public Customeer(int customerId, String customerName, String email)
	throws InvalidEmailException{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		if(email.contains("@") && email.contains(".com") || email.contains(".org")|| email.contains(".in")) {
			this.email=email;
		}
		else
		{
			throw new InvalidEmailException("Enter the valid Email");
		}
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@") && email.contains(".com") || email.contains(".org")|| email.contains(".in")) {
			this.email=email;
		}
		else
		{
			try {
				throw new InvalidEmailException("Enter the valid Email");
			}catch(InvalidEmailException e) {
				e.printStackTrace();
			}
		}
	}
     public String toString() {
		
		return this.customerId+","+this.customerName+","+this.email;
	}
	

}

package com.example.sub;

import com.example.abs.BankAccount;

public class SavingsAccount extends BankAccount {
	
	 private double balance;
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}
	


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public double deposite(double amount) {
		
		if(amount >=100000) {
			System.out.println("you can deposite upto 100000");
			System.out.println(getBalance());
		}
		else {
			balance = balance+amount;
			setBalance(balance);
			System.out.println(getBalance());
		}
		
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		
        if(amount <5000) {
			
        	System.out.println("Minimum balance should be 5000");
        	 System.out.println(getBalance());
		}
    else {
    	balance = balance-amount;
    	System.out.println(getBalance());
    }
		return 0;
	}
	
	

}

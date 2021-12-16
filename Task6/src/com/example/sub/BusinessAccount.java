package com.example.sub;

import com.example.abs.BankAccount;

public class BusinessAccount extends BankAccount {

	private double balance;
	

	public BusinessAccount() {
		super();
		
	}
	

	public BusinessAccount(double balance) {
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
		
		if(amount >=1000000) {
			System.out.println("you can deposite upto 1000000");
			System.out.println(getBalance());
		}else {
			balance = balance+amount;
			setBalance(balance);
			System.out.println(getBalance());
		}
		

		return 0;
	}

	@Override
	public double withdraw(double amount) {
		
        if(amount <25000) {
        	System.out.println("Minimum balance should be 25000");
        	System.out.println(getBalance());
		}
        else {
        	balance = balance-amount;
        	System.out.println(getBalance());
        }

		return 0;
	}

}

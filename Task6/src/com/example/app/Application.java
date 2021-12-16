package com.example.app;

import java.util.Scanner;

import com.example.abs.BankAccount;
import com.example.sub.BusinessAccount;
import com.example.sub.SavingsAccount;

public class Application {

	public static void main(String[] args) {

		BankAccount sacc = new SavingsAccount(5000);
		BankAccount bacc = new BusinessAccount(25000);
	
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the CustomerType");
		String coustomerType = sc.next();
		System.out.println("Enter the TransactionType");
		String transactionType = sc.next();
		System.out.println("Enter the amount");
		double amount = sc.nextInt();

		if (transactionType.equals("deposite")) {
			if (coustomerType.equals("business")) {
				bacc.deposite(amount);
			} else {
				sacc.deposite(amount);
			}
		} else {
			if (coustomerType.equals("saving")) {
				
				sacc.withdraw(amount);
			} else {
				bacc.withdraw(amount);
			}

		}

		// bacc.deposite(10000000);
		// bacc.withdraw(5000);

	}

}

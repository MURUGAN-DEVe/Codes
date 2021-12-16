package com.example.mobile.application;

import com.example.mobile.Address;
import com.example.mobile.MobileBill;
import com.example.mobile.ServiceCalculation;

public class MobileApplication {

	public static void main(String[] args) {

		final String NAME="JIO";
		Address add= new Address(12, "Anna Nagar", "Coimbatore");
		MobileBill bill=new MobileBill("Arun", 12345, "paid", add);
		ServiceCalculation svc =new ServiceCalculation();
		System.out.println(NAME);
		
		System.out.println("Excepted=200 Actuall=>"+svc.planeName(bill));
		//svc.planeName(bill);
		


	}

}

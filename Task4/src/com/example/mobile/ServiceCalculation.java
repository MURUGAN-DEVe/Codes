package com.example.mobile;

public class ServiceCalculation {
	
	public String planeName(MobileBill mob) {
		
		switch(mob.getPlanName()) {
		case "prepaid":
			return "Your Bill Amount = 200";
		
		case "postpaid":
		return "Your Bill Amount = 300";
		default:
			return "Select a Vaild plan";
		}

		
		
	}

}

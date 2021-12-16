package com.example.bill.application;

import com.example.bill.Billable;
//import com.example.bill.Civil;
//import com.example.bill.Plumber;
import com.example.bill.Software;

public class Application {
	
	
	public static void main(String[] args) {
		
		Billable sft=new Software();
//		Billable cvl=new Civil();
//		Billable plm=new Plumber();
		
		//application[] app= {sft,cvl,plm};
		System.out.println(sft.calculate("soft"));


	}

}

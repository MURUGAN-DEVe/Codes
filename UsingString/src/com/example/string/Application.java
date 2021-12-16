package com.example.string;

public class Application {

	public static void main(String[] args) {

		String bestCity="chennai";
		String prefCity="chennai";
		
		System.out.println("using =="+ (bestCity==prefCity));
		System.out.println("using dot equals "+bestCity.equals(prefCity));
		
		String greatCity=prefCity;
		System.out.println("using =="+ (greatCity==prefCity));
		System.out.println("using dot equals "+greatCity.equals(prefCity));
		
		System.out.println("------------------Using Object--------------------");
		
		String bestCity1=new String("chennai");
		String prefCity1=new String("chennai");
		
		System.out.println("using =="+ (bestCity1==prefCity1));
		System.out.println("using dot equals "+bestCity1.equals(prefCity1));
		
		StringUtility str=new StringUtility();
		System.out.println(str.getSubstring("hello"));
		System.out.println(str.checkContains("Hi Welcome"));
		System.out.println(str.checkPositionofChar(prefCity1));
		System.out.println(str.jionTwoString("I Love ", "India"));
		System.out.println(str.replaceString("helllo"));
		System.out.println(str.Split("chennai chennai"));
		System.out.println(str.trim("         chennai chennai"));
		System.out.println(str.splitReg("This method has two variants and splits ", 3));
	}

}

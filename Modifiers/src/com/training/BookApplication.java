package com.training;

public class BookApplication {

	public static void main(String[] args) {
		
		
		Book bk=new Book();
		
//		bk.setAuthorname("Jack");
//		bk.setBookid(101);
//		bk.setPrice(500);
		
		System.out.println(bk.getAuthorname());
		System.out.println(bk.getBookid());
		System.out.println(bk.getPrice());
		
		Book effjava = new Book("Arun",102,500);
		System.out.println(effjava.getAuthorname());
		System.out.println(effjava.getBookid());
		System.out.println(effjava.getPrice());
		

	}

}

package com.example.book.application;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import com.example.book.Book;
import com.example.book.BookService;

public class BookApllication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Book ID:");
		int a=sc.nextInt();
		System.out.println("Book Name:");
		String bname=sc.next();
		System.out.println("Author Name:");
		String name=sc.next();
		System.out.println("Book Price:");
		double dprice=sc.nextDouble();
		System.out.println("Book Type:");
		String type=sc.next();
		
		Book bk=new Book(a,bname,name,dprice,type);
		BookService bsvc=new BookService();
		
	    System.out.println("Discount using Object");
		bsvc.calculateDiscount(bk);
		System.out.println(bk.getPrice());
		System.out.println("Discount using Atribute");
		System.out.println(bsvc.calculateDiscount(bk,type));
		
				
				
		
		


	}

}

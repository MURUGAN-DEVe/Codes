package com.training;

public class Book {
	
	private String authorname;
	private int bookid;
	private double price;
	
	public Book() {
		// super(); Either super or this but never both => because super/this should be
		//the first line
		this("watson",103,550);
		
		
	}
	
	public Book(String authorname, int bookid, double price) {
		super();
		//this.authorname refers to the field private string author name
		//authorname refers to the method argument authorname
		this.authorname = authorname;
		this.bookid = bookid;
		this.price = price;
	}
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

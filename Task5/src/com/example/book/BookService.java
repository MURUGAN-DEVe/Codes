package com.example.book;

public class BookService {
	
	public double calculateDiscount(Book bk,String customerType) 
	{
		
		switch(customerType)
		{
		case "corporate":
			if(bk.getPrice()<=500)
			{
				double amt=( bk.getPrice()-(bk.getPrice()*0.07));
				return amt;
			}
			else if(bk.getPrice()>500 && bk.getPrice()<=1000) {
				
				double amt=bk.getPrice()-(bk.getPrice()*0.12);
				return amt;
			}
			else {
				double amt=bk.getPrice()-(bk.getPrice()*0.15);
				return amt;
			}
		
		case "retail":
			if(bk.getPrice()<=500)
			{
				double amt= bk.getPrice()-(bk.getPrice()*0.05);
				return amt;
			}
			else if(bk.getPrice()>500 && bk.getPrice()<=1000) {
				
				double amt=bk.getPrice()-(bk.getPrice()*0.1);
				return amt;
			}
			else {
				double amt=bk.getPrice()-(bk.getPrice()*0.12);
				return amt;
			}
		default :
			System.out.println("Inavlid Type");
			
		}

		return 0;
		
		
	}
	
	public Book calculateDiscount(Book bk) {
		
		if(bk.getPrice()<=500)
		{
			double amt= bk.getPrice()-(bk.getPrice()*0.05);
			bk.setPrice(amt);
			return bk;
		}
		else if(bk.getPrice()>500 && bk.getPrice()<=1000) {
			
			double amt=bk.getPrice()-(bk.getPrice()*0.1);
			bk.setPrice(amt);
			return bk;
		}
		else {
			double amt=bk.getPrice()-(bk.getPrice()*0.12);
			bk.setPrice(amt);
			return bk;
		}

		
	}

}

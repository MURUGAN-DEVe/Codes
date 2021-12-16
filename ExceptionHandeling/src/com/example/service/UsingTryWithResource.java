package com.example.service;
import java.util.*;

public class UsingTryWithResource {
	public static void main(String[] args) {
		
		
		
		try(Scanner sc=new Scanner(System.in);)
		{
		System.out.println("Enter the name");
		String name=sc.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

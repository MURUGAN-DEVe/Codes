package com.example.application;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.example.collection.Student;

public class UsingLinkedList {

	public static void main(String[] args) {
		
		Student ten=new Student(104,"Tendulkar",90);
		Student martin=new Student(105,"Martin",10);
		Student wilson=new Student(106,"Wilson",100);
		
		LinkedList<Student> studList=new LinkedList<>();
		studList.add(ten);
		studList.add(wilson);
		studList.add(martin);
		
		//Iterator<Student>itr=studList.iterator();
		
		//ListIterator can iterate on both directions.
		ListIterator<Student>itr=studList.listIterator();
		
		System.out.println("Forward Iteration");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("BackWard Iteration");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}

package com.example.application;

import java.util.*;

import com.example.collection.Student;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Student> studList=new ArrayList<>();
		Student ram=new Student(101,"Arun",50);
		Student dravid=new Student(102,"Dravid",60);
		Student varun=new Student(103,"Varun",70);
		Student ten=new Student(104,"Tendulkar",90);
		Student martin=new Student(105,"Martin",10);
		Student wilson=new Student(106,"Wilson",100);
		
		//String rakesh=new String("Rakesh");
		studList.add(ram);
		studList.add(dravid);
		studList.add(varun);
		studList.add(ten);
		studList.add(martin);
		studList.add(wilson);
		
		
		//studList.add(rakesh);
		//cannot add other than student object.
		
		
		for(Student i:studList)
		{
		System.out.println(i);
		
		}
		//Down Casting Object[] to student[]
		Object[] List= studList.toArray();
		for(Object obj:List) {
			
			Student stud=(Student)obj;
			System.out.println(stud.getStudentName());
		}
		
		

	}

}

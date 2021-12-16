package com.example.application;
import java.util.*;
import com.example.collection.Student;

public class UsingHashSet {
	
public static void print(Collection<Student> object) {
		
		for(Student eachStudent:object) {
			System.out.println(eachStudent);
		}
		
	}


	public static void main(String[] args) {
		
		
		Student ram=new Student(101,"Arun",50);
		Student dravid=new Student(103,"Dravid",60);
		Student varun=new Student(102,"Varun",70);
		Student varunSenior=new Student(102,"Varun",70);
		
		HashSet<Student>hashSet=new HashSet<>();
		hashSet.add(varun);
		hashSet.add(dravid);
		hashSet.add(ram);
		boolean isAdded=hashSet.add(varunSenior);
		System.out.println(isAdded);
		 print(hashSet);
	}

}

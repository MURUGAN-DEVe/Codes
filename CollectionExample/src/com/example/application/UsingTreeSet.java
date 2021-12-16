package com.example.application;
import java.util.*;

import com.example.collection.Student;
public class UsingTreeSet {
	
	public static void print(Collection<Student> object) {
		
		for(Student eachStudent:object) {
			System.out.println(eachStudent);
		}
		
	}

	public static void main(String[] args) {
		
		Student ram=new Student(101,"Arun",50);
		Student dravid=new Student(103,"Dravid",60);
		Student varun=new Student(102,"Varun",70);
		
		TreeSet<Student>treeset=new TreeSet<Student>();
		treeset.add(ram);
		treeset.add(dravid);
		treeset.add(varun);
		
		print(treeset);

	}

}

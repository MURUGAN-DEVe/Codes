package com.example.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import javax.management.RuntimeErrorException;

import com.example.collection.Student;
import com.example.compare.MarksComparator;
import com.example.compare.StudentComparator;
import com.example.iface.CrudRepository;
import com.example.iface.StudentRepository;
import com.example.service.StudentService;

public class CrudApplication {

	public static void main(String[] args) {
		
		Student ram=new Student(101,"Arun",50);
		Student dravid=new Student(102,"Dravid",60);
		Student varun=new Student(103,"Varun",70);
		Student ten=new Student(104,"Tendulkar",90);
		Student martin=new Student(105,"Martin",10);
		Student wilson=new Student(106,"Wilson",100);
		
		StudentRepository studser=new StudentService();
		//StudentRepository repo=new StudentService();
		studser.add(varun);
		studser.add(dravid);
		studser.add(wilson);
		studser.add(martin);
		studser.add(ten);
		studser.add(ram);
		
		
		List<Student>list=studser.findAll();
		//Collections.sort(list);
		//Collections.sort(list,new StudentComparator());
		
		Iterator<Student>itr=studser.findAll().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("______________________________");
		
		boolean result=studser.remove(wilson);
		
		if(result) {
			System.out.println(wilson+"Deleted");
		}else {
			throw new RuntimeException("Element Not Found");
		}
		
//		for(Student eachStudent:studser.findAll()) {
//			
//			System.out.println(eachStudent);
//		}
		System.out.println("______________________________");
		//Student update=studser.updateMark(martin,100);
		System.out.println(studser.update(martin,100));
		
		List<Student>top3=studser.getTopThree();
		for(Student top:top3) {
			System.out.println(top);
		}
		

	}

}

package com.example.application;
import java.util.*;

import com.example.collection.Student;
public class UsingHashMap {

	
	public static void main(String[] args) {

		
		Student ram=new Student(101,"Arun",50);
		Student dravid=new Student(102,"Dravid",60);
		Student varun=new Student(103,"Varun",70);
		Student varunSenior=new Student(104,"VarunSenior",70);
		
		HashMap<Integer,Student>map=new HashMap<>();
		
		//AutoBoxing allows primitive 100 to be converted to object.
		
		System.out.println(map.put(100, ram));
		map.put(101, dravid);
		map.put(103, varun);
		System.out.println(map.put(103, varunSenior));
		
		//It will return the new entry ,not the old one.It Replace the old one.
		
		System.out.println("From Map "+map.get(103));
		
		Set<Map.Entry<Integer, Student>>setView=map.entrySet();
		
		Iterator<Map.Entry<Integer, Student>>itr =setView.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Student>eachElement=itr.next();
			System.out.println(eachElement.getKey());
			System.out.println(eachElement.getValue());
		}
		
		Set<Map.Entry<Integer, Student>>studSet=map.entrySet();
		for(Map.Entry<Integer, Student>eachElement:studSet) {
			
			System.out.println("key : "+eachElement.getKey());
			System.out.println("Value : "+eachElement.getValue());
		}
	}

}

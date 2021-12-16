package com.example.application;

import java.util.Hashtable;
import java.util.TreeMap;

import com.example.collection.Student;

public class UsingHashTable {

	public static void main(String[] args) {
		
		Student ten=new Student(104,"Tendulkar",90);
		Student martin=new Student(105,"Martin",10);
		Student wilson=new Student(106,"Wilson",100);
		
		Hashtable<Integer, Student>hashTable=new Hashtable<>();
		
		hashTable.put(101, ten);
		hashTable.put(102, martin);
		hashTable.put(103, wilson);
		

	}

}

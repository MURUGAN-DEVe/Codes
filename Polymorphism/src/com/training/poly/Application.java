package com.training.poly;

import com.training.pro.Proffessor;
import com.training.pro.Student;

public class Application {
	public static void printResult(Conditional condition) {
		System.out.println(condition.test());
	}

	public static void main(String[] args) {
		Student std=new Student(101,50);
		Proffessor pro=new Proffessor(101,"mca");
		
		printResult(std);
		printResult(pro);


	}

}

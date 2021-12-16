package com.example.compare;

import java.util.Comparator;

import com.example.collection.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

}

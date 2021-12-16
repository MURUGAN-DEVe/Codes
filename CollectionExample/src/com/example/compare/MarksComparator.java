package com.example.compare;

import java.util.Comparator;

import com.example.collection.Student;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarkScored()<o2.getMarkScored())
			return 1;
		if(o1.getMarkScored()>o2.getMarkScored())
			return -1;
		return 0;
	}
		

}

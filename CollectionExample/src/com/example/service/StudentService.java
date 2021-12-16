package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.collection.Student;
import com.example.compare.MarksComparator;
import com.example.iface.CrudRepository;
import com.example.iface.StudentRepository;

public class StudentService implements StudentRepository<Student> {

	private ArrayList<Student> studList;

	public StudentService() {
		super();
		studList=new ArrayList();
		}

	@Override
	public boolean add(Student object) {
		
		return studList.add(object);
	}

	@Override
	public List<Student> findAll() {
		return this.studList;
	}

	@Override
	public  Student update(Student object, double revisedValue) {
		int pos=studList.indexOf(object);
		Student foundStudent=studList.get(pos);
		foundStudent.setMarkScored(revisedValue);
		return studList.set(pos, foundStudent);
	
			
	}
	
	@Override
	public boolean remove(Student object) {
		return studList.remove(object);
	}

	@Override
	public List<Student> getTopThree() {
		
		Collections.sort(studList, new MarksComparator());
		ArrayList<Student>top3=new ArrayList();
		for(int i=0;i<=2;i++)
		{
			top3.add(studList.get(i));
		}
		return top3;
		
		
	}

}

package com.example.iface;

import java.util.List;

import com.example.collection.Student;

public interface StudentRepository<T> extends CrudRepository<T> {
	
	List<Student>getTopThree();

}

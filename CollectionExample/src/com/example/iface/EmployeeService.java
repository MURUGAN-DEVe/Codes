package com.example.iface;

import java.util.List;

import com.example.collection.Employee;
import com.example.collection.Student;

public class EmployeeService implements CrudRepository<Employee> {

	@Override
	public boolean add(Employee object) {
		return false;
	}

	@Override
	public List<Employee> findAll() {
		return null;
	}

	@Override
	public Employee update(Employee object, double revisedvalue) {
		return null;
	}

	@Override
	public boolean remove(Employee object) {
		return false;
	}

}

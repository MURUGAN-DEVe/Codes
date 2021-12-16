package com.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.example.classes.Doctor;

import com.example.iface.CrudOperation;

public class ServiceClass implements CrudOperation<Doctor> {

	HashSet<Doctor>doctor=new HashSet<>();
	

	@Override
	public boolean add(Doctor Object) {
		return doctor.add(Object);
	}

	@Override
	public Collection<Doctor> findAll() {
		return this.doctor;
	}

	@Override
	public Doctor update(Doctor object, String value)
	{
		boolean result=doctor.remove(object);
		object.setDesignation(value);
		doctor.add(object);
		return object;
		

	}
		

	@Override
	public boolean delete(Doctor Object) {
		return doctor.remove(Object);
	}
	
	
	@Override
	public String toString() {
		return "ServiceClass [doctor=" + doctor + "]";
	}
	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
	
	

}

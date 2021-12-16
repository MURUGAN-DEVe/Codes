package com.example.service;

import java.util.List;

import com.example.collection.Hotel;
import com.example.collection.Student;
import com.example.iface.CrudRepository;

public class HotelService implements CrudRepository<Hotel> {

	@Override
	public boolean add(Hotel object) {
		return false;
	}

	@Override
	public List<Hotel> findAll() {
		return null;
	}

	@Override
	public Hotel update(Hotel object, double reviseValue) {
		return null;
	}

	@Override
	public boolean remove(Hotel object) {
		return false;
	}

}

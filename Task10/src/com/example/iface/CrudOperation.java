package com.example.iface;

import java.util.Collection;
import java.util.List;

public interface CrudOperation<T> {
	
	public boolean add(T Object);
	public Collection<T> findAll();
	public T update(T object,String value);
	public boolean delete(T Object);


}

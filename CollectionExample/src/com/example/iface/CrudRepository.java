package com.example.iface;
import java.util.List;
import com.example.collection.Student;

public interface CrudRepository<T> {
	
	public boolean add(T object);//create
	public List <T>findAll();//Read
	public T update(T object,double revisedValue);//update
	public boolean remove(T object)//delete
;
}

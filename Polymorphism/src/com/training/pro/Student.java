package com.training.pro;

import com.training.poly.Conditional;

public class Student implements Conditional {
	
	private int id;
	private double mark;

	public Student(int id, double mark) {
		super();
		this.id = id;
		this.mark = mark;
	}

	@Override
	public boolean test() {

		return this.mark>70;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	

}

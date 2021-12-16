package com.training.pro;

import com.training.poly.Conditional;

public class Proffessor implements Conditional {
	
	private int id;
	private String qualification;

	@Override
	public boolean test() {
		return this.qualification.equalsIgnoreCase("mca");
	}
	
	public Proffessor(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}

	public Proffessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	

}

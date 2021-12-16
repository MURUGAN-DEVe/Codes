package com.example.bill;

public class Software implements Billable {
	
	
	private  String qualification;

	public Software(String qualification) {
		super();
		this.qualification = qualification;
	}

	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public double calculate(String qualification) {
		
		if(this.qualification.equals("soft")) {
			
			return 40000;
		}
		return 0;
		
	}

}

package com.example.exception;

public class EmployeeService {

	public double calculateTotalSalary(Employee[] empList)
	{
		

		double total = 0;
		if(empList.length<=2 ||empList.length>=5) 
		{	
			try {
				throw new  RangeCheckException("Length should be greaterthan 2 or should be less than 5");
			}
		catch(RangeCheckException e) {
			e.printStackTrace();
		}
		}
			else {
				for(Employee i:empList) {
					total=total+i.getSalary();
					//System.out.println(i);
				}
			}
		
		return total;
	}
		
}

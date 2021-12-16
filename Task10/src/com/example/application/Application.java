package com.example.application;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.example.classes.Doctor;
import com.example.classes.Patient;
import com.example.classes.Staff;
import com.example.iface.CrudOperation;
import com.example.service.ServiceClass;

public class Application {
	
	public static void main(String[] args) {
		
		HashSet<Patient>patient=new HashSet<>();
		HashMap<String, Staff>staff=new HashMap<>();
		
		Patient arun=new Patient(1,"Arun","coimbatore","arun@gamil.com");
		Patient wilson=new Patient(2,"wilson","coimbatore","wilson@gamil.com");
		Patient jaya=new Patient(3,"Jaya","coimbatore","jk@gamil.com");
		patient.add(jaya);
		patient.add(wilson);
		patient.add(arun);
		
		Staff vikram=new Staff(1,"Vikram", "chennai");
		Staff vicky=new Staff(2,"vicky", "chennai");
		Staff suresh=new Staff(3,"Suresh", "chennai");
		staff.put("wardboy", vikram);
		staff.put("ecg", vicky);
		staff.put("xray", suresh);
		
		Doctor vasanthan=new Doctor(101, "Vasanthan", "M.B.B.S", "Coimbatore",patient,staff);
		Doctor saran=new Doctor(102, "Saran", "SkinCare", "Coimbatore",patient,staff);
		CrudOperation operation=new ServiceClass();
		operation.add(vasanthan);
		operation.add(saran);
		
		Iterator<Doctor>itr=operation.findAll().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(operation.update(saran, "Chennai"));
		System.out.println("--------------------------------------------------");
		
		operation.delete(saran);
		Iterator<Doctor>itr1=operation.findAll().iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println(operation.update(saran, "Dentist"));
	
		
		
		
		
		
	}

}

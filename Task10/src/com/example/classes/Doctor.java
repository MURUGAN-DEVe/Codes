package com.example.classes;

import java.util.*;

public class Doctor  {
	
	
	private int id;
	private String doctorName;
	private String designation;
	private String locatin;
	private HashSet<Patient> patientSet;
	private HashMap<String, Staff>staffMap;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String doctorName, String designation, String locatin, HashSet<Patient> patientSet,
			HashMap<String, Staff> staffMap) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.designation = designation;
		this.locatin = locatin;
		this.patientSet = patientSet;
		this.staffMap = staffMap;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocatin() {
		return locatin;
	}
	public void setLocatin(String locatin) {
		this.locatin = locatin;
	}
	public HashSet<Patient> getPatientSet() {
		return patientSet;
	}
	public void setPatientSet(HashSet<Patient> patientSet) {
		this.patientSet = patientSet;
	}
	public HashMap<String, Staff> getStaffMap() {
		return staffMap;
	}
	public void setStaffMap(HashMap<String, Staff> staffMap) {
		this.staffMap = staffMap;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", designation=" + designation +
				", locatin="+ locatin + ", patientSet=" + patientSet +
				", staffMap=" + staffMap + "]";
	}
	
}

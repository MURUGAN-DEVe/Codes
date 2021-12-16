package com.example.classes;

public class Staff {
	
	private int id;
	private String staffName;
	private String address;
	public Staff(int id, String staffName, String address) {
		super();
		this.id = id;
		this.staffName = staffName;
		this.address = address;
	}
	public Staff() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffName=" + staffName + ", address=" + address + "]";
	}

}

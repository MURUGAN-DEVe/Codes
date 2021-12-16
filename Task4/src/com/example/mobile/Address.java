package com.example.mobile;

public class Address {
	
	private int doorNo;
	private String streetName;
	private String cityName;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNo, String streetName, String cityName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

}

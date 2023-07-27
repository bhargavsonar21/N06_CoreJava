package org.tns.singleinheritance;
//Base class
public class Citizen 
{
	//Private data member
	private int pincode;
	private String area;
	private long aadharNo;
	
	//Getter and setters method
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "Citigen [pincode=" + pincode + ", area=" + area + ", aadharNo=" + aadharNo + ", city=" + city + "]";
	}
	
	//default constructor
	public Citizen() {
			System.out.println("THis is Citizen Parent class");
	}
	
	//Parametrized Constructor
	public Citizen(int pincode, String area, long aadharNo, String city) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.aadharNo = aadharNo;
		this.city = city;
	}
	
	
	
	
	
	
	

}

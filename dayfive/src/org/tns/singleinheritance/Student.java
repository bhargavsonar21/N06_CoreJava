package org.tns.singleinheritance;

public class Student extends Citizen {
	private int rollno;
	private String collegeName;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	//Parameterized Constructor
	public Student(int pincode, String area, long aadharNo, String city,
			int rollno,String collegeName) {
		super(pincode, area, aadharNo, city);
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.collegeName = collegeName;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}

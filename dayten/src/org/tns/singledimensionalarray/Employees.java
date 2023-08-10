package org.tns.singledimensionalarray;
//Program to demonstrate on Arrays of objects
public class Employees {
	
	private int Id;
	private String name;
	private double salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employees(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

}

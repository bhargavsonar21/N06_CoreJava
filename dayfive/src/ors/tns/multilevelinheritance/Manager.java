package ors.tns.multilevelinheritance;

public class Manager {
	private String deptaname;
	private String name;
	private int empID;
	
	//Getters and Setters Method
	public String getDeptaname() {
		return deptaname;
	}
	public void setDeptaname(String deptaname) {
		this.deptaname = deptaname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	@Override
	public String toString() {
		return "Manager [deptaname=" + deptaname + ", name=" + name + ", empID=" + empID + "]";
	}
	
	//Paramerized Constructor
	public Manager(String deptaname, String name, int empID) {
		super();
		this.deptaname = deptaname;
		this.name = name;
		this.empID = empID;
	}
	
	
	

}

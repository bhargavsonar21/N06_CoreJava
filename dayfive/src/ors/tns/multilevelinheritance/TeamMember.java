package ors.tns.multilevelinheritance;

public class TeamMember extends TeamLead {
	private int size;
	private int duration;
	
	//Getters and Setters Method
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public TeamMember(String deptaname, String name, int empID, String leadname, String projectname,
			int size,int duration) {
		super(deptaname, name, empID, leadname, projectname);
		this.size = size;
		this.duration=duration;
	}
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}

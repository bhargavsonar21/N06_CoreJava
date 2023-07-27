package ors.tns.multilevelinheritance;

public class TeamLead extends Manager {
	
	private String leadname;
	private String projectname;
	
	
	//Getters and setters
	public String getLeadname() {
		return leadname;
	}

	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}



	public TeamLead(String deptaname, String name, int empID,
			String leadname,String projectname) {
		super(deptaname, name, empID);
		this.leadname = leadname;
		this.projectname = projectname;
	}

	@Override
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", projectname=" + projectname + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}

package org.tnsif.multilevelInheritance;

public class TeamLead extends Manager {

	//private data members
	private String Leadname;
	private String ProjectName;
	
	//getter and setter
	public String getLeadname() {
		return Leadname;
	}
	public void setLeadname(String leadname) {
		Leadname = leadname;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	
	public TeamLead(String deptName,String name,int empId,String LeadName,String ProjectName )
	{
		super(deptName,name,empId);
		this.Leadname=LeadName;
		this.ProjectName=ProjectName;
	}
	@Override
	public String toString() {
		return "TeamLead [Leadname=" + Leadname + ", ProjectName=" + ProjectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

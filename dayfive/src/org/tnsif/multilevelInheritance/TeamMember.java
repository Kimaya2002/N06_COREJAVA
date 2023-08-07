package org.tnsif.multilevelInheritance;

public class TeamMember extends TeamLead {

	//private data members
	private int size;
	private int duration;
	
	//getter and setters
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
	public TeamMember(String deptName, int empId,int String LeadName,String projectName,int size,int duration ) {
		super(deptName, name, empId, LeadName, ProjectName);
		this.size=size;
		this.duration=duration;
	}
	
	//toString() mrthod
	
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

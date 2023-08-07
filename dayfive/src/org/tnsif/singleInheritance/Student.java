package org.tnsif.singleInheritance;
//child class
public class Student extends Citizen{
	//private data members
	private int rollno;
	private String collageName;
	
	//getter and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	public Student(String city, int pincode, String areas, long adharno,int rollno,String collegeName) {
		super(city, pincode, areas, adharno);
		this.rollno=rollno;
		this.collageName=collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collageName=" + collageName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}

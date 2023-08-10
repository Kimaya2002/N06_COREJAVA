package org.tnsif.SingleDimensionalArray;
//program to demonstrate on objects
public class Employyes {

	
	private int ID;
	private String Name;
	private double salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employyes(int iD, String name, double salary) {
		super();
		ID = iD;
		Name = name;
		this.salary = salary;
	}
	
}

package org.tnsif.multilevelInheritance;
//parent class
public class Manager {

	
	private String deptNmae;
	private String name;
	private int empId;
	
	//getter and setters
	public String getDeptNmae() {
		return deptNmae;
	}
	public void setDeptNmae(String deptNmae) {
		this.deptNmae = deptNmae;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	@Override
	public String toString() {
		return "Manager [deptNmae=" + deptNmae + ", name=" + name + ", empId=" + empId + "]";
	}
	
	//parameterized constructor
	public Manager(String deptNmae, String name, int empId) {
		super();
		this.deptNmae = deptNmae;
		this.name = name;
		this.empId = empId;
	}
	
	
}

package org.tnsif.ststickeyword;
class Employee{
	private int empId;
	private String name;
	private static String companyName="TNSIF";
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	//method
	public void display()
	{
		System.out.println("emp Id : "+this.getEmpId()+" "+"Emp Name:"+this.getName()+" "+"Compony Name:"+this.getCompanyName());
	}

}
//driver class

public class StaticVariable {

	public static void main(String[] args) {
			Employee e=new Employee();
			e.setEmpId(01);
			e.setName("Kimaya");
			e.display();
			Employee e1=new Employee();
			e.setEmpId(02);
			e.setName("Maya");
			e.display();

	}

}

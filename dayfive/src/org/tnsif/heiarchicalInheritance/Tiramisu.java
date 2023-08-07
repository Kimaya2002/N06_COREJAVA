package org.tnsif.heiarchicalInheritance;
//child class
public class Tiramisu extends Android{
	

	//private data members
	private int version;
	
	//getters and setters method
	

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	//toString() method

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	//parameterized constructor
	public Tiramisu(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
	}


	
	
}

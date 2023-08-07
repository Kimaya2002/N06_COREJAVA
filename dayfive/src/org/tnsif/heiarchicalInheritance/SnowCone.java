package org.tnsif.heiarchicalInheritance;
//child class2
public class SnowCone extends  Android{
	//private data members

	private int version;
	
	//getters and setters method

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	//parameterized constructors 
	
	public SnowCone(String brand, String slotType) {
		super(brand, slotType);
		// TODO Auto-generated constructor stub
	}

	
}

package org.tnsif.singleInheritance;
//base class
public class Citizen {

		//private data members
	private String city;
	private int pincode;
	private String areas;
	private long adharno;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", areas=" + areas + ", adharno=" + adharno + "]";
	}
	public Citizen() {
		System.out.println("Citizen-parent class");
		
	}
	//parameterized constructor
	public Citizen(String city, int pincode, String areas, long adharno) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.areas = areas;
		this.adharno = adharno;
	}
	
}

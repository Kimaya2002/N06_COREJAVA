package org.tnsif.instanceofdemo;
class RBI
{
	 String ifsccode="RBIS0NGPA01";
}
class SBI extends RBI
{
	public SBI() {
	
	 super. ifsccode="RBIS0NGPA01";
	 String ifsccode="SBIN00002161";
	 System.out.println(ifsccode);
	 /*if parent class and child class variable name are same,
	  * in such case use super.variablename to access that
	  * variable of parent class inside the child class
	  */
	 System.out.println(super.ifsccode);

	}
}
//program to demonstrate on instance operator
public class InstanceOfDemo {

	public static void main(String[] args) {
		
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	
	}

}

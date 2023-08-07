package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccType("Saving Account");
		h.setAccountNo(678990000L);
		h.setAtmCardNo(6758686879L);
		h.setPinNo(1012);
		
		//below line will call to toString() mrthod
		System.out.println(h);

	}
}

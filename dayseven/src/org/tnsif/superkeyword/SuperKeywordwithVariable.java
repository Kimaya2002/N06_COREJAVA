package org.tnsif.superkeyword;
//program to demonstarate on super keyword with variable
class Building
{
	int floors=23;
	String name="Anand-Astha";
	
}
class Flat extends Building
{
	String name="Kimaya Sonawane";
	
	void print()
	{
		/*if parent class and child class variable name are same,
		 * and if you want to access parent class variable inside child class,use super.variablename
		 */
		System.out.println(super.name);
		System.out.println(name);

	}

}
public class SuperKeywordwithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		//System.out.println(f.name);
		f.print();

	}

}

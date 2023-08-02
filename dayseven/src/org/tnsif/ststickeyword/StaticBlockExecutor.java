//program to demonstrate on 
package org.tnsif.ststickeyword;
public class StaticBlockExecutor {

	String str;
	static float salary;
	/*static block is used to initialize static variable
	 * and we cant initialize any non-static variable inside
	 * the static block
	 */
	static {
		salary=567890.89f;
		//str="BKC";
		
	}
	static void print()
	{
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		print();

	}

}

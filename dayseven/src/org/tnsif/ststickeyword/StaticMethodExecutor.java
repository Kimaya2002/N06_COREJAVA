//program to demonstrate on 
package org.tnsif.ststickeyword;
public class StaticMethodExecutor {

	String str="BKC";
	static float percentage=78.9f;
	//static method
	/*if any method outside then main function and if you want to
	 * access that method inside the main function,make it
	 * as static
	 */
	static void displayScore(int score)
	{
		System.out.println(percentage);
		/*we cant use non-static variable inside static method*/
		//System.out.println(str);
		System.out.println("Score is: "+score);	
		}
	public static void main(String[] args) {
		displayScore(56);

	}

}

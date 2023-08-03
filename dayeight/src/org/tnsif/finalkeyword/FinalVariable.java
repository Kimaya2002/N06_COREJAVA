//program to demonstrate on final variable
package org.tnsif.finalkeyword;
public class FinalVariable {

	/*final variable must be initialize during declaration*/
	//final int x;
	
	final float SALARY=67000.45f;
	
	void print()
	{
		/*we cant change the value of variable*/
		//SALARY=89000.56f;
		System.out.println("Salary is: "+SALARY);
	}
}

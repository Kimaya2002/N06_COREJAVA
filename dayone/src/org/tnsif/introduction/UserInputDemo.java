//program to demonstarte on User-input value
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string : ");
		String str1=s.nextLine();
		System.out.println("String is: "+str1);
		s.close();
	}

}

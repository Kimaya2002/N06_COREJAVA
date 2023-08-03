//program to demonstate switch case
package org.tnsif.dicisionmaking;

import java.util.Scanner;

public class SwitchCaseExecuter {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song number :");
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("love me like you do");
			break;
			
		case 2:
			System.out.println("Taki Taki");
			break;

		case 3:
			System.out.println("Jai shree Ram");
			break;
		}
		
		
	}

}

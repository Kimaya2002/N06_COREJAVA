package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopExecuter {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			System.out.print("*");

		}
		for(int i=1;i<=n;i++)
		{
		System.out.println();
		}

	}
	
}

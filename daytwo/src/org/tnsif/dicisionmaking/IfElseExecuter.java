package org.tnsif.dicisionmaking;
import java.util.Scanner;

public class IfElseExecuter {
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
	int age=s.nextInt();
	int weight=s.nextInt();
	if(age>18 && weight>50)
	{
		System.out.println("eligible for donate blood");
		
	}
	else
	{
		System.out.println("not eligible");
	}
	}
}

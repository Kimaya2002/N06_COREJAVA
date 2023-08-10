package org.tnsif.customexception;
//program to demonstrate on custom exception
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String userid=s.nextLine();
			String password=s.nextLine();
			try {
				if(userid.equals("kimaya@tnsif.org")&&
					password.equals("pass@123"))
				{
					System.out.println("crendential are matched !!");
				}
				else
				{
					throw new LoginCredentials("Invalid Credentials!!");
				}
			}
			catch(LoginCredentials e)
				{
					System.out.println("Exception handled"+e);
				}
			}

}

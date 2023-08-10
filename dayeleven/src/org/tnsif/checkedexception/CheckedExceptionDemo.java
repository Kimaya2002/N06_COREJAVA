package org.tnsif.checkedexception;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Downloads\\Hello.txt");
		System.out.println("file is exists");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled"+e);
		}
	}

}

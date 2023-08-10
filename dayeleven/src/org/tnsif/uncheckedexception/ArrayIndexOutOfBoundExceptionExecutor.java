package org.tnsif.uncheckedexception;
//program to demonstrate on ArrayIndexOutOfBoundException
public class ArrayIndexOutOfBoundExceptionExecutor {
	
	 static void display(int arr[])
	 {
		 try {
		 System.out.println(arr[3]);
		 
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("Exception handled:"+e);
	 }
	 finally
	 {
		 System.out.println("finally block is always executed");

	 }
	 System.out.println("Any statement out of block is always"+"executed");
}

	public static void main(String[] args) {
		int arr[]= {12,6,78};
		display(arr);
	}

}

package org.tnsif.uncheckedexception;
//program to demonstrate finally block is not executed
public class FinallyBlockNotExecutedExecutor {

		 static void display(int arr[])
		 {
			 try {
			 System.out.println(arr[3]);
			 System.exit(0);
			 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Exception handled:"+e);
			 /*if try and catch block contain a System.exit(0);
			  * after the exception code line,then finally  block
			  * does not execute
			  */
			// System.exit(0);
		 }
		 finally
		 {
			 /*when finally block contains an exception code,that
			  * finally block does not executed
			  */
			 System.out.println(13/0);
			 System.out.println("finally block is always executed");

		 }
		 System.out.println("Any statement out of block is always"+"executed");
	}

		public static void main(String[] args) {
			int arr[]= {12,6,78};
			display(arr);
		}

	


	}



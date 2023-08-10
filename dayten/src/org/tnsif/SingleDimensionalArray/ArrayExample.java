package org.tnsif.SingleDimensionalArray;
//program to demonstrate on ID aaray using compile time input

public class ArrayExample {

	public static void main(String[] args) {
		//array initialization at the compile time
		int arr[]= {66,33,22,5,1};
		System.out.print(arr[1]);
		System.out.print("Array elements are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}

}

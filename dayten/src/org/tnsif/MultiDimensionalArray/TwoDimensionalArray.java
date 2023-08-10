package org.tnsif.MultiDimensionalArray;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//2D array Declaration
		int arr[][]=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		//printing an array elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
				System.out.println();
		}

	}

}

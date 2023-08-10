package org.tnsif.SingleDimensionalArray;

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		Employyes arr[]=new Employyes[3];
		arr[0]=new Employyes(101,"kimaya sonawane",42000);
		arr[1]=new Employyes(102,"smita bodke",44000);
		arr[2]=new Employyes(103,"shreya sonawane",56000);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
	}

}

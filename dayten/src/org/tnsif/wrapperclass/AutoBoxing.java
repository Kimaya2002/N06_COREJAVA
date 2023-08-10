package org.tnsif.wrapperclass;
//program to demonstrate on AutoBoxing
/*coversion of primitive to object type*/

public class AutoBoxing {
	
	public static void main(String[] args)
	{
		int num=78;
		//converting primitive type to object
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());}
}

package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {
	
	public static void main(String[] args)
	{
		/* we cant create the object for abstract class*/
		//Sandwich s=new Sandwich();
		CornSandwich s=new CornSandwich();
		s.prepare();
		s.showReceipe();
	}

}

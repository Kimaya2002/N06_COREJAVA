//program to demonstrate on access specifier
//driver class
package in.metbkc.library;

import in.kkwagh.library.Library;
//import in.bkcmet.Library.*;

public class FacultyExecutor {
	public static void main(String[] args)
	{
		Library l=new Library();
		l.libraryName="Bhujbal library";
		l.displayPublic();
		
		/* userId and displayPrivate() method is private,so 
		 * we can't access into another package or class,only
		 * we can access inside the same class*/
		 
		//l.userId=12345l;
		//l.displayPrivate();
		
		/*booksName and displayDefault() method is default,
		 * we can't access into another package,only we can access
		 * it within the same package*/
		 
		
		//l.booksName;
		//l.displayDefault();
	}
}

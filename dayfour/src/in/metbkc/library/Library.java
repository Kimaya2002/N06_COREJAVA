//program to demonstrate on access specifier
package in.metbkc.library;

public class Library {
	//different access speecifier
	public String libraryName;
	private long userId;
	String booksName;
	
	//public method
	public void displayPublic()
	{
		System.out.println("library name : "+libraryName);
	}
	//private method
	private void displayDefault()
	{
		System.out.println(" BooksName is:"+booksName);
	}
}

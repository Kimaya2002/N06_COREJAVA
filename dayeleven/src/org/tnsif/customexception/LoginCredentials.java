package org.tnsif.customexception;

//program to demonstrate on customException
/*to use custom exception extends an exception class (parent)*/
 
public class LoginCredentials extends Exception{

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//paremeterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
	
	
	
}

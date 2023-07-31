//program to demonstrate on:
//this keyword is used to refer current instance of class
package org.tnsif.thiskeyworddemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;

	}
	void display()
	{
		System.out.println(accountNo);
	}
}
//driver class
public class ThisKeywordDemoone {

	public static void main(String[] args)
	{
		Account a=new Account();
		//a.accountN0=3456678909L;
		a.setData(67578768L);
		a.display();

	}
}

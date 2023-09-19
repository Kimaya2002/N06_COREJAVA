package org.tnsif.abstractkeyword;

public abstract class Sandwitch {

	//concrete method
	void showReceipe()
	{
		System.out.println("I dont know how to "+"prepare sandwitch");
	}
	//abstract method
	abstract void prepare();
}

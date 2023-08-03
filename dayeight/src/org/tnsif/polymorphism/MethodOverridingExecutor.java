package org.tnsif.polymorphism;
class ChiefMinister
{
	static void corruption(String str1,float amount)
	{
		System.out.println(str1+" Corrupted the amount of "+amount);
	}
}
class MLA extends ChiefMinister
{
	static void corruption(String str2,float amount2)
	{
		
		ChiefMinister.corruption("Eknath Shinde",342345.90f);
		System.out.println(str2+" Corrupted the amount of "+amount2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA.corruption("Ajit pawar",12786.9f);

	}

}

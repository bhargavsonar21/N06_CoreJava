//Program to demonstrate the Method Overriding 
package org.tns.polymorphismDemo;

class ChiefMinister
{
	static void corruption(String str1,float ammount)
	{
		System.out.println(str1+" Corrupted ammount of "+ammount);
	}
}

class MLA extends ChiefMinister
{
	static void corruption(String str1,float ammount)
	{
		ChiefMinister.corruption("Eknath Shinde", 2465456.00f);
		System.out.println(str1+" Corrupted ammount of "+ammount);
	}
}
public class MethodOverridingExecuter {

	public static void main(String[] args) {
		MLA.corruption("XYZ", 2545343f);
		
		

	}

}

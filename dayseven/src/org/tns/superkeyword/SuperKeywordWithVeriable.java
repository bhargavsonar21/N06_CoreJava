//Program to demonstrate on super Keyword with variable
package org.tns.superkeyword;
class Building
{
	int floors = 23;
	String name = "Anath-Astha";	
}
class Flat extends Building
{

	String name ="Chintamani Wankhede";
	void print()
	{
		/*If your parent class and variable name are same,
		 * and if you want to access parent class variable insite
		 * child class use super.variable name*/
		System.out.println(super.name);
		System.out.println(name);
	}
	
}
public class SuperKeywordWithVeriable {
	
	public static void main(String[] args) {
		Flat f = new Flat();
		f.print();
		

	}

}

package org.tns.polymorphismDemo;
class Bollywood
{
	//Method overloading in terms of by passing the different No. of aurguments
	static String showCouple(String str1,String str2)
	{
		return str1 + " Loves " + str2;
	}
	
	static String showCouple(String str1,String str2,String str3)
	{
		return str1 + " Loves " + str2+ " As Well as "+str3;
	}
	
}
public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		System.out.println(Bollywood.showCouple("Salman", "Aishwarya"));
		
		System.out.println(Bollywood.showCouple("Salman","Aishwarya","Katrina"));
		
		
		

	}

}

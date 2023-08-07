//Program to demonstrate in static Keyword
package org.tns.statickeyword;

public class StaticMethodExecuter {
	String str = "MET BKC";
	float percentage = 78.9f;
	/*if any method outeside the main function and if you want to access that method inside 
	 * the main function make it as static */
	static void displayScore(int score)
	{
		/*We can't use non static variable insite static method 
		 * System.out.println(percentage);*/
		System.out.println("Score is: "+score);
		
	}

	public static void main(String[] args) {
		displayScore(56);
		

	}

}

package org.tns.unchackedexception;
//program to demonstrate handle Arithmatic exception
import java.util.Scanner;

public class ArithmaticExceptionExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//try block contains an exception code
		try {
			System.out.println(x/y);
		}
		//Catch block is used to handeld that Exception
		catch(Exception e)
		{
			System.out.println("Exception Handeld: "+e);
		}
		sc.close();

	}

}

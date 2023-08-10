package org.tns.customexception;
//Program to demonstrate on custom exception
import java.util.Scanner;

public class CustomExceptionExecuter {

	public static void main(String[] args) //throws LoginCredentials
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter UserID: ");
		String userid = sc.nextLine();
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		sc.close();
		
		try
		{
			if(userid.equals("BhargavSonar") && password.equals("Bhargav@123"))
			{
				System.out.println("Credentials are Matched!!!");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		catch(LoginCredentials e) 
		{
			 System.out.println("Exception Handled: "+e);
		 }
		
		
	}
	

}

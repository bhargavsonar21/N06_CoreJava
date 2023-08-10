package org.tns.checkexception;
//Program to demonstrate on checked Exception
import java.io.FileInputStream;

public class CheckExceptionDemo {

	public static void main(String[] args) {
		try
		{
			FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\Dataset");
			System.out.println("File is Exist");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handeled: "+e);
			
		}
		

	}

}

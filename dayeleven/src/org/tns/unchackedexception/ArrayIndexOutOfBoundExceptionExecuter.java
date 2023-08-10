package org.tns.unchackedexception;
//Program to demonstrate on ArrayIndexOutOfBoundsException 
public class ArrayIndexOutOfBoundExceptionExecuter {
	
	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handeled"+ e);
		}
		finally
		{
			System.out.println("Finally Block is Always Executed");
		}
		System.out.println("Any Statement outside all this will Executed...");
		
	}

	public static void main(String[] args) {
		int arr[] = {12,6,89};
		display(arr);
		

	}

}

package org.tns.unchackedexception;
//program to demonstrate on catch block with multiple Exception
public class CatchBlockDemo {
	static void print(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e) 
		{
			System.out.println(e);
			
		}
		catch(Exception e)
		{
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {12,3,14};
		print(arr);
		

	}

}

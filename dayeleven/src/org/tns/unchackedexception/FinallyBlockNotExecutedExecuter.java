package org.tns.unchackedexception;

public class FinallyBlockNotExecutedExecuter {
	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[2]);
			System.exit(0);
			/*If try and catch block contains system.exit(0) after the exception
			 * then finally block does not execute*/
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handeled"+ e);
//			System.exit(0);
		}
		finally
		{
			//When finally block contains exception code,
			//then finally block does not execute
			System.out.println(13/0);
			System.out.println("Finally Block is Always Executed");
		}
		System.out.println("Any Statement outside all this will Executed...");
		
	}

	public static void main(String[] args) {
		int arr[] = {12,6,89};
		display(arr);

	}

}

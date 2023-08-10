package org.tns.unchackedexception;

public class ThrowAndThrowsKewordDemo {
	
	static void isEleigible(int age,int weight) throws ArithmeticException 
	{
		if(age> 18 && weight > 50) {
			System.out.println("Person is Eligeble to donate the blood");
		}
		else
			throw new ArithmeticException("Criteria is not satisfied");
	}

	public static void main(String[] args)throws ArithmeticException{
		/*try
		{
			isEleigible(13,55);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		*/
		isEleigible(18,65);
		//living adhar 
	}

}

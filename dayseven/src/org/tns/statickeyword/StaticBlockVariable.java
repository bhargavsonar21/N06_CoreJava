package org.tns.statickeyword;

public class StaticBlockVariable {
	static String name;
	int marks;
	
	
	static
	{
		name = "Bhargav Sonar";
		/*We cant initialize the non static variable in static block*/
        //System.out.println(marks);
		//marks = 145;
		System.out.println(name);
		
	}
	
//	static void print ()
//	{
//		System.out.println(name);
//	}
//	

	public static void main(String[] args) {
		/*Main function is static and hence it calls static block, method and variable by
		 * default..*/
		
		
		

	}

}

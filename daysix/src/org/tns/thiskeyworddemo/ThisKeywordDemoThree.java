package org.tns.thiskeyworddemo;
class Team
{
	int size;
	Team()
	{
		this(7);
		System.out.println("Default Construcor");	
	}
	Team(int size)
	{
		System.out.println("Parameterized Constructor: "+size);
	}	
}

public class ThisKeywordDemoThree {
	
	public static void main(String[] args) {
		Team t = new Team();
		

	}

}

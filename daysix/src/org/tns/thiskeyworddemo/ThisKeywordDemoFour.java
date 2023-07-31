package org.tns.thiskeyworddemo;

class Director
{
	String name;
	void print()
	{
		this.name="Sunil Datt";
		display(name);
		
	}
	void display(String name)
	{
		System.out.println("Director name is name: "+name);
	}
}
public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
		

	}

}

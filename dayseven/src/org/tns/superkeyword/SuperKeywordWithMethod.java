package org.tns.superkeyword;

class MET
{
	String ownerName = "Chagan Bhujbal";
	void displayname()
	{
		System.out.println("Owener name is: "+ownerName);
	}
	
}
class BKC extends MET
{
	
	String ownerName = "Shefali Bhujbal";
	/*If your parent class and child class method name are same then you 
	 * have to use super.methodname()*/
	void displayname()
	{
		super.displayname();
		System.out.println("Owner is: "+ ownerName);
	}
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayname();
		

	}

}

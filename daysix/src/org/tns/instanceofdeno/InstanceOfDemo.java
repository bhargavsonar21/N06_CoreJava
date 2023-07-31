package org.tns.instanceofdeno;

class RBI {
	protected String ifscCode;
	
}
class SBI extends RBI 
{
	public SBI()
	{
		super.ifscCode = "RBISONGPA01";
		String ifscCode = "SBIN0002161";
		/*if you have same variable in parent class and child class we have to 
		use super keyword*/
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
	}	
}
//Program to demonstrate instance of operator
public class InstanceOfDemo {
	



	public static void main(String args[]){
		SBI s = new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		

	}

}

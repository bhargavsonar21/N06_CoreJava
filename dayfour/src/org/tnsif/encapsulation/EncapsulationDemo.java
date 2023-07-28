package org.tnsif.encapsulation;
//Programe to demonstrate on Encapsulation
/*Encapsulation achieves a data hiding using private access 
* specifire*/
//
public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC b = new HDFC();
		//Setting a value to private data members
		b.setAccType("Saving Account");
		b.setAccountNo(123456789420L);
		b.setAtmCardNo(123456789452L);
		b.setPinNo(1544);
		
//		System.out.println("Account No is: "+b.getAccountNo());
		
		//below line will call to tostring
		
		System.out.println(b);
		
		
		
		
		

	}

}

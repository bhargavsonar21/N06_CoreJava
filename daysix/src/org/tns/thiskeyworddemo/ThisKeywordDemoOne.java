//Program to demonstrate on:
//this keyword is used to refer current instance of the class

package org.tns.thiskeyworddemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		//accountNo = accountNo;
		this.accountNo = accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
		
	}
}

//Driver class
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
//		a.accountNo = 56664146316456L; U will get the output
		a.setData(25245464511616L);
		a.display();
		
		
		
		

	}

}

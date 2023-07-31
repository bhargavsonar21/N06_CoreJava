package org.tns.thiskeyworddemo;

class Bank
{
	long accountNo;
	Bank(long accountNo)
	{
//		accountNo = accountNo;
		this.accountNo = accountNo;
	}
	
	void display()
	{
		System.out.println(accountNo);
	}
	
}

public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		Bank b = new Bank(345348643546L);
		b.display();
	}

}

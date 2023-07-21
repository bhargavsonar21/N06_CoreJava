package org.tns.operator;
//Program to Demonstrate on decrement & Increment Operator
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x = 23, y = 6;
		int res1 = x++ + ++y; //23 + 7
		System.out.println(res1); //30
		System.out.println(x);    //23
		System.out.println(y);    //7
		
		int res2 = x-- + --y;
		System.out.println(res2); //24 + 6
		System.out.println(x);		//23
		System.out.println(y);		//6
	}

}

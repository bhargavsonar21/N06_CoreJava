package org.tns.looping;
import java.util.Scanner;
//Second Homework
//Count Number of digit in a number
public class HomeWorkSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the countable Number: ");
		int number = sc.nextInt();
		int count = 0;
		do
		{
			number /=10;
			++count;	
		}
		while(number!=0);
		System.out.println("Digits of Given Number is:"+count);
		sc.close();	
	}

}

package org.tns.dicisonstatement;
import java.util.Scanner;
//Program to demonstrate to check person is eligible to donate blood or not using If..else
public class IfElseExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age > 18 && weight > 50)
		{
			System.out.println("Eligible to donate the Blood");
		}
		else {
			System.out.println("You are NOt Eligible");
		}
		sc.close();
		
		

	}

}

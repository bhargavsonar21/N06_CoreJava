package org.tns.dicisonstatement;
//Program to demonstrate on cascaded if...else Statement
import java.util.Scanner;
public class CascadedIfElseExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of First age1: ");
		int age1 = sc.nextInt();
		System.out.println("RNte second age");
		int age2 = sc.nextInt();
		System.out.println("Enter third age");
		int age3 = sc.nextInt();
		
		if(age1 > age2 && age2 > age3)
		{
			System.out.println("Age 1 is Greaterf:"+age1);
		}
		else if(age2 > age1 && age2 > age3)
		{
			System.out.println("Age 2 is Greater: "+age2);
			
		}
		else
		{
			System.out.println("Age 3 is Greater: "+ age3);
		}
		sc.close();

	}

}

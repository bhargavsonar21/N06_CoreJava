package org.tns.dicisonstatement;

import java.util.Scanner;

//Program to demonstrate on bunjee jumping
public class NestedIfExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
		if(age >=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee jumping");
				if(weight > 110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not Eligible...");
			}
		}
		else
		{
			System.out.println("age is less than 12");
		}
		sc.close();
		

	}

}

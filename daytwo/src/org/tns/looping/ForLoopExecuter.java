package org.tns.looping;
//Program to demonstrate on for loop
import java.util.Scanner;

//
public class ForLoopExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of column and rows: ");
		int n = sc.nextInt();
		for(int i=1; i <= n;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}

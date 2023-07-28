package org.tns.looping;

import java.util.Scanner;
//First Homework
/*
 1
 12
 123
 1234
 * 
 */
public class HomeWorkOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Rows And Columns:");
		int N = sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
		

	}

}

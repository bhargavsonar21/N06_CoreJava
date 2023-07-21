package org.tns.operator;
//Program to demonstrate Ternary Operator
import java.util.Scanner;
public class TernaryOperatorDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String output=(num%2==0)?"Even":"Odd";
		System.out.println(output);
		sc.close();
		
	}

}

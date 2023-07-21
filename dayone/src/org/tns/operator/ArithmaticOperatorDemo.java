package org.tns.operator;
import java.util.Scanner;
public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter THe Second Number: ");
		int num2 = sc.nextInt();
		System.out.println("This is Addition: "+num1+num2);
		System.out.println("This is a Substraction" +(num1-num2));
		System.out.println("This is Multiplication: "+num1*num2);
		System.out.println("This is Division: "+num1/num2);
		System.out.println("This is Modulo: "+num1%num2);
		sc.close();

	}

}

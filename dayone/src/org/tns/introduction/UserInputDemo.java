//Program to demonstrate in user input
package org.tns.introduction;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the Value of string: ");
		String str1 = s.next();
//		String str2 = s.nextLine();
		System.out.println("Given String is: "+ str1);
//		System.out.println("Second string is: "+ str2);
        s.close();
	}

}

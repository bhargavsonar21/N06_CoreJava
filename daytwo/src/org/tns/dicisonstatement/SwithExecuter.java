package org.tns.dicisonstatement;
import java.util.Scanner;
public class SwithExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int songno = sc.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("Waka Waka");
				break;
			case 2:
				System.out.println("Taki Taki");
				break;
			case 3:
				System.out.println("Jai Shree ram!!!");
				break;
			default:
				System.out.println("Invalid Inpput");
		}
		sc.close();

	}

}

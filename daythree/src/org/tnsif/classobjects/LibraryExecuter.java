package org.tnsif.classobjects;
//Driver class
//Program to demonstrate on default and Parameterized constructor
public class LibraryExecuter {

	public static void main(String[] args) {
		Library l = new Library();
		Library l1 = new Library(5,"Vishal Lichade","Java Prgraming",250.56);
		System.out.println(l1);
		System.out.println(l);
		
		

	}

}

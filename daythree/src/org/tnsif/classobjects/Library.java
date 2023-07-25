//Program to demonstrate on default and Parameterized constructor
package org.tnsif.classobjects;
public class Library {
	public long noOfBooks;
	public String autherName;
	public String bookName;
	public double price;
	
	public Library() {
		//default constructor
		System.out.println("Default Constructor");
	}

	public Library(long noOfBooks, String autherName, String bookName, double price) {
		super();
		//parameterize constructor
		this.noOfBooks = noOfBooks;
		this.autherName = autherName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parametriszed Constructor");
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", autherName=" + autherName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
	
	
	
	
	

}

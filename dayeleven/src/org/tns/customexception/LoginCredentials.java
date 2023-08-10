package org.tns.customexception;
//Program to denonstrate on custom exception
/*to use custom Exception extends an Exception class(Parent)*/
public class LoginCredentials extends Exception {
	
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//Parameterized Constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}


	
	
	
	

}

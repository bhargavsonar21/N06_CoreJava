package in.bkcmet.library;
//Program to demonstrate on access specifier
public class Library {
	//Different access specifier
	public String libraryName;
	private long userid;
	String booksName;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name: " + libraryName);
	}
	
	//Private Method
	private void displayPrivate()
	{
		System.out.println("User Id: "+ userid);
	}
	
	//default method
	void displayDefault()
	{
		System.out.println("BookName is: "+booksName);
	}

}

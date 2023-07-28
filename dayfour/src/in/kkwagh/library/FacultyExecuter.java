//Program to demonstrate on access specifier
//Driver class
package in.kkwagh.library;
//import in.bkcmet.library.*;
import in.bkcmet.library.Library;
public class FacultyExecuter {

	public static void main(String[] args) {
		Library l = new Library();
		l.libraryName = "Bhujbal Knowledge city";
		l.displayPublic();
		
		/*User Id and displayPrivate() methods are private so 
		 * we can't access into another package or class, only 
		 * we can access insite the same class*/
//		l.userId = 1234512L;
//		l.displayPrivate();
		

		/*Books name and displayDefault() method are default method and 
		 * default variable so we can't access in another pachage 
		 * only we can access within a same package*/
		//		l.booksName;
		//		l.displayDefault();
		
		
		
		
	}

}

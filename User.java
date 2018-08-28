import java.util.ArrayList;

//User.java -> Used for holding attributes for each person .
 // attributes -> Name, phone number, libraryID, listCheckedOutBooks.
public class User {
	
	public String name;
	public String phoneNumber;
	public String libraryID;
	public ArrayList<Book> checkedOutBooks;
	
	
	public User(String name, String phoneNumber, String libraryID){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.libraryID = libraryID;
		this.checkedOutBooks =  new ArrayList<Book>();
	}
	
	public void addToCheckOut (Book aBook) {
		checkedOutBooks.add(aBook);
	}
	
	public void printAllBooks() {
		System.out.println(name +"'s Checked Out Books");
		for(Book b: checkedOutBooks) {
			b.print();
		}
	}
}

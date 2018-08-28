
public class Main {

	
	public static void main(String[] args) {
		User user1 = new User("bob", "5555", "12345");
		User user2 = new User("ted", "4444", "54321");
		
		Book book1 = new Book ("MaryGO", 50, "123456");
		Book book2 = new Book ("Aladin", 70, "666666");
		Book book3 = new Book ("Jafar", 20, "121212");
		LibraryManager LM1 = new LibraryManager();
		LM1.addBookToInventory(book1);
		LM1.addBookToInventory(book2);
		LM1.addBookToInventory(book3);
		
		LM1.checkedOutBook("123456", user1);
		LM1.showInventory();
		
	}

}
//Library Catalog – Create a book class with a title, page count, ISBN and whether or not it is checked out or not. 
//Manage a collection of various books and allow the user to check out books or return books. 

//Classes:
    //Main.java -> Used for running the program. (ENTRY POINT)
    //Book.java -> Used for holding attributes for each book.
        // attributes -> title, page count, ISBN, and whether or not it is checked out or not.
    //User.java -> Used for holding attributes for each person .
        // attributes -> Name, phone number, libraryID, listCheckedOutBooks.
    //LibraryManager.java -> Used for..
        // functions -> checkOutBook(), returnBook(), showInventory()
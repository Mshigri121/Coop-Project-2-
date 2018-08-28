import java.util.ArrayList;

//LibraryManager.java -> Used for..
// functions -> checkOutBook(), returnBook(), showInventory(), addBook()
public class LibraryManager {
	
	public ArrayList<Book> inventory;
	
	public LibraryManager() {
		this.inventory = new ArrayList<Book>();
	}
	
	public void addBookToInventory(Book newBook) {
		inventory.add(newBook);
	}
	
	public boolean checkedOutBook(String isbn, User aUser) {
		for(int i=0; i<inventory.size(); i++){
			Book currentBook = inventory.get(i);
			if (currentBook.isbn == isbn){
				currentBook.checkedOut = true;
				aUser.addToCheckOut(currentBook);
				return true;
			}
	    }
		return false;
	}
	public void returnBook(Book aBook, User aUser){
//Go through the USERs CHECKED OUT BOOKS to find and remove that from the list
	    for(int i =0; i<aUser.checkedOutBooks.size();i++){
	        Book current = aUser.checkedOutBooks.get(i);
	        if(current.isbn == aBook.isbn){
	            aUser.checkedOutBooks.remove(i);
	        }
	    }
	    
	    //Set as back in INVENTORY'S BOOKS
	    for(int i=0; i<inventory.size(); i++){
	    	Book current = inventory.get(i);
	    	if(current.isbn == aBook.isbn){
	    		inventory.get(i).checkedOut = false;
	         
	        }
	    }
	}
	public void showInventory() {
		for(Book b: inventory){ 
			b.print();
		}
	}
	

}

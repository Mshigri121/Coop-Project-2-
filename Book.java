//Book.java -> Used for holding attributes for each book.
// attributes -> title, page count, ISBN, and whether or not it is checked out or not.
public class Book {
	public String title;
	public int pageCount;
	public String isbn;
	public boolean checkedOut;
	
	public Book(String title,int pageCount,String isbn){
		this.title = title;
		this.pageCount = pageCount;
		this.isbn = isbn;
		this.checkedOut = false;
	}
	
	public void print(){
		System.out.println(title);
		System.out.println(pageCount);
		System.out.println(isbn);
		System.out.println(checkedOut);
		System.out.println();
	}
}

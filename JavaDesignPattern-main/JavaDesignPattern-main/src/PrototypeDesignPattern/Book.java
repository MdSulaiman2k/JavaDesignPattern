package PrototypeDesignPattern;

public class Book {
	static int totalBook ;
	int book_id ;
	String book_name ;
	
	static {
		totalBook = 0 ;
	}
	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + "]";
	}
	
	public int getBook_id() {
		return book_id;
	}
	
	public Book() {
		super();
	}
	
	public void loadBook(int bkid , String bkname ) {
		book_id = bkid ;
		book_name = bkname ;
	}

	public Book(String book_name) {
		super();
		totalBook += 1 ;
		this.book_name = book_name;
		this.book_id  = totalBook ;
	}

	public Book(int book_id, String book_name) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	
	

}

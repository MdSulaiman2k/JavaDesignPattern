package PrototypeDesignPattern;

import java.util.* ;

public class BookShop implements Cloneable {
	String ShopName ;
	List<Book> Books = new ArrayList<>() ; 
	
	public void addBooks(Book bk ) {
		Books.add(bk) ;
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bk = new BookShop() ;
		for(Book b : this.getBooks()) {
			bk.getBooks().add(b) ;
		}
		
		return bk;
	}

	public void sellBook(Book bk ) {
		Books.remove(bk) ;
	}
	
	public void setData() {
		for(int i = 0 ; i < 10 ; i++) {
			Book bk = new Book() ;
			bk.setBook_id(i) ;
			bk.setBook_name(("book"+String.valueOf(i))) ;
			Books.add(bk) ;
		}
	}

	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", Books=" + Books + "]";
	}

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public List<Book> getBooks() {
		return Books;
	}

	public void setBooks(List<Book> books) {
		Books = books;
	}
	
	

}

package PrototypeDesignPattern;

public class Main {
	public static void main(String [] args) throws CloneNotSupportedException {
		BookShop bks = new BookShop();
		bks.setData();
		bks.ShopName = "skyfy";
	
		BookShop bks2 = bks.clone() ;
		
		bks2.ShopName = "skyfy2";
		System.out.println(bks);

		System.out.println(bks2);

		
		
	}

}

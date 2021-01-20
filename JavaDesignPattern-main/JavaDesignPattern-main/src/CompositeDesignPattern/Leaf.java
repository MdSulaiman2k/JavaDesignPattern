package CompositeDesignPattern;

public class Leaf implements Composite{
	int price ;
	String name ;
	Leaf(int p , String n){
		name = n ;
		price = p ; 
	}
	@Override
	public void showPrices() {
		System.out.println("name : " + name + "\tprice : " +  price) ;
	}
	
}

package CompositeDesignPattern;
import java.util.* ;
public class Computer implements Composite{
	String name ;
	List<Composite> obj = new ArrayList<>() ;
	
	Computer(String n ){
		name = n ;
	}
	
	public void addComposite(Composite com) {
		obj.add(com) ;
	}

	@Override
	public void showPrices() {
		// TODO Auto-generated method stub
		System.out.println("name : " + name) ;
		for(Composite com : obj) {
			
			com.showPrices() ;
		}
		
	}

}



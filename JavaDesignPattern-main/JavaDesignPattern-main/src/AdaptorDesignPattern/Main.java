package AdaptorDesignPattern;

public class Main {
	
	public static void main(String[]args) {
		Assesment as = new Assesment() ;
		PenAdaptor pa = new PenAdaptor() ;
		as.setPen(pa) ;
		as.writing("im writing");
 		 
	}

}

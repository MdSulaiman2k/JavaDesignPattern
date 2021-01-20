package CompositeDesignPattern;

public class Main {
	
public static void main(String [] args) {
  Leaf mouse = new Leaf(350 , "mouse") ;
  Leaf keyboard = new Leaf(500 , "Keyborad") ;
  Leaf camera = new Leaf(400 , "camera") ;
  Leaf harddrive = new Leaf(3250 , "harddrive") ;
  
  Computer Windows = new Computer("OS") ;
  Windows.addComposite(mouse) ;
  Windows.addComposite(keyboard) ;
  
  Computer SystemManagement = new Computer("System") ;
  SystemManagement.addComposite(camera) ;
  SystemManagement.addComposite(harddrive) ;
  
  System.out.println("Wndows Components : ") ;
  Windows.showPrices() ;
  System.out.println("\n\nSystem Components : ") ;
  SystemManagement.showPrices() ;
  
  
  
  
 
}
	
}

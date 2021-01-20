package FactoryDesign;
import FactoryDesign.* ;
public class Factory {
   public static void main(String [] args ) {
	   Os obj = Os.FreeService("Apple") ;
	  // obj.getvalue() ;
	   obj.data = 23 ;
	   
   }
}

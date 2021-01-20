package FactoryDesign;
 

public class factoryPattern {
	
	public Os FreeService(String st) {
		if(st.equals("Apple")) 
			return new Apple() ; 
	    else
	    	return new Android() ;
		
	}

}

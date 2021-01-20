package FactoryDesign;







public abstract class Os {
	public int data ; 
    abstract void  service() ;
    
    public static Os FreeService(String st) {
		if(st.equals("Apple")) 
			return new Apple() ; 
	    else
	    	return new Android() ;
		
	}

}

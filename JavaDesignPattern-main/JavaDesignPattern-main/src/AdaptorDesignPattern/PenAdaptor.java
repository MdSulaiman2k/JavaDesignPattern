package AdaptorDesignPattern;

public class PenAdaptor implements  Pen {
	PenDrive p = new PenDrive() ;
	
	@Override
	public void writing(String st) {
		p.writing(st) ;
	}

}

package AdaptorDesignPattern;

public class Assesment {
	Pen pen ;

	
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	public void writing(String st)  {
		pen.writing(st);
	}
	
	

}

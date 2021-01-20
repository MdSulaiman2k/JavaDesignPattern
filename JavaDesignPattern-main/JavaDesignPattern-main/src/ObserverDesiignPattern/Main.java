package ObserverDesiignPattern;

public class Main {
 public static void main(String []args) {
	 Subcriber s1 = new Subcriber("Sulaiman") ; 
	 Subcriber s2 = new Subcriber("Kabeer") ; 
	 Subcriber s3 = new Subcriber("Imran") ; 
	 Subcriber s4 = new Subcriber("Yusuf") ; 
	 Subcriber s5 = new Subcriber("Abdul") ; 
	 
	 Channel c1 = new Channel("Telusko") ;
	 Channel c2 = new Channel("Almost Every Thing") ;
	 Channel c3 = new Channel("MFT") ;
	 Channel c4 = new Channel("rishi") ;
	 
	 s1. addChannel(c1) ;
	 s2.addChannel(c2) ;
	 s3.addChannel(c3) ;
	 s4.addChannel(c4) ;
	 s5.addChannel(c1) ;
	 
	 c1.VideoUpload() ;
	 c2.VideoUpload() ;
	 c3.VideoUpload() ;
	 c4.VideoUpload() ;
	 
	 
	 
	 
	 
	 
 }
}

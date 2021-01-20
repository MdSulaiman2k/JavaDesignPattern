package ObserverDesiignPattern;

import java.util.LinkedList;
import java.util.List;

public class Subcriber {
	static int subnumber ;
	String sub_Id ;
	String name ;
	List<Channel> following = new LinkedList<>() ;
	
	static {
		subnumber = 0 ;
	}
	public void addChannel(Channel ch) {
		following.add(ch) ;
		ch.addSubsciber(this) ;
	}
	public void removeChannel(Channel ch) {
		following.remove(ch) ;
		ch.removeSubsciber(this) ;
	}
	
	
	public Subcriber(String name ){
		subnumber += 1 ;
		this.name = name ;
		sub_Id  =  "s"+ String.valueOf(subnumber) ;
		
	}
	
	public void notification(Channel ch) {
		System.out.println(ch.ChannelName  + "\t" + name + "\tthe video was posted") ;
	}
}

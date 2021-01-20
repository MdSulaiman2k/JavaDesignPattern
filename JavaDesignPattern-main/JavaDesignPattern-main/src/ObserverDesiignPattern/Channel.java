package ObserverDesiignPattern;

import java.util.LinkedList;
import java.util.List;

public class Channel {
	static int totalChannel ;
	int Channel_id ;
	String ChannelName ;
	
	
	List<Subcriber> subcribers = new LinkedList<>() ;
	
	static {
		totalChannel = 0 ;
	}
	public Channel(String CN) {
		totalChannel += 1 ;
		ChannelName = CN ;
		Channel_id  = totalChannel ;
		
		
	}
	public void setChannelName(String CN ) {
		ChannelName = CN ;
	}
	
	public void  addSubsciber(Subcriber sub) {
		subcribers.add(sub) ;
	}
	public void  removeSubsciber(Subcriber sub) {
		subcribers.remove(sub) ;
	}
	
	public void VideoUpload() {
		for(Subcriber a : subcribers ) {
			a.notification(this);
		}
		
	}
	

}

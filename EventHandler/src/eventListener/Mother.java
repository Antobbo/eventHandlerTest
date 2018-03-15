package eventListener;

import java.util.List;
import java.util.ArrayList;

//Mother class says hello
public class Mother
{
	private List<IEventListener> listeners = new ArrayList<IEventListener>();
	public void addListener(IEventListener toAdd) {
        listeners.add(toAdd);
        
    }
	public void notifyEverybody() {//notify everyone listening for the event
		System.out.println("listeners size: " + listeners.size());
		for(IEventListener eventListener : listeners) {
			eventListener.sayHello();
		}
	}
	

}

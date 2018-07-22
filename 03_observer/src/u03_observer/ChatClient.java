package u03_observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ChatClient {
	private ArrayList<IChatBeobachter> beobachter = new ArrayList<IChatBeobachter>();
	public ChatClient(){
		System.out.println("ChatClient generated!");
	};
	public void registiereBeobachter(IChatBeobachter beo){
		if(!this.beobachter.contains(beo)) beobachter.add(beo);
	};
	
	public void entferneBeobachter(IChatBeobachter beo){
		beobachter.remove(beo);
	};
	
	public void benachrichtigeBeobachter(Nachricht nachricht) throws IOException{
		//LogWriter lw = new LogWriter();
		for(IChatBeobachter beo: this.beobachter){
			beo.aktualisieren(nachricht);
		}
		
	};
	
	public void schreibeNachricht(String text, String empfaenger) throws IOException{
		Nachricht n = new Nachricht(new Date(), text, empfaenger);
		this.benachrichtigeBeobachter(n);
	};
}

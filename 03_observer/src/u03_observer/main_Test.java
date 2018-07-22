package u03_observer;

import java.io.IOException;

public class main_Test {

	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
		Anzeige   anz = new Anzeige();
		LogWriter log = new LogWriter();
		cc.registiereBeobachter(anz);
		cc.registiereBeobachter(log);
		try{
		cc.schreibeNachricht("Hi", "SENDER1");
		cc.schreibeNachricht("Hi", "SENDER2");
		cc.schreibeNachricht("Hi du", "SENDER1");
		}catch(IOException e){
			System.out.println(e);
		}
	}

}

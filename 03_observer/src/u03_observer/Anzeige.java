package u03_observer;

import java.text.SimpleDateFormat;

public class Anzeige implements IChatBeobachter{
	public Anzeige(){}


	@Override
	public void aktualisieren(Nachricht nachricht) {
		String uhrzeit = new SimpleDateFormat("HH:mm:ss").format(nachricht.getUhrzeit());
		System.out.println(nachricht.getEmpfaenger() + " : " + nachricht.getText()+"   - "+ uhrzeit);
		
	};
	
}

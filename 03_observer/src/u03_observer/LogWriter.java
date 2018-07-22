package u03_observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class LogWriter implements IChatBeobachter{
	public LogWriter(){
	}

	@Override
	public void aktualisieren(Nachricht nachricht) throws IOException {
		File f = new File(nachricht.getEmpfaenger()+".txt");
		FileWriter fw = new FileWriter(f, true);
		String uhrzeit = new SimpleDateFormat("HH:mm:ss").format(nachricht.getUhrzeit());
		fw.write(nachricht.getEmpfaenger() + " : " + nachricht.getText()+"   - "+ uhrzeit +"\n");
		fw.close();
	};
	
}

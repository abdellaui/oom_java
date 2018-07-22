package u03_observer;

import java.io.IOException;

public interface IChatBeobachter {
	public void aktualisieren(Nachricht nachricht) throws IOException;
}

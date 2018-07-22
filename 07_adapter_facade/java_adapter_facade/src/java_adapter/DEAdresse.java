package java_adapter;

public class DEAdresse implements AdressValidator{

	@Override
	public boolean istGueltig(String adresse, String plz, String bundesland) {
			if (adresse.length() < 10) return false;
			if (plz.length() == 5) return true;
			if (bundesland.length() != 2) return false;
			return true;
	}

}

package java_adapter;

public class USAdressAdapter extends USAdress implements AdressValidator{

	@Override
	public boolean istGueltig(String adresse, String plz, String bundesland) {
		return isValidUSAddress(adresse, plz, bundesland);
	}

}

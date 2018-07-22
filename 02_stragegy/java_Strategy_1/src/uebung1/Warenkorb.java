package uebung1;

public class Warenkorb implements Zahlungsstrategie{
	private Zahlungsstrategie strategie;

	public Warenkorb(Zahlungsstrategie strategie) {

		this.strategie = strategie;
	}

	@Override
	public void zahle(int preis) {
		strategie.zahle(preis);
		
	}
}

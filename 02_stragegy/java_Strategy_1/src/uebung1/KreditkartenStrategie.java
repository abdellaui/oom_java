package uebung1;

public class KreditkartenStrategie implements Zahlungsstrategie {
	private String name;
	private String nummer;
	private String cvv;
	private String ablaufdatum;
	
	public KreditkartenStrategie(String name, String nummer, String cvv, String ablaufdatum) {
		
		this.name = name;
		this.nummer = nummer;
		this.cvv = cvv;
		this.ablaufdatum = ablaufdatum;
	}

	@Override
	public void zahle(int preis) {
		System.out.println("name: "         +name);
		System.out.println("nummer: "       +nummer);
		System.out.println("cvv: "          +cvv);
		System.out.println("ablaufdatum: "  +ablaufdatum);
		System.out.println("preis: "        +preis);
		
	}
	

}

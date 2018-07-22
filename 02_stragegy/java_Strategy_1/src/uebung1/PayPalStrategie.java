package uebung1;

public class PayPalStrategie implements Zahlungsstrategie {
	private String email;
	private String password;

	public PayPalStrategie(String email, String password) {

		this.email = email;
		this.password = password;
	}
	@Override	
	public void zahle(int preis) {
		// TODO Auto-generated method stub
		System.out.println("mail: "  +email);
		System.out.println("pw: "    +password);
		System.out.println("preis: " +preis);
		
	}
	

}

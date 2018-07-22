package uebung1;

public class main_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warenkorb wk = new Warenkorb(new PayPalStrategie("max", "mueller"));
		wk.zahle(500);
	}

}

package java_adapter;

public class main_Tester {

	public static void main(String[] args) {
		AdressValidator adr = new USAdressAdapter();
		System.out.println(adr.istGueltig("AasdSasdasdasdasdD", "4545555", "as"));
		AdressValidator adr2 = new DEAdresse();
		System.out.println(adr2.istGueltig("AasdSasdasdasdasdD", "45455", "as"));
	}

}

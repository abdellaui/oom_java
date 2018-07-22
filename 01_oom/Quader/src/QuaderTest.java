public class QuaderTest {
	public static void main(String[] args){
		Quader q1 = new Quader();
		q1.setLaenge(10.0);
		q1.setBreite(5.0);
		q1.setHoehe(4.0);
		q1.setDichte(0.5);
		System.out.println("Volumen:" + q1.berechneVolumen() + "m^3");
		System.out.println("Volumen:" + q1.oberflaeche() + "m^2");
		System.out.println("Volumen:" + q1.berechneDichte() + "g");
		
		
		Quader q2 = new Quader();
		q2.setLaenge(5.0);
		q2.setBreite(5.0);
		q2.setHoehe(5.0);
		q2.setDichte(0.5);
		System.out.println("Volumen:" + q2.berechneVolumen() + "m^3");
		System.out.println("Volumen:" + q2.oberflaeche() + "m^2");
		System.out.println("Volumen:" + q2.berechneDichte() + "g");
		
		Quader q3 = new Quader();
		q3.setLaenge((q1.getLaenge()+q2.getLaenge())/2);
		q3.setBreite((q1.getBreite()+q2.getBreite())/2);
		q3.setHoehe((q1.getHoehe()+q2.getHoehe())/2);
		q3.setDichte(0.5);
		
		System.out.println("Volumen:" + q3.berechneVolumen() + "m^3");
		System.out.println("Volumen:" + q3.oberflaeche() + "m^2");
		System.out.println("Volumen:" + q3.berechneDichte() + "g");
	}
}

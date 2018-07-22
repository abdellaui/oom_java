package u09_composite_koffer;

public class main_Tester {

	public static void main(String[] args) {
		Behaelter Koffer = new Behaelter("Koffer1", 2);
		Koffer.addObjekt(new Gegenstand("Hose", 3));
		Koffer.addObjekt(new Gegenstand("Hose", 3));
		Koffer.addObjekt(new Gegenstand("Hose", 3));
		
		Behaelter Tasche = new Behaelter("Tasche", 1);
		Tasche.addObjekt(new Gegenstand("Schuhe", 3));
		Tasche.addObjekt(new Gegenstand("Schuhe", 3));
		Tasche.addObjekt(new Gegenstand("Schuhe", 3));
		
		
		Koffer.addObjekt(Tasche);
		System.out.println(Koffer.getGewicht());
	}

}

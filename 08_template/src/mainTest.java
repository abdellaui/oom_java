
import java.util.HashMap;
import java.util.Map.Entry;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> spielerDeutschland = new HashMap<Integer, String>();
		spielerDeutschland.put(1, "Neuer");
		spielerDeutschland.put(2, "Grokreutz");
		spielerDeutschland.put(3, "Schweini");
		
		for(Entry<Integer, String> entry : spielerDeutschland.entrySet()){
			Integer nummer = entry.getKey();
			String name = entry.getValue();
			DeutschTrikot trikot = new DeutschTrikot("weiss", "Polyester", nummer, name);
			trikot.erstellen();
			System.out.println("****************");
		}
		
		
		
		HashMap<Integer, String> spielerBrasil = new HashMap<Integer, String>();
		spielerDeutschland.put(10, "Neymer");
		
		for(Entry<Integer, String> entry : spielerBrasil.entrySet()){
			Integer nummer = entry.getKey();
			String name = entry.getValue();
			BrasilienTrikot trikot = new BrasilienTrikot("gelb", "Polyester", nummer, name);
			trikot.erstellen();
			System.out.println("****************");
		}
	}

}

import Backpack.*;
import Charakter.*;
import Rüstung.*;

public class main_Tester {
	public static void main(String[] args){
	Charakter mag = new MetallArmschoner(new Magier());
	Charakter mag1 = new StoffBeine(new Magier());
	Charakter mag2 = new LederHut(new Magier());
	Charakter wal = new MetallArmschoner(new Waldläufer());
	Charakter wal1 = new StoffBeine(new Waldläufer());
	Charakter wal2 = new LederHut(new Waldläufer());
	mag.zeigeRüstungswert();
	mag1.zeigeRüstungswert();
	mag2.zeigeRüstungswert();
	wal.zeigeRüstungswert();
	wal1.zeigeRüstungswert();
	wal2.zeigeRüstungswert();
	
	Backpack bp = BackpackFactory.createBackpack("WaldlaueferBackpack");
	Backpack bp_2 = BackpackFactory.createBackpack("MagierBackpack");
	bp.listItems();
	bp_2.listItems();
	}
}

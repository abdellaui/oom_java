
public class GoldWechslen implements State {

	public void execute(Bergmann c) {
		if(c.getStandort() == Standort.BANK){
			if(c.istReichGenug()){
				System.out.println("Gold genug");
				c.setStandort(Standort.WOHNUNG);
			}else{
				System.out.println("Wenig Gold, arbeiten gehen");
				c.setStandort(Standort.GOLDMINE);
			}
			
		}else{
			System.out.println("muss zur bank");
			c.setStandort(Standort.BANK);
		}
	}

}

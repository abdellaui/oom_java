
public class Arbeiten implements State {

	public void execute(Bergmann c) {
		if(c.getStandort() == Standort.GOLDMINE){
			System.out.println("goldmine");
			c.setGold(c.getGold()+1);
			if(c.istTascheVoll()){
				System.out.println("tasche voll");
				c.setStandort(Standort.BANK);
			}
			if(c.durstig()){
				System.out.println("hat durst");
				c.setStandort(Standort.BAR);
			}
			
		}else{
			System.out.println("muss zur goldmine");
			c.setStandort(Standort.GOLDMINE);
		}
	}

}

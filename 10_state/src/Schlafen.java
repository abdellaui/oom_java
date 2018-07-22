
public class Schlafen implements State {

	public void execute(Bergmann c) {
		if(c.getStandort() == Standort.WOHNUNG){
			System.out.println("in der wohnung");
			while(c.istAusgeschlafen()){c.setErschoepfung(c.getErschoepfung()+1);}
		}else{
			System.out.println("wohnung gehen");
			c.setStandort(Standort.WOHNUNG);
		}
	}

}

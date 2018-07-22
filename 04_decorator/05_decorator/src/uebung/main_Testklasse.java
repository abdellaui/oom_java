package uebung;

import java.io.IOException;

public class main_Testklasse {
	public static void main(String [] args) throws IOException{
		Bild b1 = new EinfachesBild("lena.png");
		
		/*
		 * b1 = new KantenFilter(b1);
		 * ImageUtils.speichern(b1.getDaten() ,"lenaKanten.png");
		 * 
		*/
		
		/*
		 *  b1 = new SalzPfeffer(b1);
		 * ImageUtils.speichern(b1.getDaten(), "lenaRauschen.png");
		 * 
		*/
		//b1 = new KantenFilter(b1);
		b1 = new SalzPfeffer(b1);
		b1 = new MedianFilter(b1);
		ImageUtils.speichern(b1.getDaten(), "lena_S_M.png");
	}
}

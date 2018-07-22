package uebung;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EinfachesBild extends Bild{
	public EinfachesBild(String pfad) throws IOException{
		File imgFile = new File("lena.png");
		BufferedImage img = ImageIO.read(imgFile);
		int breite = img.getWidth();
		int hoehe = img.getHeight();
		daten = new int[hoehe][breite];
		for (int zeile = 0; zeile<hoehe; zeile++){
			for (int spalte = 0; spalte<breite; spalte++){
				daten[zeile][spalte] = img.getRGB(spalte, zeile);
			}
		}
	}

}

package uebung;

public class KantenFilter extends BildDekorierer{

	public KantenFilter(Bild bild) {
		super(bild);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[][] getDaten() {
		return ImageUtils.edgeFilter(bild.getDaten());
	}

}

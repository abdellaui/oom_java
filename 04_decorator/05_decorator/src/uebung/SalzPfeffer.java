package uebung;

public class SalzPfeffer extends BildDekorierer{

	public SalzPfeffer(Bild bild) {
		super(bild);
	}

	@Override
	public int[][] getDaten() {
		return ImageUtils.saltPepper(bild.getDaten());
	}

}

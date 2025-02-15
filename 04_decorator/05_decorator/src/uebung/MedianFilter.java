package uebung;

public class MedianFilter extends BildDekorierer{

	public MedianFilter(Bild bild) {
		super(bild);
	}

	@Override
	public int[][] getDaten() {
		return ImageUtils.medianFilter(bild.getDaten());
	}
	

}

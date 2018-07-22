import java.util.StringTokenizer;

public class NeueHandler extends DatenHandler {


	public boolean isValidFileType(String filename) {
		if(filename.endsWith(".txt")){
			return true;
		}
		return false;
	}

	public DatenObjekt transformData(String filename) {
		// TODO Auto-generated method stub
		StringTokenizer tokn = new StringTokenizer(filename, "|");
		DatenObjekt dobj = new DatenObjekt();
		dobj.setName(tokn.nextToken());
		dobj.setMaxWert(new Integer(tokn.nextToken()));
		dobj.setMinWert(new Integer(tokn.nextToken()));
		dobj.setEroeffnungsWert(new Integer(tokn.nextToken()));
		dobj.setSchlusswert(new Integer(tokn.nextToken()));
		return dobj;
	}

	//public void writeToDB(DatenObjekt obj) {
		// TODO Auto-generated method stub
		
	//}

}

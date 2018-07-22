import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public abstract class DatenHandler {
	public void execute(String filename) throws IOException{
		if(isValidFileType(filename)){
			File f = new File(filename);
			FileReader r = new FileReader(f);
		    BufferedReader br = new BufferedReader(r);
			String fileString;
			while((fileString = br.readLine()) != null){
				DatenObjekt readObj = transformData(fileString);
				//writeToDB(readObj);
				System.out.print(                 readObj.getName());
				System.out.print("            " + readObj.getMaxWert());
				System.out.print("            " + readObj.getMinWert());
				System.out.print("            " + readObj.getEroeffnungsWert());
				System.out.print("            " + readObj.getSchlusswert()+" \n");

			}
			
			br.close();
			r.close();
		
		}
	}
	public abstract boolean isValidFileType(String filename);
	public abstract DatenObjekt transformData(String filename);
	//public abstract void writeToDB(DatenObjekt obj);
	
}

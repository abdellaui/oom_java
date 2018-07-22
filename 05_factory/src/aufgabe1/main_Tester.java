package aufgabe1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class main_Tester {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		MessageDigest md = MessageDigest.getInstance("SHA1");
		System.out.println ("Message digest object info: ");
		System.out.println ("Algorithm = "+ md. getAlgorithm ());
		System.out.println ("Provider = "+ md. getProvider ());
		System.out.println ("toString = "+ md. toString ());
		String input = "Max Mustermann ";
		md.update(input.getBytes());
		byte[] outputSHA1 = md.digest();
		Formatter formatter = new Formatter ();
		for(byte b:outputSHA1) {
		formatter.format ("%02x", b);
		}
		
		System.out.println (formatter);
		
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		String inputMD5 = "Max Mustermann ";
		md.update(inputMD5.getBytes());
		byte[] outputMD5 = md5.digest();
		Formatter formatterMD5 = new Formatter ();
		for(byte b: outputMD5) {
			formatterMD5.format("%02x", b);
		}
		System.out.println (formatterMD5);
	}

}

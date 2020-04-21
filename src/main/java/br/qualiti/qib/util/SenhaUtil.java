package br.qualiti.qib.util;
import java.security.MessageDigest;

public class SenhaUtil {

	public static String geraHash(String senha) {
		String senhaHash = null;
		
		try {
			byte[] bytesOfMessage = senha.getBytes("UTF-8");
	
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] thedigest = md.digest(bytesOfMessage);
			
			senhaHash = new String (thedigest);
		}catch(Exception e) {
		}
	    
		return senhaHash;
	}
	
}

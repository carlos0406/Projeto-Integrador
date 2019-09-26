package uteis;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe utilizada para procedimentos de criptografia de dados.
 * 
 * @author Renan
 *
 */
public class CriptografiaUtils {

	private static MessageDigest md = null;

	static {
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
	}

	private static char[] hexCodes(byte[] text) {
		char[] hexOutput = new char[text.length * 2];
		String hexString;

		for (int i = 0; i < text.length; i++) {
			hexString = "00" + Integer.toHexString(text[i]);
			hexString.toUpperCase().getChars(hexString.length() - 2,
					hexString.length(), hexOutput, i * 2);
		}

		return hexOutput;
	}

	/** Criptografa um texto utilizando MD5. N�o pode ser descriptografado. */
	public static String criptografarMD5(String pwd) {
		if (md != null) {
			return new String(hexCodes(md.digest(pwd.getBytes())));
		}
		return null;
	}

}

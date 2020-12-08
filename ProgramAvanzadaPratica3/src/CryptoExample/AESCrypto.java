package CryptoExample;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;


public class AESCrypto {

	public static void main(String[] args) throws Exception {
		// Generamos una clave de 128 bits adecuada para AES
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		Key key = keyGenerator.generateKey();

		// Alternativamente, una clave que queramos que tenga al menos 16 bytes
		key = new SecretKeySpec("una clave de 16 bytes".getBytes(),  0, 16, "AES");

		
		String texto = "Este es el texto que queremos encriptar";
		System.out.println(texto + "\n");
		
		// Se obtiene un cifrador AES
		Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");

		// Se inicializa para encriptacion y se encripta el texto,
		// que debemos pasar como bytes.
		aes.init(Cipher.ENCRYPT_MODE, key);
		byte[] encriptado = aes.doFinal(texto.getBytes());

		// Se escribe byte a byte en hexadecimal el texto
		System.out.println("Este es el texto encriptado en hexadecimal: \n");
		for (byte b : encriptado) {
			System.out.print(Integer.toHexString(0xFF & b));
		}
		System.out.println();

		// Se iniciliza el cifrador para desencriptar, con la misma clave y se desencripta
		aes.init(Cipher.DECRYPT_MODE, key);
		byte[] desencriptado = aes.doFinal(encriptado);

		// Texto obtenido, igual al original.
		System.out.println("Texto desencriptado que es igual al original: \n");
		System.out.println(new String(desencriptado));

	}

}

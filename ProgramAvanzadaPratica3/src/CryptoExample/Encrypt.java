package CryptoExample;

public class Encrypt {

	public static void main(String[] args) {
		
		//Este sería un ejemplo de encriptación sin librerías
		String texto = "Vamos a encriptar una cadena String";
		int key = 5;
		System.out.println(texto);
		
		char[] chars = texto.toCharArray();
		
		for(char c: chars) {
			c += key;
			System.out.println(c);
		}
		System.out.println(texto);
	}

}

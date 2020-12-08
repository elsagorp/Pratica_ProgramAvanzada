package Pratica4;

import java.util.ResourceBundle;
import java.util.Locale;


public class Translator {
	
	private Locale locale;
	private Locale chLoc = new Locale("ch","CH");
	private Locale enLoc = new Locale("en","US");
	private Locale esLoc = new Locale("es","ES");
	
	public Translator() {
		
	}
	public Locale getLocale() {
		return this.locale;
	}

	
	public String getTraduc(String word) {
		return ResourceBundle.getBundle("Messages", locale).getString(word);
	}
	
	public Locale setLoc(int languag) {
		if(languag == 1) {
			locale = Translator.this.enLoc;
			
		}else if(languag == 2){
			
			locale = Translator.this.esLoc;
			
		}else {
			
			locale = Translator.this.chLoc;
		}
		
		return locale;
	}
	

}

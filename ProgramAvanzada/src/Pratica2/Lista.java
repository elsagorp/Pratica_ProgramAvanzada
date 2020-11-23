package Pratica2;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class Lista  <T extends Hotel>{

	private ArrayList<T> listaH ;
	
	
	 public Lista (ArrayList <T> listaH) {
		 this.listaH = listaH;
	 }
	 public void addHotel(T h) {
		 this.listaH.add(h);
	 }
	 public String consultaHotel() {

		 String s = "List: \n";
		 
		 for(Hotel h:this.listaH) {
			 s = s + "\n" + h.getAtributos();
		 }
		 s = s + "\n";
		 return s;
		 
	 }
	 
	 public String consultaHotel(ResourceBundle sentence) {

		 String s = sentence.getString("Hotels");
		 
		 for(Hotel h:this.listaH) {
			 s = s + "\n" + h.getAtributos(sentence);
		 }
		 s = s + "\n";
		 return s;
		 
	 }
	 public Lista() {
		 
	 }

	 public ArrayList <Hotel> filter(boolean pool, boolean rest) {
		    ArrayList<Hotel> l = new ArrayList<Hotel>();	
		 	
		 	for(Hotel h:listaH) {
		 		if (h.isPool()==pool&& h.isRest()==rest) {
		        	
		        	l.add(h);
		        }
		    }

		    return l;
	 } 
	 
	 public ArrayList<T> addListas(Lista <T> l1,Lista <T> l2){
		 ArrayList<T> res = new ArrayList<T>();
		 for(T h1:l1.getListaH()) {		        	
		        	res.add(h1);
		        }
		 for(T h2:l2.getListaH()) {		        	
	        	res.add(h2);
	        }
		 return res;
	  }
	 public ArrayList<T> getListaH() {
		return this.listaH;
	}
	public void setListaH(ArrayList<T> listaH) {
		this.listaH = listaH;
	}
	
	 
	 public void elimHotel(int pos) {
		 for(int i=0; i<=listaH.size()-1; i++) {
			try{
			 if((pos-1)==i) listaH.remove(i);
			}catch (Exception e) {
				
			}
		 }
		  
	 }
	 public boolean elimHotel(String elim) {
		 for(int i=0; i<listaH.size(); i++) {
			 
			 if (listaH.get(i).getHotelName().equals(elim)) {
				 listaH.remove(i);
				 return true;
			 }
		 }
		 return false;
		  
	 }

}

package Pratica3;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListaHotels  <T extends Hotel> implements IBusqueda<T>{

	private ArrayList<T> listaH ;
	
	
	 public ListaHotels (ArrayList <T> listaH) {
		 this.listaH = listaH;
	 }
	 @Override
	 public void addto(T h) {
		 this.listaH.add(h);
	 }
	 @Override
	 public Object exist(String name) {
		 for(int i=0; i<listaH.size(); i++) {
			 if (listaH.get(i).getHotelName().equals(name)) {
				 return listaH.get(i);
			 }
		 }
		 return null;
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
	 public ListaHotels() {
		 
	 }

	 public Hotel maxCost() {	
		 	Hotel h = new Hotel();
		 	float ma = listaH.get(0).getPrize();
		 	for(int i =0;i<listaH.size();i++) { 
		 		if(ma < Math.max(listaH.get(i).getPrize(), listaH.get(i+1).getPrize()) ) {
		 			ma = Math.max(listaH.get(i).getPrize(), listaH.get(i+1).getPrize()); 
		 		}
		    }
			for(Hotel e:listaH) {
		 		if (e.getPrize()==ma) {
		        	
		        	h  = e;
		        }
		    }
		 	return h;

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
	 
	 public ArrayList<T> addListas(ListaHotels <T> l1,ListaHotels <T> l2){
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

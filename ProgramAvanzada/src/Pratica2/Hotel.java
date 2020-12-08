package Pratica2;

import java.util.ResourceBundle;

public class Hotel {
	
	private String hotelName;
	private String address;
	private String city;
	private int numRoom;
	private int numStars;
	private boolean full;
	private boolean pool;
	private boolean rest;
	
	public Hotel(String hotelName, String address, String city, int numRoom,int numStars, boolean full,boolean pool, boolean rest) {
		
		this.hotelName = hotelName;
		this.address = address;
		this.city = city;
		this.numRoom = numRoom;
		this.numStars = numStars;
		this.full = full;
		this.pool = pool;
		this.rest = rest;

	}
	
	public Hotel() {
		
	}
	

	public String getAtributos() {
		return "Name of the hotel: " + getHotelName() + " \n" +
				"Address: " + getAddress() + " \n" +
				"City: " + getCity() + "\n" +
				"Number of rooms: " + getNumRoom() + " \n" +
				"Number of stars: " + getNumStars() + "\n" +
				"Is full: " + isFull() + "\n";			
				
	}

	public String getAtributos(ResourceBundle sentence) {
		return sentence.getString("HotelName") + getHotelName() + " \n"+
				sentence.getString("Address") + getAddress() + " \n"+
				sentence.getString("City") + getCity()+ "\n" +
				sentence.getString("NumRoom") + getNumRoom() + " \n" +
				sentence.getString("NumStars") + getNumStars() + "\n" +
				sentence.getString("Full") + sentence.getString(isFu())+ "\n";			
				
	}
	public String havePool() {
		if(this.pool == true) return "yes";
				
		else {
				return "no";
				}
	}
	public String haveRest() {
		if(this.rest == true) return "yes";
		
		else {

			return "no";
		}
	}
	
	public boolean isPool() {
		return this.pool;
	}
	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isRest() {
		return this.rest;
	}

	public void setRest(boolean rest) {
		this.rest = rest;
	}

	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelName() {
		return this.hotelName;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNumRoom() {
		return this.numRoom;
	}
	public void setNumRoom(int numRoom) {
		this.numRoom = numRoom;
	}
	public int getNumStars() {
		return this.numStars;
	}
	public void setNumStars(int numStars) {
		this.numStars = numStars;
	}
	public boolean getFull() {
		return this.full;
	}
	public String isFull() {
		if(this.full == true) return "This hotel is full";
		
		else return "This hotel is not full";
	}
	public String isFu() {
		if(this.full == true) return "Fu";
		
		else return "NotFull";
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	
	
}

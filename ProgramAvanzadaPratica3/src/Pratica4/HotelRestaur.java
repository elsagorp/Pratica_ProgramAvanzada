package Pratica4;

import java.util.ResourceBundle;

public class HotelRestaur extends Hotel implements Building{
	
	private boolean restaurTerrace;
	private String name;
	private String typeFood;
	private int numTable;
	private int numStars;
	private int maxCapacity;
	
	public HotelRestaur(String hotelName, String address, String city, int numRoom, int numStarsH, boolean full,boolean pool,boolean rest,float prize,boolean restaurTerrace,String name, String typeFood, int numTable, int numStars, int maxCapacity) {
		super( hotelName, address, city, numRoom, numStars, full,pool,rest,prize);
		this.name = name;
		this.typeFood = typeFood;
		this.numTable = numTable;
		this.numStars = numStars;
		this.maxCapacity = maxCapacity;
		this.restaurTerrace = restaurTerrace;
	}
	
	public String getAtributos() {
		
		return  super.getAtributos() +
				"Name of the restaurant: " + getName() + " \n" +
				"Have terrrace:" + typeRestaur() + "\n" +
				"Type of food: " + getTypeFood() + " \n" +
				"Number of tables: " + getNumTable() + " \n" +
				"Number of stars: " + getNumStarsRest() + " \n" +
				"Maximum capacity: " + getMaxCapacity() + "\n";
				
	}
	
	public String getAtributos(ResourceBundle sentence) {
		return  super.getAtributos(sentence)  +
				sentence.getString("Namerest") + getName() + "\n" +
				sentence.getString("TypeFood") + getTypeFood()+ " \n" +
				sentence.getString("NumTable") + getNumTable() + "\n" +
				sentence.getString("NumStarsRest") + getNumStars()+ " \n" +
				sentence.getString("MaxCapacityRest") + getMaxCapacity()+ " \n" +
				sentence.getString("RestaurTerrace") + sentence.getString(typeRest()) + "\n";
	}
	
	public String typeRestaur() {
		if(this.restaurTerrace == true) return "This restaurant have terrace";
		
		else {

			return "This restaurant dont have terrace";
		}
	}
	
	public String typeRest() {
		if(this.restaurTerrace == true) return "HaveTerrace";
		
		else {

			return "DontHaveTerrace";
		}
	}
	
	public boolean isRestaurTerrace() {
		return this.restaurTerrace;
	}

	public void setRestaurTerrace(boolean restaurTerrace) {
		this.restaurTerrace = restaurTerrace;
	}

	public boolean isRestaur() {
		return this.restaurTerrace;
	}

	public void setRestaur(boolean restaur) {
		this.restaurTerrace = restaur;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeFood() {
		return this.typeFood;
	}
	public void setTypeFood(String typeFood) {
		this.typeFood = typeFood;
	}
	public int getNumTable() {
		return this.numTable;
	}
	public void setNumTable(int numTable) {
		this.numTable = numTable;
	}
	public int getNumStarsRest() {
		return this.numStars;
	}
	public void setNumStars(int numStars) {
		this.numStars = numStars;
	}
	public int getMaxCapacity() {
		return this.maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
}

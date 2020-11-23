package Pratica3;

import java.util.ResourceBundle;

public class HotelRestPool extends Hotel implements Building{

	private String name;
	private String typeFood;
	private int numTable;
	private int numStars;
	private int maxCapacity;
	private boolean restaurTerrace;
	private boolean outpool;
	private int numHamm;
	private int maxCapacityPool;

	public HotelRestPool(String hotelName1, String address1, String city1, int numRoom1, int numStars1, boolean full1,boolean pool,boolean rest,boolean restaurTerrace,String name, String typeFood, int numTable, int numStars, int maxCapacity,boolean pool1, int numHamm1, int maxCapacityPool) {

		super(hotelName1, address1, city1,  numRoom1, numStars1, full1, pool,rest);
		this.name = name;
		this.restaurTerrace = restaurTerrace;
		this.typeFood = typeFood;
		this.numTable = numTable;
		this.numStars = numStars;
		this.maxCapacity = maxCapacity;
		this.outpool = pool1;
		this.numHamm = numHamm1;
		this.maxCapacityPool = maxCapacityPool;

	}

	public String getAtributos() {
		return  super.getAtributos() +
				"Name of the restaurant: " + getName() + " \n" +
				"Have terrrace:" + typeRestaur() + "\n" +
				"Type of food: " + getTypeFood() + " \n" +
				"Number of tables: " + getNumTable() + " \n" +
				"Number of stars: " + getNumStarsRest() + " \n" +
				"Maximum capacity: " + getMaxCapacity() + "\n" +
				"Pool: " + typePool() + "\n"  +
				"Number of hammocks: " + this.numHamm + " \n" +
				"Maximum capacity: " + this.maxCapacity + "\n";

	}

	public String getAtributos(ResourceBundle sentence) {
		return  super.getAtributos(sentence)  +
				sentence.getString("Namerest") + getName() + "\n" +
				sentence.getString("TypeFood") + getTypeFood()+ " \n" +
				sentence.getString("NumTable") + getNumTable() + "\n" +
				sentence.getString("NumStarsRest") + getNumStars()+ " \n" +
				sentence.getString("MaxCapacityRest") + getMaxCapacity()+ " \n" +
				sentence.getString("RestaurTerrace") + sentence.getString(typeRest()) + "\n" +

				sentence.getString("Outpool") + sentence.getString(typePo()) + "\n" +
				sentence.getString("NumHamm") + getNumHamm()+ " \n" +
				sentence.getString("MaxCapacityPool") + getMaxCapacityPool() + "\n";
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
		return restaurTerrace;
	}

	public void setRestaurTerrace(boolean restaurTerrace) {
		this.restaurTerrace = restaurTerrace;
	}

	public boolean isOutpool() {
		return outpool;
	}

	public void setOutpool(boolean outpool) {
		this.outpool = outpool;
	}

	public String typePool() {
		if(this.outpool == true) return "This hotel have outdoor pool";

		else {

			return "This hotel have indoor pool";
		}
	}
	public String typePo() {
		if(this.outpool == true) return "OutdoorPool";

		else {

			return "IndoorPool";
		}
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
	public boolean isPool() {
		return this.outpool;
	}
	public void setPool(boolean pool) {
		this.outpool = pool;
	}
	public int getNumHamm() {
		return this.numHamm;
	}
	public void setNumHamm(int numHamm) {
		this.numHamm = numHamm;
	}
	public int getMaxCapacityPool() {
		return this.maxCapacityPool;
	}
	public void setMaxCapacityPool(int maxCapacityPool) {
		this.maxCapacityPool = maxCapacityPool;
	}

}

package Pratica3;

import java.util.ResourceBundle;

public class HotelPool extends Hotel implements Building{

	private int numHamm;
	private int maxCapacity;
	private boolean outpool;
	
	
	public HotelPool(String hotelName1, String address1, String city1, int numRoom1, int numStars1, boolean full1,boolean pool,boolean rest, float prize,boolean outpool, int numHamm1, int maxCapacity1) {
		
		super(hotelName1, address1, city1,  numRoom1, numStars1, full1,pool,rest,prize);
		this.outpool = outpool;
		this.numHamm = numHamm1;
		this.maxCapacity = maxCapacity1;
		
	}
	

	public String getAtributos() {
		return  super.getAtributos()  +
				"Pool: " + typePool() + "\n"  +
				"Number of hammocks: " + this.numHamm + " \n" +
				"Maximum capacity: " + this.maxCapacity + "\n";
				
	}
	
	public String getAtributos(ResourceBundle sentence) {
		return  super.getAtributos(sentence)  +
				sentence.getString("Outpool") + sentence.getString(typePo()) + "\n" +
				sentence.getString("NumHamm") + getNumHamm()+ " \n" +
				sentence.getString("MaxCapacityPool") + getMaxCapacityPool() + "\n";
	}

	public int getNumHamm() {
		
		return this.numHamm;
	}

	public void setNumHamm(int numHamm) {
		this.numHamm = numHamm;
	}

	public int getMaxCapacityPool() {
		return this.maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public boolean isOutpool() {
		return this.outpool;
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
	

	
}

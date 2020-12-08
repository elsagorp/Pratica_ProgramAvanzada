package Pratica4;

public class Habitacion extends Hotel{
    private int num;
    private int cap;

    
	public Habitacion(String hotelName, String address, String city, int numRoom,int numStars, boolean full,boolean pool, boolean rest,float prize, int num, int cap) {
		super(hotelName, address, city,  numRoom, numStars, full,pool,rest,prize);
		this.num = num;
		this.cap = cap;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}


	
}

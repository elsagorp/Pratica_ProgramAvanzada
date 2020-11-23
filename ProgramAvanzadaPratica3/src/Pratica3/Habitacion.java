package Pratica3;

public class Habitacion extends Hotel{
    private int num;
    private int cap;
    private float prize;
    
	public Habitacion(String hotelName, String address, String city, int numRoom,int numStars, boolean full,boolean pool, boolean rest, int num, int cap,float price) {
		super(hotelName, address, city,  numRoom, numStars, full,pool,rest);
		this.num = num;
		this.cap = cap;
		this.prize = price;
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

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}
	
}

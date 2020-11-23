package Pratica3;

public class Room {
	private int num;
	private int cap;
	private String typeRoom;
	private double price;
	
	public Room(int num, int cap,String typeRoom,double price) {
		this.num = num;
		this.cap = cap;
		this.typeRoom = typeRoom;
		this.price = price;
	}

	public boolean conditionCap(int capac) {
		return this.getCap()==capac;
		
	}
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCap() {
		return this.cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getTypeRoom() {
		return this.typeRoom;
	}

	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

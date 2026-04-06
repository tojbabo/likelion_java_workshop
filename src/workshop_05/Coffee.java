package workshop_05;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee() {}
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		
		return this.name+"\t"+this.price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

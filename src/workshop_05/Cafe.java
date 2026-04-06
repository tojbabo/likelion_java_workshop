package workshop_05;

public class Cafe {
	private Coffee[] coffeeList;
	private int index;
	public Cafe() {}
	public int totalPrice() {
		int sum = 0;
		for(Coffee c : this.coffeeList) {
			sum += c.getPrice();
		}
		return sum;
	}
	public void setCoffee(Coffee coffee) {
		this.index += 1;
		Coffee[] templist = new Coffee[index];
		
		if(this.index == 1) {
			templist[0] = coffee;
		}
		else {
			for(int i = 0 ; i<this.index-1;i++) {
				templist[i] = this.coffeeList[i];
			}
			templist[index-1] = coffee;
		}
		coffeeList = templist;
		
		
	}
	public Coffee[] getCoffeeList() {
		return this.coffeeList;
	}
	

}

package workshop_06;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	public void addOil(int oil) {
		this.restOil += oil;
	}
	public void moving(int distance) {
		
	}
	public void addWeight(int weight) {
		this.curWeight += weight;
		
	}
	@Override
	public String toString() {
		return "";
	}
	
	
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}

}

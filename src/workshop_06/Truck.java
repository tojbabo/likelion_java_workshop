package workshop_06;

public class Truck extends Car {

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getEfficiency() {
		int weight = this.getCurWeight();
				
		return super.getEfficiency() - (weight/5 * 0.2);
	}
	@Override
	public void moving(int distance) {
		double usedoil = this.calcOil(distance);
		this.addOil((int)-usedoil);
		
	}
	private double calcOil(int distance) {
		return distance/this.getEfficiency();
	}
	public int getCost(int distance) {
		double useoil = this.calcOil(distance);
		
		return (int)useoil*3000;
	}
	@Override
	public String toString() {
		return this.getMaxWeight() + "\t\t"+this.getOilTankSize()+"\t\t"+this.getRestOil()+"\t\t"+this.getCurWeight()+"\t\t"+this.getEfficiency();
	}
	

	

}

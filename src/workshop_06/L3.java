package workshop_06;

public class L3 extends Car2 implements Temp {

	public L3() {
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go(int distance) {
		// TODO Auto-generated method stub
		this.setOilSize((int)-(distance/10));
		this.setDistance(distance);
		
	}

	@Override
	public void setOil(int oilSize) {
		this.setOilSize(oilSize);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		return (int)this.getDistance()/10;
	}
	
	public String toString(){
		return this.getName()+"\t\t"+this.getEngine()+"\t\t"+this.getOilTank()
		+"\t\t"+this.getOilSize()+"\t\t"+this.getDistance()+"\t\t"+this.getTempGage();
	}

}

package workshop_06;

public class L5 extends Car2 implements Temp {

	public L5() {
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		return (int)this.getDistance()/5;
	}


	@Override
	public void go(int distance) {
		// TODO Auto-generated method stub
		this.setOilSize((int)-(distance/8));
		this.setDistance(distance);
		
	}

	@Override
	public void setOil(int oilSize) {
		this.setOilSize(oilSize);
		// TODO Auto-generated method stub
		
	}
	public String toString(){
		return this.getName()+"\t\t"+this.getEngine()+"\t\t"+this.getOilTank()
				+"\t\t"+this.getOilSize()+"\t\t"+this.getDistance()+"\t\t"+this.getTempGage();
	}

}

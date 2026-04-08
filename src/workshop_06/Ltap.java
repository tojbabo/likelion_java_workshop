package workshop_06;

public class Ltap extends Mobile {
	
	public Ltap() {}

	public Ltap(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		this.setBatterySize(this.getBatterySize()-(time*10));
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int charge(int time) {
		this.setBatterySize(this.getBatterySize()+(time*10));
		// TODO Auto-generated method stub
		return 0;
	}

}

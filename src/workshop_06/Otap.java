package workshop_06;

public class Otap extends Mobile {
	
	

	public Otap() {
		// TODO Auto-generated constructor stub
	}

	public Otap(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		this.setBatterySize(this.getBatterySize()-(time*12));
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int charge(int time) {
		this.setBatterySize(this.getBatterySize()+(time*8));
		// TODO Auto-generated method stub
		return 0;
	}

}

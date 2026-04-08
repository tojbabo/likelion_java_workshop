package workshop_06;

public class Test03 {

	public static void main(String[] args) {
		Car2[] cars = {
				new L3("L3","1500",50,25,0), 
				new L5("L5","2000",70,35,0)};
		
		System.out.printf("vehicleName\tengineSize\toilTank\t\toilSize\t\tdistance\ttemperature\n");
		System.out.printf("-------------------------------------------------------------------------------------------------\n");
		for(int i = 0 ; i < 2;i ++) {
			System.out.println(cars[i]);
		}
		
		System.out.printf("\n25 주유\n");
		System.out.printf("-------------------------------------------------------------------------------------------------\n");
		for(int i = 0 ; i < 2;i ++) {
			cars[i].setOil(25);
			System.out.println(cars[i]);
		}
		
		System.out.printf("\n80 주행\n");
		System.out.printf("-------------------------------------------------------------------------------------------------\n");
		for(int i = 0 ; i < 2;i ++) {
			cars[i].go(80);
			System.out.println(cars[i]);
		}
	}

}

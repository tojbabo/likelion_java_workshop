package workshop_06;

public class Test01 {

	public static void main(String[] args) {

		
		Truck car = new Truck(1000, 100, 5);
		System.out.printf("최대적재중량\t오일탱크크기\t잔여오일량 \t현재적재중량\t연비\n");
		System.out.printf("=========================================================================\n");
		System.out.println(car.toString());
		
		
		System.out.println("\n50L 주유 후");
		car.addOil(50);
		System.out.println(car.toString());
		
		System.out.println(" \n50Km 주행 후");
		car.moving(50);
		System.out.println(car.toString());
		
		System.out.println("\n100Kg 적재 후");
		car.addWeight(100);
		System.out.println(car.toString());

		System.out.println("\n30Km 주행 후");
		car.moving(30);
		System.out.println(car.toString());
		
		System.out.printf("\n요금: %d원\n",car.getCost(30));


	}

}

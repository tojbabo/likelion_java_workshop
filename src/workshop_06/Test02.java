package workshop_06;

public class Test02 {

	public static void main(String[] args) {
		Mobile a = new Ltap("Ltap",500,"AP-01");
		Mobile b = new Otap("Otap",1000,"AND-20");
		
		System.out.println("Mobile\tBattery\t OS");
		System.out.println("================================");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\n10분 충전");
		a.charge(10);
		b.charge(10);
		System.out.println("Mobile\tBattery\t OS");
		System.out.println("================================");
		System.out.println(a);
		System.out.println(b);

		System.out.println("\n5분 통화");
		a.operate(5);
		b.operate(5);
		System.out.println("Mobile\tBattery\t OS");
		System.out.println("================================");
		System.out.println(a);
		System.out.println(b);
		


	}

}

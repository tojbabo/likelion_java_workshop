package workshop_01;

public class Test01 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		
		System.out.println("이름은 "+name);
		System.out.println("나이는 "+age+" 이고 주소는 "+address);

		System.out.print("이름은 "+name);
		System.out.print("\n나이는 "+age+" 이고 주소는 "+address);
		System.out.print("\n");
		
		System.out.printf("이름은 %s\n", name);
		System.out.printf("나이는 %d 이고 주소는 %s\n", age, address);
		
		long mynum = 950321;
		long myber = 1071215;
		System.out.println("나의 주민번호: "+mynum+myber);
		
		
		int n = 10;
		int n2 = 20;
		
		int temp = n;
		n = n2;
		n2 = temp;
		
		System.out.println("n 값은 " + n);
		System.out.println("n2값은 " + n2);

	}

}

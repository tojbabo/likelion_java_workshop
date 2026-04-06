package workshop_02;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("1.이름을 입력해보시오: ");
		String s = scan.next(); // 문자열 읽기
		System.out.print("2.나이를 입력해보시오: ");
		int n = scan.nextInt(); // 정수 입력 받기

		System.out.println("이름은 "+s+", 나이는 "+n+" 입니다");
		
	}

}

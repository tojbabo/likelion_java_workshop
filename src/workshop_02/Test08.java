package workshop_02;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("1.정수 입력하세요: ");
		int n1 = scan.nextInt(); // 문자열 읽기
		System.out.print("2.정수 입력하세요: ");
		int n2 = scan.nextInt(); // 정수 입력 받기

		System.out.println("정수 "+n1+"과 정수 "+n2+"의 합계: "+(n1+n2));
		
	}

}

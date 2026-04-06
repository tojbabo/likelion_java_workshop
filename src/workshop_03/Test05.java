package workshop_03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = scan.nextInt();
		
		int a = 0;
		int count = 0;
		for(int i = 1 ;i<=num;i++) {
			if(i%2 == 0) {
				a+= i;
				count++;
			}
		}
		
		System.out.println("총합:"+a);
		System.out.println("평균값:"+((float)a/count));
		
		

	}

}

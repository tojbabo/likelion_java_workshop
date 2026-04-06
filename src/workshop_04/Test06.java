package workshop_04;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수:");
		int count = scan.nextInt();
		
		int[] mans = new int[count];
		
		for(int i = 0 ; i< count;i++){
			System.out.print("사람 "+(i+1)+":");
			mans[i] = scan.nextInt();			
		}
		
		int maxv = -1;
		for(int m: mans) {
			if(maxv< m) {
				maxv = m;
			}
		}
		System.out.println("최댓값은 "+maxv+"입니다.");
		
		

	}

}

package workshop_04;

import java.util.Random;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr3 = new int[5];
		

		Random r = new Random();
		r.setSeed(10);
		
		for(int i = 0 ; i< 5;i++){
			arr3[i] = r.nextInt(1, 10);
		}
		
		int sum = 0;
		for(int n : arr3) {
			System.out.print(n+" ");
			sum += n;
		}
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("avg="+(float)sum/5);
		
		
		

	}

}

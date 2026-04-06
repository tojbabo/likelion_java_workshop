package workshop_04;

import java.util.Random;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=2) {
			System.out.printf("다시 입력하세요\n");
			return;
		}
		
		
		for(String s: args) {
			try {
				int check = Integer.parseInt(s);
				if(check<1||check>5) {
					System.out.printf("숫자를 확인 하세요\n");
					return;
				}
				
			}
			catch(NumberFormatException e){
			}		
		}

		Random ran = new Random();
		ran.setSeed(1234);
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		int[][] array = new int[row][];
		for(int j = 0 ; j<row;j++) {
			array[j] = new int[col];
			int[] r = array[j];
			for(int i = 0 ; i<col;i++) {
				r[i] = ran.nextInt(1,6);
			}
		}
		
		int sum = 0;
		for(int[] l: array) {
			for(int item: l) {
				System.out.printf("%d ",item);
				sum += item;
			}
			System.out.printf("\n");
		}
		System.out.printf("\nsum=%d\n", sum);
		System.out.printf("avg=%f\n", (float)sum/(row*col));
		
	}

}

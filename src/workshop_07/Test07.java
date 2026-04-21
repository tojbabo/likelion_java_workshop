package workshop_07;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test07 {

	static public void func(int ... n){
		int[] a = n;
		for(int j :a) {
			
			System.out.println(j);
		}
		for(int i : n) {
			System.out.print(i);
		}
		
		System.out.print(Arrays.toString(n));
	}
	public static void main(String[] args) {
		String mesg = "100/200";
		StringTokenizer st = new StringTokenizer(mesg,"/");
		
		int sum = 0;
		int count = st.countTokens();
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
			
		}
		
		
		
		System.out.println("정수값 합계: "+sum);
		System.out.println("정수값 평균: "+sum/count);
		
		
		func(1,2,3);
		
	}

}

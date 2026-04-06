package workshop_04;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		int count = arr.length;
		for (int item: arr) {
			sum+= item;
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+sum/count);
		
	}
}

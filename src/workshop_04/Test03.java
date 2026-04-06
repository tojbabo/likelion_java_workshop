package workshop_04;

public class Test03 {
	public static void main(String[] args) {
		int [][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int sum = 0;
		int count = 0;
		for(int[] line: arr2) {
			count += line.length;
			for(int number: line) {
				sum += number;
				
			}
		}
		
		System.out.println("total="+sum);
		System.out.println("average="+(float)sum/count);
	}

}

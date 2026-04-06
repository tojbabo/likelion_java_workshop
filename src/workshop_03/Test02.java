package workshop_03;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i = 1; i <= 20; i++){
			if(i%2 == 0) continue;
			else if(i%3 ==0) continue;
			sum += i;
			
		}
		System.out.println("sum = "+sum);
		

	}

}

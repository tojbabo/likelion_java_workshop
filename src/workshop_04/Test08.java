package workshop_04;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= {99,34,67,22,11,9};
		
		int max = score[0];
		int min = score[0];
		
		for(int d : score) {
			if(max<d) {
				max = d;
			}
			if(min>d) {
				min = d;
			}
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	}

}

package workshop_07;

import java.util.StringTokenizer;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4,2,3,6,8";
		StringTokenizer st = new StringTokenizer(str,",");
		
		int sum = 0;
		while(true) {
			if(st.hasMoreTokens()) {
				String token = st.nextToken();
				sum += Integer.parseInt(token);
				
			}
			else {
				break;
			}
		}
		
		System.out.println(sum);
		

	}

}

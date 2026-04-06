package workshop_03;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inx = 21;
		if(inx > 10 && inx < 20) {
			System.out.println("1. true");
		}
		
		char ch1 = ' ';
		if(ch1 != ' ' && ch1 != '\t' ) {
			System.out.println("2. true");
		}
		char ch2 = 'z';
		if(ch2 == 'x' || ch2 == 'X' ) {
			System.out.println("3. true");
		}

		char ch3 = 's';
		if(ch3 >= '0' && ch3 <= '9' ) {
			System.out.println("4. true");
		}
		char ch4 = '1';
		if((ch4>='A' && ch4<='Z')||(ch4>='a' && ch4 <='z')) {
			System.out.println("5. true");
		}
		int year = 204;
		if(year%400 == 0 || (year%4 == 0 && year%100 !=0)){
			System.out.println("6. true");
		}
		boolean powerOn = true;
		if(!powerOn) {
			System.out.println("7. true");
		}
	}

}

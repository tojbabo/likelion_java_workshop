package workshopw_07;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=3) {
			System.out.printf("다시 입력 하세요\n");
		}
		else {
			int num = Integer.parseInt(args[0]);
			String operate = args[1];
			int ber = Integer.parseInt(args[2]);
			double result = 0.0;
			switch(operate) {
			case "+":
				result = Calculator.plus(num,ber);
				break;
			case "-":
				result = Calculator.minus(num,ber);
				break;
			case "x":
				result = Calculator.multiplication(num,ber);
				break;
			case "/":
				result = Calculator.divide(num,ber);
				break;
			default:
				break;

				
			}
			System.out.printf("결과: %.1f\n",result);
			
		
		}

	}

}

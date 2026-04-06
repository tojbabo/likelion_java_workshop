package workshop_05;

public class Test05 {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(args[0]);
		if(number <5 || number > 10) {
			System.out.println("다시 입력하세요");
		}
		else {
			int num = Calc.calculate(number);
			System.out.println("결과:"+num);
		}

	}

}

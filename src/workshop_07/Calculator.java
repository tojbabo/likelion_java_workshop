package workshop_07;

public class Calculator {
	public static double plus(int a, int b) {
		return (double)a+b;
	}
	public static double minus(int a, int b) {
		return (double)a-b;
	}
	public static double multiplication(int a, int b) {
		return (double)a*b;
	}
	public static double divide(int a, int b) {
		double result = 0.0;
		try {
			result = a/b;
			
		} catch (Exception e){
			System.out.println(e.getMessage()+"이 발생 하였습니다. 다시 입력해 주세요");
		}
			
		
		return result;
		
	}
	

}

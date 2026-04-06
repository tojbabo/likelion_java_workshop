package workshop_05;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salay = Integer.parseInt(args[0]);
		
		Company mycom = new Company(salay);
		System.out.printf("연 기본급 합: %.1f 세후: %.1f\n", mycom.getIncome(), mycom.getAfterTaxIncome());
		System.out.printf("연 보너스 합: %.1f 세후: %.1f\n", mycom.getBonus(), mycom.getAfterTaxBonus());
		System.out.printf("연 지급액 합: %.1f\n", (mycom.getAfterTaxBonus()+mycom.getAfterTaxIncome()));

	}

}

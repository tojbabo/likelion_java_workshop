package workshop_05;

public class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;

	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(double salary) {
		this.salary = salary;
		this.bonus = (0.2*salary)*4;
		this.income = this.salary*12;
		this.afterTaxIncome = 0.9 * this.income;
		this.afterTaxBonus = 0.945 * this.bonus;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getAfterTaxIncome() {
		return afterTaxIncome;
	}
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus() {
		return afterTaxBonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	

}

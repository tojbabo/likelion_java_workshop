package workshop_05;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculatedInterest() {
		return this.balance * this.interestRate/100;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		if(money > this.balance) {
			System.out.println("출금할 수 없습니다.");
		}
		else {
			this.balance -= money;
		}
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}

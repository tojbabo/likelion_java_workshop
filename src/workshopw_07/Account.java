package workshopw_07;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return this.getBalance()* this.getInterestRate() / 100;
		
	}
	public void deposit(double money) throws AccountException {
		if(money<0) {
			throw new AccountException("입금 금액이 0보자 적습니다.");
		}
		double nowmoney = this.getBalance();
		this.setBalance(nowmoney + money);
	}
	public void withdraw(double money) throws AccountException {
		double nowmoney = this.getBalance();
		if(nowmoney < money || money < 0) {
			throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		this.setBalance(nowmoney - money);
	}
	public String toString() {
		return "계좌정보:\t" +this.getAccount()+"\t"+this.getBalance()+"\t"+this.getInterestRate();
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}

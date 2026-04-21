package workshop_07;

public class Test02 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Account account;
		account = new Account("441-0290-1203",500000,7.3);
		System.out.println(account);
		try { account.deposit(-10);
		} catch(AccountException e) { System.out.println(e.getMessage());}

		try { account.withdraw(600000);
		} catch(AccountException e) { System.out.println(e.getMessage());}
		System.out.println("이자: "+account.calculateInterest());
		
		
		

	}

}

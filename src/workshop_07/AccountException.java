package workshop_07;

public class AccountException extends Exception {
	private String msg;
	public AccountException(String mesg) {
		this.msg = mesg;
	}
	public String getMessage() {
		return this.msg;
	}

}

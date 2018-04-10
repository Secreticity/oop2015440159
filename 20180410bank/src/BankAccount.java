
public class BankAccount {

	private int accountNumber;
	private String owner;
	private int balance;
	
	public void setANumber(int account) {
		this.accountNumber = account;
	}
	public void setName(String name) {
		this.owner = name;
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	public String toString() {
		return "("+accountNumber+") Mr./Ms."+owner+", your balance is : " + this.balance + ".";
	}
	//owner: string
	//accountNumber: int
	//balance: int
	
	//methods:
	//deposit()
	//withdraw()
	
}

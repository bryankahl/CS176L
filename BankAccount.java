
public class BankAccount {
	
	private static String account_name;
	private double balance;
	private double deposit;
	private double withdraw;
	
	public BankAccount() {
		account_name = "Bryan Kahl";
		balance = 0;
		
	}
	public BankAccount(double accountBalance) {
		balance = accountBalance;
	}
	public BankAccount(double inputDeposit, double inputWithdraw) {
		deposit = inputDeposit;
		withdraw= inputWithdraw;
		
	}
	public double enterDeposit(double deposit) {
		return balance = balance + deposit;
	}
	public void setDeposit() {
		this.deposit = enterDeposit(deposit);
	}
	public double enterWithdraw(double withdraw) {
		return balance = balance - withdraw;
	}
	public void setWitdraw() {
		this.withdraw = enterWithdraw(withdraw);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		BankAccount Bryan = new BankAccount();
		Bryan.enterDeposit(40);
		Bryan.enterWithdraw(30);
		System.out.println("Your account name is: " + account_name);
		System.out.println("Your current balance is: " + Bryan.getBalance());

	}

}

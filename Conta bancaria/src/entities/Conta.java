package entities;

public class Conta {
	private long account_number;
	private String titular_name;
	private double balance;
	
	public Conta(long account_number, String titular_name) {
		this.account_number = account_number;
		this.titular_name = titular_name.trim();
	}
	
	public Conta(long account_number, String titular_name, double initial_balance) {
		this.account_number = account_number;
		this.titular_name = titular_name.trim();
		deposit(initial_balance);
	}
	
	public long getAccount_number() {
		return account_number;
	}
	public String getTitular_name() {
		return titular_name;
	}
	public void setTitular_name(String titular_name) {
		this.titular_name = titular_name.trim();
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit (double value) {
		this.balance+=value;
	}
	
	public void withdraw (double value) {
		this.balance-=(value+5.0);
	}
	
	public String toString() {
		return("Account " 
				+ getAccount_number() 
				+ ", Holder: " 
				+ getTitular_name() 
				+ ", Balance: $" 
				+ getBalance());
	}
}

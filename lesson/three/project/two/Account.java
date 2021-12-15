package lesson.three.project.two;


/**
 * A class that represents an employees account.
 * @author mera
 *
 */


public class Account {
	
	private AccountType accountType;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double balance) {
		
		employee = emp;
		this.accountType = acctType;
		this.balance = balance;
	}

	public Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	
	public void makeDeposit(double deposit) {
		
		this.balance += deposit;
		
	}

	public boolean makeWithdrawal(double amount) {
		
		if(this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
		
	}
	
	//setter methods
	/*
	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}
	
	public void setAccountType(AccountType accountType) {
		
		this.accountType = accountType;
	}
	*/
	
	//getter methods
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public AccountType getAccountType() {
		
		return this.accountType;
	}
	
	public String toString() {
		return "Account Type: " + accountType.getAccountType() + "\nCurrent bal: " + balance + "\n";
	}

	


}

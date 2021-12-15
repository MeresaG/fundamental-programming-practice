package lesson.three.project.two;


import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		

		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public void deposit(AccountType acctType, double amt) {
		
		if(acctType == AccountType.SAVINGS) {
			savingsAcct.makeDeposit(amt);
		}
		
		else if(acctType == AccountType.CHECKING) {
			checkingAcct.makeDeposit(amt);
		}
		
		else {
			retirementAcct.makeDeposit(amt);
		}
		
	}

	public boolean withdraw(AccountType acctType, double amt) {
		
		boolean status = false;
		if(acctType == AccountType.SAVINGS) {
			status = savingsAcct.makeWithdrawal(amt);
		}
		
		else if(acctType == AccountType.CHECKING) {
			status = checkingAcct.makeWithdrawal(amt);
		}
		
		else {
			status = retirementAcct.makeWithdrawal(amt);
		}
		
		return status;
		
	}

	public String getFormattedAcctInfo() {
		
		return "ACCOUNT INFO FOR " + this.getName() + "\n" + checkingAcct.toString() + savingsAcct.toString() + retirementAcct.toString();
	}
	
	//getter methods for name and hireDate
	public String getName() {
		
		return name;
		
	}
	
	public LocalDate gethireDate() {
		
		return hireDate;
	}

}



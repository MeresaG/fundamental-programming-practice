package lesson.three.project.two;


public enum AccountType { 
	
	CHECKING("checking"), 
	SAVINGS("savings"),
	RETIREMENT("retirement");
	
	private String accountType;
	private AccountType(String accountType) {
		
		this.accountType = accountType;
		
	}
	
	public String getAccountType() {
		
		return this.accountType;
	}
	
}
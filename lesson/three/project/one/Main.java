package lesson.three.project.one;

/**
 * A main class that creates Employee object, creates ,
 * all account types and displays the account data in the consol.
 * @author mera
 *
 */

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee =  new Employee("Meresa", "Mera", 8000.0, 2021, 11, 1);
		Account[] account =  new Account[3]; 
		
				
		account[0] = new Account(employee, AccountType.SAVINGS, 300);
		account[1] = new Account(employee, AccountType.CHECKING, 300);
		account[2] = new Account(employee, AccountType.RETIREMENT, 300);
		
		for(int i = 0; i < account.length; i++) {
			
			System.out.println(account[i].toString());
			
		}
		
		
	}

}

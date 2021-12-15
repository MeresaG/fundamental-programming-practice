package lesson.three.project.two.main;
import lesson.three.project.two.Employee;

import java.util.Scanner;

public class Main {
	
	Employee emps;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee("Jim Daley", 2000, 9, 4);

		emps.createNewChecking(10500);
		emps.createNewSavings(1000);
		emps.createNewRetirement(9300);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("See a report of all account balances? (y/n)");
		
		char input = sc.next().charAt(0);
		
		if(input == 'y') {
			
			System.out.println(emps.getFormattedAcctInfo());
			
		}
		
		else
			sc.close();
	}

}

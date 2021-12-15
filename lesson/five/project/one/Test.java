package lesson.five.project.one;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor(10, "Meresa", 6000, 2021, 10, 1);
		department[1] = new Professor(10, "Aregawi", 5000, 2020, 1, 5);
		department[2] = new Professor(10, "Yemane", 7000, 2019, 8, 23);
		department[3] = new Secretary(200, "Heran", 3000, 2014, 10, 15);
		department[4] = new Secretary(200, "Emebet", 2000, 2016, 3, 11);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to see the sum of all salaries in the department Y/N?");
		char input = sc.nextLine().charAt(0);
		
		if(input == 'Y') {
			double sum = 0;
			for(DeptEmployee e : department) {
				sum += e.computeSalary();
			}
			System.out.println("The sum of all salaries is " + sum);
		}
		
		
		

	}

}

package lesson.four.project.five;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char input;
		String stringToReverse;
		
		while(true) {
			
			System.out.println("Enter a string to reverse");
			
			stringToReverse = sc.nextLine();
			
			reverseString(stringToReverse);
			
			System.out.println("Do you want to continue playing with reversing a string y/n?");
			input =  sc.nextLine().charAt(0);
			
			if (input == 'n') {
				break;
			}
			
		} 
		
		sc.close();

	}
	
	public static void reverseString(String stringToReverse) {
		
		for( int i = stringToReverse.length() - 1; i >= 0; i --) {
			
			System.out.print(stringToReverse.charAt(i));
		}
		
		System.out.println();
		
		
	}

}

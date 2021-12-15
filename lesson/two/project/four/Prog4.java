package lesson.two.project.four;

import java.util.Scanner;

/**
 * Programming assignment 4 of lesson two. 
 * @author mera
 *
 */

public class Prog4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter a numer to check for prime number:");
			int input = sc.nextInt();
			
			if(input <= 0) {
				
				break;
				
			}
			
			else {			
				
				boolean status = isPrime(input);
				
				if(status) {
					
					System.out.println("Prime");
				}
				
				else
					System.out.println("Not Prime");
				
			}
							
		}
		
		sc.close();
		
	}
	
	public static boolean isPrime(int n) {
		
		for(int i = 2; i <= (n/2) ; i++ ) {
			
			if(n % i == 0)
				return false;			
			
		}
		
		return n > 1;
		
	}

}

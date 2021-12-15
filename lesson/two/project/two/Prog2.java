package lesson.two.project.two;

import static java.lang.Math.*;
/**
 * Programming assignment 2 of lesson two. 
 * @author mera
 *
 */
public class Prog2 {
	
	public static void main(String[] args) {
		
		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);
		System.out.println("Math.pow("+ Double.toString(PI) +", " + Integer.toString(x) + ") = " + Double.toString(computePower(PI, x)));
		System.out.format("Math.pow(" +String.valueOf(y) + " , " +  String.valueOf(PI) + ") = " + String.valueOf(computePower(y, PI)));
		
		
	}
	
	public static double computePower(double base, double exponent) {
		
		return pow(base, exponent);
	}

}

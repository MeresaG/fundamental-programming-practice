package lesson.two.project.three;

import static java.lang.Math.*;
/**
 * Programming assignment 3 of lesson two. 
 * @author mera
 *
 */

public class Prog3 {
	
	public static void main(String[] args) {
		
		float var1 = (float)1.27;
		float var2 = 3.881f;
		float var3 = 9.6f;
		
		
		//the sum of the floats as an integer, obtained by casting the sum to type int
		
		System.out.println("Sum = " + Integer.toString((int)(var1 + var2 + var3)));
		
		/*
		 * the sum of the floats as an integer, obtained by rounding the sum to the nearest 
		 * integer, using the Math.round function
		*/
		
		System.out.println("Sum = " + Integer.toString((int)round(var1 + var2 + var3)));
		
		
	}

}

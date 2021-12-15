package lesson13.recursion.project.one;

public class Exponential {

	public double power(double base, int exponent) {
		
		if(exponent == 0) {
			return 1;
		}
		
		return base * power(base, exponent -1);
		
	}
	
	public static void main(String[] args) {
		
		Exponential exp = new Exponential();
		System.out.println(exp.power(2, 10));
		

	}

}

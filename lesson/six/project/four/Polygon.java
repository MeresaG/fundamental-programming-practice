package lesson.six.project.four;

public interface Polygon {

	public double[] getArrayOfSides();
	
	public static double sum(double[] arr) {
		
		double sum = 0;
		for(double d : arr) {
			sum += d; 
		}
		
		return sum;
		
	}
	
	public default double computePerimeter() {
		
		return sum(getArrayOfSides());
		
	}
	
}

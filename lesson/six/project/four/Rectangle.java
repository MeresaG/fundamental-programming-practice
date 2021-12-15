package lesson.six.project.four;

public class Rectangle implements Polygon{
	
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
		
	}
	
	@Override
	public double[] getArrayOfSides() {
		
		
		return new double[] { width, width, height, height};
	}
	

}

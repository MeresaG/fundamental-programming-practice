package lesson.six.project.four;

public class Square implements Polygon{
	
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	@Override
	public double[] getArrayOfSides() {
		
		return new double[] {side, side, side, side};
		
	}
	
	

}

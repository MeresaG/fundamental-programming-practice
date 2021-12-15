package lesson12.exception.project.one;

public class Circle extends ClosedCurve {
	double radius;

	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}

	public Circle(double radius) throws IllegalClosedCurveException{
		
		if(radius <= 0) throw new IllegalClosedCurveException(this.getClass().getSimpleName());
		this.radius = radius;
		
	}

	double computeArea() {
		return (Math.PI * radius * radius);
	}
}

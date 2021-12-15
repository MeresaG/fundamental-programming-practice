package lesson12.exception.project.one;

public class Square extends ClosedCurve {
	double side;

	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
	}

	public Square(double side) throws IllegalClosedCurveException{
		if(side <= 0 )
			throw new IllegalClosedCurveException(this.getClass().getSimpleName());
		this.side = side;
	}

	double computeArea() {
		return (side * side);
	}

}

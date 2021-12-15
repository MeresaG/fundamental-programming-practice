package lesson12.exception.project.one;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = null;
		try {
			objects = new ClosedCurve[] { new Triangle(2, 2, 3), new Square(3), new Rectangle(3, 7), new Circle(5) };
		} 
		
		catch (IllegalTriangleException e) {
			System.err.println("An IllegalTriangleException was thrown in a Triangle instance");
			System.exit(1);
		} 
		
		catch (IllegalClosedCurveException e) {
			String classname = e.getMessage();
			System.err.println("An IllegalClosedCurveException was thrown in a " + classname + " instance");
			System.exit(1);
		}
		for (ClosedCurve cc : objects) {
			String nameOfCurve = cc.getClass().getSimpleName();

			System.out.println("The area of this " + nameOfCurve + " is " + cc.computeArea());

		}
	}

}

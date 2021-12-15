package lesson.six.project.three;

public class Test2 {

	public static void main(String[] args) {
		
		Polygon[] poligons = {  new Square(3),
								new Triangle(4, 5, 6),	
								new Rectangle(3, 4)						   
								};
		
		for (Polygon p : poligons) {
			System.out.println("For this " + p.getClass().getSimpleName());
			System.out.println("\t Number of sides = " + p.getNumberOfSides());
			System.out.println("\t Perimeter = " + p.computePerimeter());
			
		}

	}

}

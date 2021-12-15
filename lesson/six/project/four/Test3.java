package lesson.six.project.four;

public class Test3 {

	public static void main(String[] args) {
		
		Polygon[] polygon = { new Square(3),
							  new Triangle(4, 5, 6),
							  new Rectangle(3, 4)
								};
		
		for (Polygon p : polygon) {
			
			System.out.println("For this " + p.getClass().getSimpleName());
			System.out.println("\t Perimeter = " + p.computePerimeter());
			
		}
		

	}

}

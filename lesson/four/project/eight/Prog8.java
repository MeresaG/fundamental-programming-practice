package lesson.four.project.eight;

public class Prog8 {
	
	
	public static void main(String[] args) {
		
		int[] inputArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println(min(inputArray));
		
	}
	
	public static int min(int[] arrayOfInts) {
		
		int min = Integer.MAX_VALUE;
		
		if (arrayOfInts.length == 0) {
			System.out.println("Empty array.");
		}
 		
		for (int i = 0; i < arrayOfInts.length; i++) {
			
			if (arrayOfInts[i] < min) {
				min = arrayOfInts[i];
			}
			
		}
		
		return min;
		
	}

}

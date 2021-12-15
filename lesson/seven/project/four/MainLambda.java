package lesson.seven.project.four;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambda {
	

public static void main(String[] args) {
		
		String[] myString = {"Meresa", "Andrew", "Bob", "Pedro", "Andrea", "Christian"};
		
		StringSort stringSort = new StringSort((String s1, String s2) -> s1.compareTo(s2));
		
		myString = stringSort.stringSort(myString);
		
		System.out.println(Arrays.toString(myString));

	}
	
}

package lesson.seven.project.four;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] myString = {"Meresa", "Eve", "Bob", "Did", "Andrea", "Christian"};
		
		StringSort stringSort = new StringSort(new StringSort.LengthCompare());
		myString = stringSort.stringSort(myString);
		
		System.out.println(Arrays.toString(myString));

	}

}

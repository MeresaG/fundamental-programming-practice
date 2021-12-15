package lesson.seven.project.four;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	
	private Comparator<String> lengthCompare;
	
	public StringSort(Comparator<String> mycomparator) {
		
		this.lengthCompare = mycomparator;
		
	}
	
	public String[] stringSort(String[] arr) {
		
		Arrays.sort(arr, lengthCompare);
		
		return arr;
	}
	
	
	static class LengthCompare implements Comparator<String> {
		
		
		@Override
		public int compare(String s1, String s2) {
			
			return s1.length() - s2.length();
			
		}
		
	}

}

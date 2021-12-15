package lesson13.recursion.project.three;

public class BinSearch {
	
	public static boolean search(String s, char c) {
		
		if(s == null || s.length() == 0) {
			return false;
		}
		
		int m = s.length()/2;
		char ch = s.charAt(m);
		
		if(ch == c) 
			return true;
		
		else if(c < ch)
			return search(s.substring(0, m), c);
		
		else if(c > ch)
			return search(s.substring(m + 1), c);
		
		return false;
		
	}

	public static void main(String[] args) {
		
		String input = "adhkmrz";
		
		System.out.println(search(input, 'd'));

	}

}

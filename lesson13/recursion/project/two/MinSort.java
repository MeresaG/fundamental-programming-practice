package lesson13.recursion.project.two;

public class MinSort {

	public String sort(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}
		

		int minPos = s.indexOf(findMin(s));
		char ch = s.charAt(minPos);
		char chToreplace = s.charAt(0);
		
		String t = s.substring(0, minPos) + chToreplace + s.substring(minPos + 1);
		
		return ch + sort(t.substring(1));

	}

	public static char findMin(String s) {

		if (s.length() == 1)
			return s.charAt(0);

		char ret = findMin(s.substring(1)); // substring is ello, ret is e
		char zeroTh = s.charAt(0);

		return ret < zeroTh ? ret : zeroTh;
	}

	public static void main(String[] args) {

		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);

	}

}

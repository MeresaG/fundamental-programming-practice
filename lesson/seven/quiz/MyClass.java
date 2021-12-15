package lesson.seven.quiz;

public class MyClass extends AnotherClass{
	
	public static void main(String[] args) { 
		AnotherClass a = new AnotherClass();
		System.out.println(a.getType());
		} 
		 
	public void myMethod() { 
	 System.out.println("hello"); 
	 
	}
	
	public int getType() {
		
		return 3;
	}
	
}

package lesson.five.project.one;

public class Professor extends DeptEmployee {

	private int numberOfPublication;
	
	public Professor(int numberOfPublication, String name, double salary, int hireYear, 
						int hireMonth, int hireDay) {
				
		super(name, salary, hireYear, hireMonth, hireDay);
		this.numberOfPublication = numberOfPublication;
				
	}
	
	public void setNumberOfPublication(int numberOfPublication) {
		
		this.numberOfPublication = numberOfPublication;
		
	}
	
	public int getNumberOfPublication() {
		
		return this.numberOfPublication;
	}
	
	
}

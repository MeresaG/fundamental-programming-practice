package lesson.five.project.one;

public class Secretary extends DeptEmployee {

	private double overtimeHours;
	
	public Secretary(double overtimeHours, String name, double salary, int hireYear, 
					int hireMonth, int hireDay) {
				
		super(name, salary, hireYear, hireMonth, hireDay);
		this.overtimeHours = overtimeHours;
				
	}
	
	public void setOvertimeHours(double overtimeHours) {
		
		this.overtimeHours = overtimeHours;
		
	}
	
	public double getOvertimeHours() {
		
		return this.overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		
		return (super.computeSalary() + ( 12 * this.getOvertimeHours()));
	}
	
	
}

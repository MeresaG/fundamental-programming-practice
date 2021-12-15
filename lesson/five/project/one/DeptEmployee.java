package lesson.five.project.one;

import java.time.LocalDate;

public class DeptEmployee {
	
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, int hireYear, 
							int hireMonth, int hireDay) {
		
		this.name = name;
		this.salary =  salary;
		this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay);
		
	}
	//Setter methods
	public void setName(String name) {
		
		this.name = name;
		
	}

	public void sethireDate(int hireYear, int hireMonth, int hireDay) {
		
		this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay);
		
	}
	
	//getter method
	
	public String getName() {
		
		return this.name;
	}
	
	public LocalDate gethireDate() {
		
		return this.hireDate;
		
	}
	
	public double computeSalary() {
		
		return this.salary;
	}
	
}

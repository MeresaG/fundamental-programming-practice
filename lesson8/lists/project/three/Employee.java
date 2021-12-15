package lesson8.lists.project.three;

import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate hireDate;
	private double salary;

	public Employee(String name, double salary, int year, int month, int day) {
		
		this.name = name;
		this.salary = salary;
		hireDate = LocalDate.of(year, month, day);
		
	}

	public LocalDate getHireDate() {
	
		return hireDate;
	
	}

	public String getName() {
		
		return name;
	
	}

	public double getSalary() {
	
		return salary;
	
	}

	public final boolean equals(Object o) {
	
		if (o == null)
			return false;
		
		if (o.getClass() != this.getClass()) {
			return false;
		}
		
		Employee e = (Employee) o;
		return (e.getName().equals(name) && e.getHireDate().equals(hireDate) && e.getSalary() == salary);
	}

	public String toString() {
		
		String newline = System.getProperty("line.separator");
		return newline + "EMPLOYEE " + name + newline + "LocalDate of Hire: " + hireDate + newline + "Salary: " + salary
				+ newline;
	
	}

}
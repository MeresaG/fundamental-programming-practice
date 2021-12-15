package lesson.six.project.five;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Employee implements Comparable<Employee>{
	
	private String name;
	private int salary;
	private LocalDate hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDate = LocalDate.of(year, month, day);
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public String toString() {
		
		DateTimeFormatter dateTimeFormater =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    return String.format("<name:%s  salary: "+ Double.toString(salary) + 
	    					" hire date: " + dateTimeFormater.format(hireDate)
	    								+ ">", name, salary);
	}
	
	/**
	 * Sort by first name in ascending order first,
	 * Sort by salary and finaly by hire day
	 */
	
	@Override
	public int compareTo(Employee employee) {
		
		if(employee == null) {
			return 0;
		}
		
		else if(!(this.name.equals(employee.name))) {
			
			return this.name.compareTo(employee.name);
			
		}
		
		else if( !(this.salary == employee.salary)) {
			
			return this.salary - employee.salary;
			
		}
		
		else {
			
			return this.hireDate.compareTo(employee.hireDate);
			
		}
		
        
    }
	

}	
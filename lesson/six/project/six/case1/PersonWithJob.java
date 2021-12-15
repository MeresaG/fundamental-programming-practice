package lesson.six.project.six.case1;

import java.time.LocalDate;

public class PersonWithJob extends Person {
	
	private double salary;
	
	PersonWithJob(String name, LocalDate dob, double salary) {
	
		super(name, dob);
		this.salary = salary;
		
	}
	public double getSalary() {
		
		return salary;
		
	}
	
	@Override
	public boolean equals(Object withJob) {
		
		if(withJob == null) return false;
		
		if(!(withJob instanceof PersonWithJob))
			return false;
		
		PersonWithJob p = (PersonWithJob)withJob;
		boolean isEqual= ( getName().equals(p.getName())) && 
							(getDateOfBirth().equals(p.getDateOfBirth())) && 
								(this.salary == p.salary);
		
		return isEqual;
	}
	
}
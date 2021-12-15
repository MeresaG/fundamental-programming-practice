package lesson.six.project.six.case2;

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
		
		if(withJob.getClass() != this.getClass())
			return false;
		
		PersonWithJob p = (PersonWithJob)withJob;
		
		/*
		 * super.equals(p) && 
								(this.salary == p.salary);
		 */
		boolean isEqual= ( getName().equals(p.getName())) && 
							(getDateOfBirth().equals(p.getDateOfBirth())) && 
								(this.salary == p.salary);
		
		return isEqual;
	}
}
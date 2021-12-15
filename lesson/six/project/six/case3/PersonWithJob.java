package lesson.six.project.six.case3;

import java.time.LocalDate;



public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	PersonWithJob(String name, LocalDate dob, double salary) {
	
		person =  new Person(name, dob);
		this.salary = salary;
		
	}
	
	public double getSalary() {
		
		return salary;
		
	}
	
	@Override
	public boolean equals(Object withJob) {
		
		if(withJob == null) return false;
		
		if((withJob.getClass() != this.getClass()))
			return false;
		
		PersonWithJob p = (PersonWithJob)withJob;
		boolean isEqual= ( this.person.equals(p.person)) && 
								(this.salary == p.salary);
		
		return isEqual;
	}
	
}
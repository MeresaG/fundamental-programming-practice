package lesson.six.project.six.case3;


import java.time.LocalDate;

public class Person {
	
	private String name;
	private LocalDate dateOfBirth;
	
	Person(String name, LocalDate dob) {
		
		this.name = name;
		this.dateOfBirth = dob;
		
	}
	public String getName() {
		
		return name;
		
	}
	public LocalDate getDateOfBirth() {
		
		return dateOfBirth;
		
	}
	
	@Override
	public boolean equals(Object aPerson) {
		
		if(aPerson == null ) {
			
			return false;
			
		}
		
		if((aPerson.getClass() != this.getClass())) {
			
			return false;
			
		}
		
		Person p = (Person) aPerson;
		boolean isEqual = (this.name.equals(p.name)) && (this.dateOfBirth.equals(p.dateOfBirth));
		
		return isEqual;
		
	}
	
}
package lesson11.hashtable.project.three;

import java.util.*;

public class Admin {
	
	private static HashMap<Key, Student> hashStudents;
	
	public Admin() {
		hashStudents = new HashMap<Key, Student>();
	}
	
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		new Admin();
		
		for(Student stu : students) {
			
			Key key = new Key(stu.getFirstName(), stu.getLastName());
			hashStudents.put(key, stu);		
			
			
		}
		
		
		return hashStudents;
	}
	
}

package lesson11.hashtable.project.three;

import java.util.Objects;

import org.junit.platform.commons.util.ToStringBuilder;

public class Key {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public String toString() {
		return "[" + firstName + " " + lastName + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != Key.class)
			return false;
		Key s = (Key) ob;
		return s.firstName.equals(firstName) && s.lastName.equals(lastName);
	}

}
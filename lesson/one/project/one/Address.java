package lesson.one.project.one;

/**
 * 
 * Stores data for an address. In this application,
 * A customer may have a billing and shipping address.
 * @author mera
 *
 */

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	//Address Constructor
	public Address(String street, String city, String state, String zip) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}
	
	//getter methods
	
	public String getStreet() {
		
		return this.street;
		
	}
	
	public String getCity() {
		
		return this.city;
		
	}
	
	public String getState() {
		
		return this.state;
		
	}
	
	public String getZip() {
		
		return this.zip;
		
	}
	
	/**
	 * Provides a string representation of an address. 
	 * @return a string representation of an address.
	 */
	public String toString() {
		
		return this.street + ", " + this.city + ", " + this.state + " " + this.zip;
	}
	
}

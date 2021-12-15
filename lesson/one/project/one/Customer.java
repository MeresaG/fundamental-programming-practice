package lesson.one.project.one;

/**
 * 
 * represents profile information of a Customer
 * @author mera
 *
 */

public class Customer {
	
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAdd;
	private Address shippingAdd;
	
	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	// Getter methods
	public String getFirstName() {
		
		return this.firstName;
		
	}
	
	public String getLastName() {
		
		return this.lastName;
		
	}
	
	public String getSocSecurityNum() {
		
		return this.socSecurityNum;
		
	}
	
	public Address getBillingAddress() {
		
		return this.billingAdd;
		
	}
	
	public Address getShippingAddress() {
		
		return this.shippingAdd;
		
	}
	
	//Setter Methods
	public void setSocSecurityNum(String socSecurityNum) {
		
		this.socSecurityNum = socSecurityNum;
		
	}
	
	public void setBillingAddress(Address billingAdd) {
		
		this.billingAdd = billingAdd;
		
	}
	
	public void setShippingAddress(Address shippingAdd) {
		
		this.shippingAdd = shippingAdd;
		
	}
	
	/**
	 * { @return a string representation of customer.}
	 */
	
	public String toString() {
		
		return "[" + this.firstName + ", " + this.lastName + ", ssn:" + this.socSecurityNum + "]";
		
	}
}

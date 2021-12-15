package lesson.one.project.one;

/**
 * Create few customers, and stores them in an array. Then locate all customers
 * with billing address in Chicago.
 * 
 * @author mera
 *
 */

public class Main {

	public static void main(String[] args) {

		Address billingAddOne = new Address("1001 Allen Ave", "Chicago", "IL", "60185");
		Address ShippingAddOne = new Address("331 Vine St", "Chicago", "IL", "60185");
		Address billingAddTwo = new Address("314 Maple Ct", "Random Lake", "WI", "53075");
		Address ShippingAddTwo = new Address("248 Meadow St", "Chicago", "MA", "02330");

		Customer c1 = new Customer("Meresa", "Gebrewahd");
		c1.setSocSecurityNum("553-44-3456");
		c1.setBillingAddress(billingAddOne);
		c1.setShippingAddress(ShippingAddOne);

		Customer c2 = new Customer("Aregawi", "Teame");
		c2.setSocSecurityNum("456-55-9862");
		c2.setBillingAddress(billingAddTwo);
		c2.setShippingAddress(ShippingAddTwo);

		// print customer one information
		System.out.println(c1.toString());
		System.out.println("Billing Address:" + c1.getBillingAddress());
		System.out.println("Shipping Address:" + c1.getShippingAddress());

		// create a customer of array length 2
		Customer[] c = new Customer[2];
		c[0] = c1;
		c[1] = c2;

		/*
		 * Search the array of a customer that reside in Chicago. If found, print the
		 * customer profile.
		 */
		for (int i = 0; i < c.length; i++) {

			Address billingAddress = c[i].getBillingAddress();
			String city = billingAddress.getCity();
			if (city.equals("Chicago")) {
				System.out.println(c[i].toString());
			}

		}

	}

}

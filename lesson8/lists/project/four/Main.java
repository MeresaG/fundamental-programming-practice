package lesson8.lists.project.four;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();

	public static void main(String[] args) {
		
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	
	}

	private void loadData() {
	
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));

	}

	public void printAsUpperCase() {

		listOfAddresses.forEach(address -> {
			
			//address.asList();
			
			List<String> addressUpper = address.toUpper();
			System.out.println(formatFields(addressUpper));
			
		});
		
		
	}

	private String formatFields(List<String> list) {
		
		int[] i = new int[1]; 
		i[0] = 0;
		output.setLength(0);
		list.forEach(l -> {
			if (i[0] <= 1) {
				output.append(l + "\n");
			}
			else if(i[0] == 2)
				output.append(l + ", ");
			else
				output.append(l + " ");
			i[0]++;
			
		});
		
		return output.toString() + "\n";
	}

}
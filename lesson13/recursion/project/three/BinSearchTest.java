package lesson13.recursion.project.three;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinSearchTest {

	@Test
	void testTrue() {
		String input = "dhlotuz";
		char c = 'h';
		assertTrue(BinSearch.search(input, c));
		
	}
	
	@Test
	void testFalse() {
		String input = "dhlotuz";
		char f = 'c';
		assertFalse(BinSearch.search(input, f));
		
	}
	
	

}

package lesson.four.project.eight.test;

import lesson.four.project.eight.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prog8Test {

	@Test
	void test() {
		
		int[] inputArray =  {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		assertEquals(-22, Prog8.min(inputArray));
		
	}

}

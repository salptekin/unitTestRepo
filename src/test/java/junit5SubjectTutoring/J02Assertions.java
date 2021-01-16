package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToFindMin() {
		
		assertTrue(Math.min(12.3, 13.2)==12.3);
		
		assertFalse(Math.min(12.3, 13.2)!=12.3);
		
		assertEquals(12.3, Math.min(12.3, 13.2));
	}
	
	@Test
	void testArrays() {
		
		String str = "JUnit5 is better than JUnit4";
		
		String[] actualArr = str.split(" ");
		String[] expectedArr = {"JUnit5", "is", "better", "than", "JUnit4"};
		
		assertTrue(Arrays.equals(actualArr, expectedArr));
		
	}

}

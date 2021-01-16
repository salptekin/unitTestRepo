package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class J01Assertions {
	
	/*
	 	1)In JUnit5, we do not type access modifiers but it is not "default"
	 	  it is "public" or "protected"
	 	  Note: In JUnit4, we were typing public.	 	  
	*/

	@Test
	void testToFail() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLength() {
		
		//The value which is coming from the method under test is called "actual"
		int actualLength = "ABCD".length();
		//The value which you decide is called "expected" 
		int expectedLength = 4;
		
		//We need to compare "actual" and "expected" values ==> Assertion
		
		//1.assertEquals()
		//a)assertEquals with 2 parameters
		//assertEquals(expectedLength, actualLength);
		
		//b)assertEquals with 3 parameters
		//assertEquals(expectedLength, actualLength, "Lengths are not matching");		
		
		//2.assertTrue()
		//a)
		//assertTrue(expectedLength==actualLength);
		
		//b)
		//assertTrue(expectedLength==actualLength, "Actual length is not matching with expected length");
		
		//3.assertFalse()
		//For example; if you need to assert the length is not "5", you can use assertFalse()
		//a)
		//assertFalse(expectedLength==actualLength);
		//b)
		assertFalse(expectedLength==actualLength, "The length should not be 4 but it is 4");

	}
	
	 /*
	 				Homework
	 	Create a test method to test "toUpperCase()" by using assertEquals(), assertTrue(), assertFalse() methods
	 	by using same way with the previous example			
	 */
	
	@Test
	void testContainsMethod() {
		
		assertEquals(false, "AliCan".contains("jk"));
		
	}

}

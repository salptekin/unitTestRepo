package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class J07ParameterizedTest {
	
	//Create a test method to test if the length() working as expected for
	//ABCD, ABC, A, "", abcdefg
	@Test//not recommended
	void testLength1() {
		
		assertTrue("ABCD".length()>0);
		assertTrue("ABC".length()>0);
		assertTrue("A".length()>0);
		assertTrue("".length()>=0);
		assertTrue("abcdefg".length()>0);
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD", "ABC", "A", "", "abcdefg"})
	void testLength2(String str) {
		
		assertTrue(str.length()>=0);
	
	}

}

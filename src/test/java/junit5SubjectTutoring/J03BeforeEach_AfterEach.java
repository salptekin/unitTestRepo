package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J03BeforeEach_AfterEach {
	
	String str;
	
	@BeforeEach //Will be executed before every test method. In JUnit4, it was @Before
	void beforeEach() {
		str = "JUnit5 is better than JUnit4";
		System.out.println("beforeEach() is executed");
	}
	
	@AfterEach//Will be executed after every test method. In JUnit4, it was @Aftger
	void afterEach() {
		str = null;
		System.out.println("afterEach() is executed");
	}

	@Test
	void testArrays(TestInfo info) {
		
		String[] actualArr = str.split(" ");
		String[] expectedArr = {"JUnit5", "is", "better", "than", "JUnit4"};
		
		System.out.println(info.getDisplayName() + " is executed");
		
		assertTrue(Arrays.equals(actualArr, expectedArr));
		
	}
	
	@Test
	void testStringLength(TestInfo info) {

		int actualLength = str.length();
		int expectedLength = 28;
		
		assertEquals(expectedLength, actualLength, "Lengths are not equal");
		
		System.out.println(info.getDisplayName() + " is executed");
	}

}

package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J04BeforeAll_AfterAll {
	
	@BeforeAll//It is executed before all test methods just once.In JUnit4, it was @BeforeClass
	static void beforeAll(TestInfo info) {
		System.out.println(info.getDisplayName() + " connected me to database");
	}
	
	@AfterAll//It is executed after all test methods just once.In JUnit4, it was @AfterClass
	static void afterAll(TestInfo info) {
		System.out.println(info.getDisplayName() + " ended the connection with database");
	}
	

	@Test
	void testWithArrays() {
		
		String str = "Unit test with JUnit5";
		String actualResult[] = str.split(" ");
		String expectedResult[] = { "Unit", "test", "with", "JUnit5"};
		
		assertArrayEquals(expectedResult, actualResult, "Arrays are not equal");
		
		System.out.println("testWithArrays() executed");
	}
	
	@Test
	void testStringLength() {
		
		String str = "Unit test with JUnit5";
		int actualLength = str.length();
		int expectedLength = 21;
		
		assertEquals(expectedLength, actualLength, "Lengths are not equal");
		
		System.out.println("testStringLength() executed");
	}

}

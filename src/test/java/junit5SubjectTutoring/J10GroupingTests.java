package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class J10GroupingTests {
	
	//Test multiplyExact() method by non-zero integers and test multiplyExact() method by zero integers
	
	@ParameterizedTest
	@CsvSource(value = {"-12 ,-4 , 3", "-12, 4, -3", "12, 4, 3", "12, -4, -3"})
	void multiplyTestWithNonZero(int rs, int x, int y) {
		assertEquals(rs, Math.multiplyExact(x, y));
	}
	
	@Nested
	class operationsWithZero{
		
		@ParameterizedTest
		@CsvSource(value = {"0 ,-4 , 0", "0, 4, 0", "0, 0, 0", "0, 0, -3", "0, 0, 4"})
		void multiplyTestWithZero(int rs, int x, int y) {
			assertEquals(rs, Math.multiplyExact(x, y));
		}
		
		@ParameterizedTest
		@CsvSource(value = {"-4 ,-4 , 0", "4, 4, 0", "0, 0, 0", "-3, 0, -3", "4, 0, 4"})
		void addTestWithZero(int rs, int x, int y) {
			assertEquals(rs, Math.addExact(x, y));
		}
		
	}
	

}

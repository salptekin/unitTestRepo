package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class J10GroupingTestsForMathOperations {
	
	//Test multiplyExact() and addExact() methods by non-zero integers and by zero integers
	
	@Nested
	class multiplyWithNonZero{
		@ParameterizedTest
		@CsvSource(value = {"-12 ,-4 , 3", "-12, 4, -3", "12, 4, 3", "12, -4, -3"})
		void multiplyTestWithNonZero(int rs, int x, int y) {
			assertEquals(rs, Math.multiplyExact(x, y));
		}
	}
	
	@Nested
	class multiplyWithZero{
		
		@ParameterizedTest
		@CsvSource(value = {"0 ,-4 , 0", "0, 4, 0", "0, 0, 0", "0, 0, -3", "0, 0, 4"})
		void multiplyTestWithZero(int rs, int x, int y) {
			assertEquals(rs, Math.multiplyExact(x, y));
		}		
	}
	
	@Nested
	class addWithNonZero{
		@ParameterizedTest
		@CsvSource(value = {"-1 ,-4 , 3", "1, 4, -3", "7, 4, 3", "-7, -4, -3"})
		void addTestWithNonZero(int rs, int x, int y) {
			assertEquals(rs, Math.addExact(x, y));
		}
	}
	
	@Nested
	class addWithZero{
		
		@ParameterizedTest
		@CsvSource(value = {"-4 ,-4 , 0", "4, 4, 0", "0, 0, 0"})
		void addTestWithZero(int rs, int x, int y) {
			assertEquals(rs, Math.addExact(x, y));
		}
		
	}
	
}

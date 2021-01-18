package junit5tutorial;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class C02FirstTwoLastTwoCharsSameTest {
	
	C02FirstTwoLastTwoCharsSame obj = new C02FirstTwoLastTwoCharsSame();

	//ABAB==>true, AB==>true, ABCD==>false, ABBA==>false, A==>false, ""==>false
	@ParameterizedTest
	@CsvSource(value = {"true, ABAB", "false, ABBA", "false, ABCD", "true, AB", "false, A", "false,''"})
	void checkIfFirstTwoLastTwoCarsAreSameTest1(boolean rs, String str) {
		assertEquals(rs, obj.checkIfFirstTwoLastTwoCarsAreSame(str));
	}
	
	//As you see, if you do not use @CsvSource you need to create 2 test methods
	@ParameterizedTest
	@ValueSource(strings= {"ABAB","AB"})
	void checkIfFirstTwoLastTwoCarsAreSameTest2(String str) {
		assertTrue(obj.checkIfFirstTwoLastTwoCarsAreSame(str));
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"ABBA","ABCD", "A", ""})
	void checkIfFirstTwoLastTwoCarsAreSameTest3(String str) {
		assertFalse(obj.checkIfFirstTwoLastTwoCarsAreSame(str));
	}
	
}

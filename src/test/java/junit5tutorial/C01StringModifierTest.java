package junit5tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class C01StringModifierTest {

	//AABC==>BC, ABC==>BC, BAC==>BC, BCD==>BCD, BCAA==>BCAA, AA==>"", A==>"", B==>B
	
	C01StringModifier strToModify;
	
	@BeforeEach
	void setUp() {
		strToModify = new C01StringModifier();
		System.out.println("@BeforeEach is executed");
	}
	
	@AfterEach
	void tearDown() {
		strToModify = null;
		System.out.println("@AfterEach is executed");
	}
	
	@ParameterizedTest
	@CsvSource(value= {"BC, AABC", "BC, ABC", "BC, BAC", "BCD, BCD", "'', AA", "'', A", "B, B"})
	void deleteAIfItIsinFirstTwoPositionsTest(String expected, String actual) {
		
		assertEquals(expected, strToModify.deleteAIfItIsinFirstTwoPositions(actual));
		
		System.out.println("Executed");
	}

}

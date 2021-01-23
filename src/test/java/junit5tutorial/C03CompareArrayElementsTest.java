package junit5tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class C03CompareArrayElementsTest {

	@ParameterizedTest
	@MethodSource("arrayProvider")
	void compareElementsOfTwoArraysTest(boolean result, Object[] a1, Object[] a2) {
		
		C03CompareArrayElements obj = new C03CompareArrayElements();
		
		assertEquals(result, obj.compareElementsOfTwoArrays(a1, a2));
		
		System.out.println("Test method is executed...");
		
	}
	
	static Stream<Arguments> arrayProvider(){
		
		//true
		String[] s1 = {"a", "b"};
		String[] s2 = {"a", "b"};
		
		//true
		String[] s3 = {"a", "b"};
		String[] s4 = {"b", "a"};
		
		//false
		String[] s5 = {"a", "b"};
		String[] s6 = {"c", "b"};
		
		//true
		Integer[] i1 = {1, 2, 3};
		Integer[] i2 = {1, 3, 2};
		
		//false
		Integer[] i3 = {1, 2, 3};
		Integer[] i4 = {1, 2};
		
		//true
		Character[] c1 = {'a'};
		Character[] c2 = {'a'};
		
		//true
		Character[] c3 = {'a', 'b'};
		Character[] c4 = {'b', 'a'};
		
		return Stream.of(
				          Arguments.of(true, s1, s2),
				          Arguments.of(true, s3, s4),
				          Arguments.of(false, s5, s6),
				          Arguments.of(true, i1, i2),
				          Arguments.of(false, i3, i4),
				          Arguments.of(true, c1, c2),
				          Arguments.of(true, c3, c4)
						);		
	}

}

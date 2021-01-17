package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class J08RepeatSameTestMultipleTimes {
	
	//Test substring(), if it gives same output when you use it 10 times
	@RepeatedTest(10)
	void subStringTest() {
		assertEquals("Java", "Java OOP concept".substring(0, 4));
		System.out.println("substring() is executed");
	}
	
	//Test addExact() in Java Math Class if it is working as expected for first 10 positive integers
	//1+2 / 2+3 / 3+4 / etc.
	static int x = 1;
	static int y = 2;
	static int result = 3;
	@RepeatedTest(100)
	void adExactTest() {
		assertEquals(result, Math.addExact(x, y));
		System.out.println(result);
		x++;
		y++;
		result+=2;		
	}
	
	

}

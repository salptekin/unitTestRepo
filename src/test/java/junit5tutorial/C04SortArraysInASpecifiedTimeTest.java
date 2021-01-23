package junit5tutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class C04SortArraysInASpecifiedTimeTest {

	@Test
	void sortArraysInASpecifiedTimeTest1() {
		
		C04SortArraysInASpecifiedTime obj = new C04SortArraysInASpecifiedTime();
		
		assertTimeout(Duration.ofSeconds(5), 
								()->IntStream.rangeClosed(1, 100000).forEach(t->obj.sortArraysInASpecifiedTime())
				     );	
	}
	
	/*
	 	1)@RepeatedTest annotation runs the test method multiple times. 
	 	  If you need to run "test method" multiple times use @RepeatedTest annotation
	 	2)If you need to run just "source method" multiple times do not use @RepeatedTest annotation
	 	  use "IntStream.rangeClosed(1, 100000).forEach(.......)"
	 */
	
	C04SortArraysInASpecifiedTime obj = new C04SortArraysInASpecifiedTime();
	
	@RepeatedTest(100000)
	void sortArraysInASpecifiedTimeTest2() {

		assertTimeout(Duration.ofSeconds(5), ()->obj.sortArraysInASpecifiedTime());
		
	}

}

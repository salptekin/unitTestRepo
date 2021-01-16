package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J05TestingExceptions {

	@Test
	void testException1() {
		
		String str = "Ali Can";
		/*
		  1) The Exception Class which you put in expected part should be able to catch the exception
		     which is thrown. It can be same exception with the thrown or can be prent exception 
		     for the thrown exception.
		     
		  2) If the method under test does not throw exception, assertThrows() fails the test 
		     If the exception cannot be caught for any reason, assertThrows() fails the test
		*/
		assertThrows(NullPointerException.class, 
				
								()->{	System.out.println("testException1 is executed");
										str.length();
									}
					 );

    }
	
	/*
	 	Integer.parseInt("Ali Can"); throws NumberFormatException. 
	 	Create test method.
	*/
	@Test
    void testException2() {
		
		String str = "Ali Can";
        
        assertThrows(NumberFormatException.class,
        		
		                ()-> {
		                		Integer.parseInt(str);
		                     }
		                
                    );
    }
	
	/*
	 	Dividing by 0 throws ArithmeticException.
	 	Create test method 
	*/
	@Test
	void testException3() {
		
		int x = 123;
		int y = 0;
		
		assertThrows(ArithmeticException.class,()->divide(x, y));
	}
	
	private int divide(int a, int b) {
		return a/b;
	}
	
	/*
	 	Negative values for ages should throw IllegalArgumentException
	 	Create test method
	*/
	@Test
	void testException4() {
		int age = -12;
		assertThrows(IllegalArgumentException.class, ()->checkAge(age));
	}

	private void checkAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(age);
		}
	}

}	

package junit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J06DisplayName {

	@Test
	@DisplayName("Test parseInt() to check if it is throwing NullPointerException for nondigit characters")
    void testException() {
		
		String str = "Ali Can";
        
        assertThrows(NumberFormatException.class,
        		
		                ()-> {
		                		Integer.parseInt(str);
		                     }
		                
                    );
    }
}

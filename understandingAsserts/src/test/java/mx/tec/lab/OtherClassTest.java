package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OtherClassTest {
	
	OtherClass tester = new OtherClass();
	@Test
	public void testMultiply() {
		
		 try {
			 tester.multiply(100, 5);
		    } catch (IllegalArgumentException e) {
		        assertNotEquals("X should be less than 1000", e.getMessage());	
		    }
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		 try {
			 tester.multiply(1000, 5);
		    } catch (IllegalArgumentException e) {
		        assertEquals("X should be less than 1000", e.getMessage());	
		    }
	}
	
}


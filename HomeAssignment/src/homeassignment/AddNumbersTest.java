package homeassignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumbersTest extends AddNumbers {
	

	@Test
	public void testAddition() {
		int expected= 20;
		int actual= new AddNumbers().add(10,10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAddition2() {
		int expected= -20;
		int actual= new AddNumbers().add(-10,-10);
		assertEquals(expected, actual);
	}
	@Test
	public void testAddition3() {
		int expected= 0;
		int actual= new AddNumbers().add(10,-10);
		assertEquals(expected, actual);
	}
	
}
         
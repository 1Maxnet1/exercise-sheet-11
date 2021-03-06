package de.unistuttgart.iste.sqa.pse.exercisesheet11.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * This class is for explanatory use only. 
 * 
 */
public class ExampleTest {
	private Example example;
		
	@Before
	public void setUp() {
		example = new Example("foo");
	}
	
	@Test
	public void testValue() {
		assertEquals("foo", example.getAttribute());
	}
	
	@Test
	public void testWrongValue() {
		assertEquals("bar", example.getAttribute());
	}
	
	@Test
	public void testFoo() {
		assertTrue(example.foo());
	}
	
	@Test(expected = NullPointerException.class)
	public void testBar() {
		example.bar();
	}
}

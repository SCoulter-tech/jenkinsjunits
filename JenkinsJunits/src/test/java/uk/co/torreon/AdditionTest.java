package uk.co.torreon;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class AdditionTest {
	
	private Addition addition = null;

	@Before
	public void setUp() {
		addition = new Addition();
	}
	
	@After
	public void tearDown() {
		addition = null;
	}
	
	@Test
	public void testAddsTwoNumbersOk() {
		Integer total = addition.add(1,2);
		
		Assert.assertEquals("Wrong Value", 3, total.intValue());
	}
}

package com.kenneth;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {

	Calculator c = null;
	CalculatorService cs = null;
	
	@Before
	public void setUp() throws Exception {
		//	Using Mockito.mock to fake the CalculatorService
		cs = Mockito.mock(CalculatorService.class);
		c = new Calculator(cs);
	}
	

	@Test
	public void testAdd() {
		//	Tell Mockito when calling fake service add(2, 3) always return 5
		Mockito.when(cs.add(2, 3)).thenReturn(5);		
		assertEquals(10, c.perform(2, 3));
		Mockito.verify(cs).add(2, 3);
	}

}

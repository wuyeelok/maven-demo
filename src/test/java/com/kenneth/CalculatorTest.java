package com.kenneth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator c = null;
	CalculatorService cs = null;
	
	@Before
	public void setUp() throws Exception {
		cs = new CalculatorService() {
			public int add(int i, int j) {
				return 10;
			}
		};
		c = new Calculator(cs);
	}
	

	@Test
	public void testAdd() {
		assertEquals(10, c.perform(2, 3));
	}

}

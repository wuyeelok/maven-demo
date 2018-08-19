package com.kenneth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator c;
	
	@Before
	public void setUp() throws Exception {
		c = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(5, c.add(2, 3));
	}

}

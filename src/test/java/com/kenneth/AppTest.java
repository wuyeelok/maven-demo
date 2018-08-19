package com.kenneth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	
	App app;

	@Before
	public void setUp() throws Exception {
		app = new App();
	}

	@Test
	public void test() {
		assertEquals("sample", app.sample());
	}

}

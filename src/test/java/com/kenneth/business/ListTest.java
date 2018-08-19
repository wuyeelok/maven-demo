package com.kenneth.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListTest {

	List listMock;
	@Before
	public void setUp() throws Exception {
		listMock = mock(List.class);
	}

	@Test
	public void letsMockListsSizeMethod() {
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void letsMockListsSizeReturnMultipleValue() {
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}

}
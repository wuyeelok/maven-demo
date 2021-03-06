package com.kenneth.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListTest {
	
	List listMock;
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
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
	
	@Test
	public void letsMockListsGet() {
		when(listMock.get(anyInt())).thenReturn("in28Minutes");
		
		assertEquals("in28Minutes", listMock.get(0));
		assertEquals("in28Minutes", listMock.get(1));
	}

	@Test
	public void letsMockList_throwAnException() {
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something is wrong"));		
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("Something is wrong");
		listMock.get(3);
	}
}

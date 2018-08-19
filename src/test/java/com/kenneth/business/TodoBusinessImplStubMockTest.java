package com.kenneth.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kenneth.data.api.TodoService;

public class TodoBusinessImplStubMockTest {
	
	
	TodoService todoServiceMock = null;
	TodoBusinessImpl todoBusinessImpl = null;

	@Before
	public void setUp() throws Exception {
		todoServiceMock = mock(TodoService.class);
		todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	}

	@Test
	public void testRetrieveTodosRelatedToString_usingAMock() {
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring"
				, "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		List<String> filterTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filterTodos.size());
		
	}
	
	@Test
	public void testRetrieveTodosRelatedToString_usingAMockWithEmptyList() {
		List<String> todos = Arrays.asList("");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		List<String> filterTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, filterTodos.size());
		
	}

}

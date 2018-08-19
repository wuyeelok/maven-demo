package com.kenneth.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kenneth.data.api.TodoService;
import com.kenneth.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {
	
	TodoService todoServiceStub = null;
	TodoBusinessImpl todoBusinessImpl = null;

	@Before
	public void setUp() throws Exception {
		todoServiceStub = new TodoServiceStub();
		todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
	}

	@Test
	public void testRetrieveTodosRelatedToString_usingAStub() {
		List<String> filterTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filterTodos.size());
	}

}

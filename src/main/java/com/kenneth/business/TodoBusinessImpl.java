package com.kenneth.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.kenneth.data.api.TodoService;

public class TodoBusinessImpl {
	
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {		
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		
		filteredTodos = todos.stream()
				.filter(todo -> todo.contains("Spring"))
				.collect(Collectors.toList());
		
		return filteredTodos;
	}

}

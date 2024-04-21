package com.thomas.TodoWebApplication.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos;
	
	static {
		todos.add(new Todo(1,"in28minutes","learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(1,"in28minutes","learn DevOps",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(1,"in28minutes","learn Full Stack Development",LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}

}

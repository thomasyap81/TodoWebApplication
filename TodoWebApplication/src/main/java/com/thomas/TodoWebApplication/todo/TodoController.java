package com.thomas.TodoWebApplication.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("my_name")
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService =todoService;
	}
	
	@RequestMapping("/list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("in28minutes");
		model.addAttribute("Todos",todos);
		return "listTodos";
	}
	
	//get,post methods
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username =(String)model.get("name");
		Todo todo = new Todo(0,username, "Default Description", LocalDate.now().plusYears(1),false);
		model.put("todo",todo); // the "todo" must same name as modelAttribute="todo"
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addNewTodo(ModelMap model, Todo todo) {
		String username =(String)model.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}

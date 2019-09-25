package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
@Service
public class TodoService {
	//we are not connecting to database 
	//we are creating a static list  on/from which data manupulation(add,delete,update) will be done
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", new Date(),
				false));
		todos.add(new Todo(2, "in28Minutes", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", new Date(),
				false));
	}

	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

	public void addTodo(int count,String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(count, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public Todo retrieveTodoById(int id) {
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
	
	public void validationId(ModelMap model, int id) throws UserException {
		System.out.println("burbak");
		String id1=String.valueOf(id);
		System.out.println(id1);
		for(Todo todo:todos) {
			if(todo.getId()==id)
				System.out.println("inside you");
			UserException e= new UserException("UserId already exist");
			throw e;
		}
		if(todos.contains(id1)) {
			System.out.println("inside you");
			UserException e= new UserException("UserId already exist");
			System.out.println("bak bak");
			throw e;
			
		}
		
		
	}

	public void updateToDo(Todo todo) {
	todos.remove(todo);
	todos.add(todo);
		
	}

}

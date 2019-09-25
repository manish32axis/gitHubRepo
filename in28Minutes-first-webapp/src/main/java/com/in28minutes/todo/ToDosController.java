package com.in28minutes.todo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;

@Controller
@SessionAttributes("name")
public class ToDosController {
	@Autowired
	TodoService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {                     //this init binder is used to convert all the date in same format for whole controller.
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));
	};
	
	
	@RequestMapping(value = "/to_list", method=RequestMethod.GET)
	
	public String show(ModelMap model) {
		
		model.addAttribute("todo", service.retrieveTodos(retrieveUserName()));
		return "todo_List"; 
	}


	private String retrieveUserName() {
		return "in28Minutes";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.GET)
	public String addTodoget(ModelMap model) {
		model.addAttribute("todo",new Todo(0,"in28minutes","please write something",new Date(),false));
		return "add_toDo";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.POST)
	public String addTodoPost(ModelMap model,@Valid Todo todo,BindingResult result) throws UserException {
		if(result.hasErrors()) {
			return "add_toDo";
		}
		service.addTodo(todo.getId(),retrieveUserName(), todo.getDesc(), new Date(), false);	
		//service.validationId(model,id);
		model.clear();		
		return "redirect:to_list";
	}
	
	@RequestMapping(value="/delete-todo",method=RequestMethod.GET)
	public String deleteTodoPost(ModelMap model,@RequestParam int id) {
		service.deleteTodo(id);		
		model.clear();
		return "redirect:to_list";
	}
	@RequestMapping(value="/update-todo",method=RequestMethod.GET)
	public String updateTodoList(ModelMap model,@RequestParam int id) {
		Todo todo=service.retrieveTodoById(id);
		model.addAttribute("todo", todo);
		
		
		return "add_toDo";
	}
	@RequestMapping(value="/update-todo",method=RequestMethod.POST)
	public String updateTodoPost(@Valid Todo todo,BindingResult result) {
		if(result.hasErrors()) {
			return "add_toDo";
		}
		service.updateToDo(todo);		
		return "redirect:to_list";
	}

}

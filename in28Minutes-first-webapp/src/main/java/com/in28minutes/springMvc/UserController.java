package com.in28minutes.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value = "/user")
	public String hello() {
		return "hello";
	}

}

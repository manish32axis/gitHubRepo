package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {        //also called as handler
	/*@Autowired
	LoginService service;
	*/
	@RequestMapping(value = "/mvc" ,method = RequestMethod.GET)   //mapping login url to this method
	//@ResponseBody                       //makes dispatcher servlet to think that method is not returning any view or url.
	                                      //if it is not present than view dispatcher servlet uses view resolver to give response
	public String getShow(ModelMap map) {
		map.put("name","in28minutes");
		return "login";
	}
	
	/*@RequestMapping(value = "/mvc" ,method = RequestMethod.POST)   //mapping login url to this method
	//@ResponseBody                       //makes dispatcher servlet to think that method is not returning any view or url.
                                       //if it is not present than view dispatcher servlet uses view resolver to give response
	public String postResult(@RequestParam String name,@RequestParam String password,ModelMap model) {
		model.put("name", name);               //MODEL is used to pass info between controller nd view(jsp) 
		model.put("password", password);        //model content is available to view automatically
		boolean flag = service.validation(name, password);
		if(!flag) {
			model.put("errorMessage", "password is blank or wrong");
			return "info";
		
		}else
			return "login";
			
	}*/
	
	

}

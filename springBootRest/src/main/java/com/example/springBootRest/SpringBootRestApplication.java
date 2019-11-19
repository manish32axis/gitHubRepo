package com.example.springBootRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRestApplication  {
 @Autowired
 EmployeeService service;
	@Value("${spring.application.name}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
	
	@RequestMapping("/")
	public List<Employee> getEmpList(){
		
		return service.getEmployees();		
	}
	 //Put your code here
		

	

}

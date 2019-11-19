package com.example.springBootRest;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
	
	static List<Employee> list = new ArrayList<Employee>();
	public List<Employee> getEmployees() {
		 Employee emp1 = new Employee("Shandya",20,0);
			Employee emp2 = new Employee("Kemp",24,2);
			Employee emp3 = new Employee("Anil",22,3);
			Employee emp4 = new Employee("Kumar",30,6);
			Employee emp5 = new Employee("Tim",32,7);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.sort(new AgeComparator());
        return list;
    }
	
	

	
}

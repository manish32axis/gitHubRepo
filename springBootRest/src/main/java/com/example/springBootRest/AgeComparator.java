package com.example.springBootRest;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
	    if(arg0.getAge()<arg1.getAge())
	        return -1;
		return 0;
	}

}

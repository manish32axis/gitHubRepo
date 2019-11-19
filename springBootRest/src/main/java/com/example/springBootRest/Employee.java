package com.example.springBootRest;

import java.util.Comparator;

public class Employee   {

	private String name;
	private int age;
	private int exp;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name, int age, int exp) {
		super();
		this.name = name;
		this.age = age;
		this.exp = exp;
	}
	public Employee() {
		}
//	@Override
//	public int compareTo(Employee obj) {
//		// TODO Auto-generated method stub
//		if(obj.getAge()<age) {
//			return -1;
//		}
//		return 0;
//	}
	
	
	
	
    
}

package com.in28minutes.todo;

public class UserException extends Exception{
	
		   String a;
		   UserException(String a) {
		     this.a=a;
		     System.out.println("reach here");
		   }
		   public String error(){
			   
		     return ("Exception message =  "+a) ;
		  }

}

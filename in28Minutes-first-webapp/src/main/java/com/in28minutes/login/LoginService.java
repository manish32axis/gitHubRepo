package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validation(String name,String password) {
		if( password.equals("9304")) {
			return true;
		}
		return false;
	}
	

	

}

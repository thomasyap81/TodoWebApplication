package com.thomas.TodoWebApplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("thomas");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidPassword && isValidUserName;
	}
}

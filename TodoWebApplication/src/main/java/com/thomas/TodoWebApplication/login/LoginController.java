package com.thomas.TodoWebApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationservice) {
		super();
		this.authenticationService =authenticationservice;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String myname, @RequestParam String mypassword, ModelMap model) {

		if (authenticationService.authenticate(myname, mypassword)) {
			model.put("my_name", myname);
//			model.put("my_password", mypassword);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}

}

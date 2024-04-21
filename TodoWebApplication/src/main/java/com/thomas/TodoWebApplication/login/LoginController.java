package com.thomas.TodoWebApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//http://localhost:8080/login?nameid=thomas
	@RequestMapping("login")
	public String loginWeb(@RequestParam String nameid, ModelMap model) {
		model.put("nameJSP", nameid);
		System.out.println("Welcome " + nameid);
		return "login";
	}

}

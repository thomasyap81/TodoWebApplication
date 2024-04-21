package com.thomas.TodoWebApplication.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//http://localhost:8080/login?nameid=thomas
	@RequestMapping("login")
	public String loginWeb(@RequestParam String nameid, ModelMap model) {
		model.put("nameJSP", nameid);
		
		logger.debug("Request param is {}", nameid);
		logger.info("info");
		logger.warn("warn");
		
		System.out.println("Welcome " + nameid);
		return "login";
	}

}

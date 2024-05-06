package com.thomas.TodoWebApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you  learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb =new StringBuffer();
		sb.append("<title>My first HTML Page -changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML Page with body. -changed");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}

package com.in28mins.springboot.simpletodo.hello;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody //-------------- Lets you return whatever you are returning in the method as it is to the browser
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first page from spring boot");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}

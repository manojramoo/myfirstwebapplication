package com.manojram.springboot.myfirstwebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello() {
		return "Hello!,What are you doing today?";
	}
	
	@RequestMapping("hellohtml")
	public String sayHelloHtml() {
		return "Hello!,What are you doing today?";
	}
	
	@RequestMapping("hellojsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}

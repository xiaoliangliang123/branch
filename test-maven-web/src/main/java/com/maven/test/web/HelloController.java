package com.maven.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
    public String hello(){
        return "Greetings from Spring Boot!";
    }
	
	
	@RequestMapping("/test")
	@ResponseBody
    public String test(){
        return "Greetings from Spring Boot!";
    }
	
	
	@RequestMapping("/test2")
	@ResponseBody
    public String test2(){
        return "Greetings from Spring Boot!";
    }
}

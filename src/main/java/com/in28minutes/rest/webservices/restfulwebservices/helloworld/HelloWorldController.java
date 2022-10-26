package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	
	//Get Method
	//URI - /hello-world
	
	//Method returns "HelloWorld"
	@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
	public String HelloWorld()
	{
		return "Hello World";
	}
	
	//Method returns "HelloWorldBean"
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean HelloWorldBean()
	{
		return new HelloWorldBean("Hello World Bean");
	}
	
	//Method returns "HelloWorldBean path variable"
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean HelloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World Bean, %s", name));
	}
}

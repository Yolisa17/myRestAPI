package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

	final int val = 5;
	static int num = 17;
	protected String str;
	
	
	@RequestMapping(method=RequestMethod.GET, path = "/Cont2/getNum")
	public int getNum()
	{
		System.out.println("getNum()");
		return val;
	}
	
	//Do some db stuff
}

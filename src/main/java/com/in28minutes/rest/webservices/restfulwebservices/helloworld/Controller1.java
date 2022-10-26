package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

	final int val = 5;
	static int num = 17;
	protected String str;
	
	public String myMethod()
	{
		System.out.println("myMethod()");
		return "myMethod";
	}
	
	@RequestMapping(method=RequestMethod.GET, path = "/Cont1/getNum")
	public int getNum()
	{
		System.out.println("getNum()");
		return num;
	}
	
	@RequestMapping(method=RequestMethod.GET, path = "/Cont1/getReq")
	public boolean getReq()
	{
		System.out.println("getReq()");
		num++;
		return true;
	}
	
	@RequestMapping(method=RequestMethod.POST, path = "/Cont1/postReq/{data}")
	public boolean postReq(@PathVariable String data)
	{
		System.out.println("postReq() - " + data);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.PUT, path = "/Cont1/putReq/{data}")
	public boolean putReq(@PathVariable String data)
	{
		System.out.println("putReq() - " + data);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path = "/Cont1/delReq/{data}")
	public boolean delReq(@PathVariable String data)
	{
		System.out.println("delReq()");
		num--;
		return true;
	}
}

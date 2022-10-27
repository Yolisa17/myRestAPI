package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.Controller2;

@SpringBootTest
public class Controller2Tests {

	Controller2 loCon = new Controller2();
	
	@Test
	void getNumTest()
	{	
		assertEquals(loCon.getNum(),5);
	}
}

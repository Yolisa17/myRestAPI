package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.Controller1;

@SpringBootTest
public class JunitTests {

	Controller1 loCon = new Controller1();
	
	@Test
	void testMyMethod() {
		assertEquals(loCon.myMethod(),"myMethod");
	}
	
	@Test
	void testGETNum() {
		assertEquals(loCon.getNum(),16);
	}
	
	@Test
	void testGETReq() {
		assertEquals(loCon.getReq(),true);
	}
	
	@Test
	void testPOSTReq() {
		String loStr = "this is POST data...";
		assertEquals(loCon.postReq(loStr),true);
	}
	
	@Test
	void testPUTReq() {
		String loStr = "this is PUT data...";
		assertEquals(loCon.putReq(loStr),true);
	}
	
	@Test
	void testDELETEReq() {
		String loStr = "this is DELETED data...";
		assertEquals(loCon.delReq(loStr),true);
	}
}

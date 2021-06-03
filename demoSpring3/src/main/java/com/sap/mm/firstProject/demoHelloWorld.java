package com.sap.mm.firstProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoHelloWorld {
    
	@RequestMapping	("/helloworld")
	public String helloWorld() {
    	return "Hello World!";
    }
	
}

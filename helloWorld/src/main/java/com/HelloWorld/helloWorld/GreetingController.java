package com.HelloWorld.helloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class GreetingController {
	private static final String content = "Hello world";

	
	@GetMapping("/greeting")
	public Greeting greeting() {
		return new Greeting(content);
	}
}

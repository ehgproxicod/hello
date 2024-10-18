package com.proxicod.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author EHG
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping(path = "")
	public String sayHello() {
		return "Hello people";
	}
	
	@GetMapping(path = "/name")
	public String sayHelloName(@RequestParam String name) {
		return "Hello "+name;
	}
}

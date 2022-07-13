package com.sb.testerMS0722.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class Welcome {
	
	@GetMapping(path = "/hello",produces = "application/json")
	public String hello() {
		return "Welcome !!!";
	}

}

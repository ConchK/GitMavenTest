package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	
	@GetMapping(value="/")
	public String index() {
		return "Hello Git!!";
	}
	
	@GetMapping(value="/")
	public String add() {
		return "25 + 36 = " + (25+36);
	}
}

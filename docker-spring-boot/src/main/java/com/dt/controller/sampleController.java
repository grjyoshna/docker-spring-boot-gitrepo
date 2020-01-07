package com.dt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class sampleController {

	@GetMapping("/welcome")
	public String hello()
	{
		return "Welcome!";
	}
}

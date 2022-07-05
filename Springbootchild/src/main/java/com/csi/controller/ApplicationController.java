package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@GetMapping("/service")
	public String getService() {
		
		return "Welcome in my company";
		
	}
	
	@GetMapping("/Address")
	public String getAddress() {
		
		return "Welcome in Pune";
		
	}
	
	@GetMapping("/Address1")
	public String getAddress1() {
		
		return "Welcome in Pune";
		
	}

}

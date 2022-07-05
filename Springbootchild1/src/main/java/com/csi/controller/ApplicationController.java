package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V1")
public class ApplicationController {

	@GetMapping("/Name")
	public String getName() {
		return "Umesh Navanath Thombre";
	}

	@GetMapping("/Education")
	public String getEducation() {
		return "Bachlore in engineering";
	}

	@GetMapping("/Address")
	public String getAddress() {
		return "Pune Chinchwad";
	}

}

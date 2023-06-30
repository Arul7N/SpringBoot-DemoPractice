package com.example.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class playController {

	
	@GetMapping("/home")
	public String run() {
		return "Successfully Completed....!";
	}
}

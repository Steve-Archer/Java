package com.steve.quoteroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Hello world! Welcom to the application";
	}
	@RequestMapping("/funny")
	public String funny() {
		return "He who laughs last, thinks the slowest.";
	}
	@RequestMapping("/inspirational")
	public String inspirational() {
		return "You miss 100% of the shots you dont take";
	}
	@RequestMapping("/interesting")
	public String interesting() {
		return "Mosquitos kill more humans than any other animal";
	}
	
}



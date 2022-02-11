package com.steve.hellopets;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String helloPet() {
		return "hello pets";
	}
	@RequestMapping("/pets")
public String pet(@RequestParam(value="name", required=false) String queryParam, @RequestParam(value="breed", required=false)String breed) {
		System.out.println("query param: " + queryParam);
		if(queryParam == null) {
			return "This is the default pet, Guest Pet.";
		}
		else if(breed == null){
			return "This is " + queryParam + ". " + queryParam + " is a good dog.";
		}else {
			return "this is " + queryParam + ". " + queryParam + " is a " + breed + ".";
		}
	}
	
	
	
	
	
}

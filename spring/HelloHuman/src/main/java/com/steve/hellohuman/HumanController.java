package com.steve.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false)String firstName, 
	@RequestParam(value="last_name", required=false)String lastName,
	@RequestParam(value="times", required=false) String times
	) {
		if(firstName != null && lastName == null && times == null) {
			return "Hello " + firstName;
		}
		else if(firstName != null && lastName != null && times == null) {
			return "Hello " + firstName + " " + lastName;
		}
		else if(firstName != null && times != null) {
			String nameString = "";
			int timesNum = Integer.parseInt(times);
			int index = 1;
			while(index<=timesNum) {
				nameString += " Hello " + firstName;
				index++;
			}
			return nameString;
		}
		else return "Hello Human";
	}
}

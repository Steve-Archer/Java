package com.steve.petsittingform;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	
	@PostMapping("/process_form")
	public String processForm(
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("owner") String owner,
			@RequestParam("activity") String activity,
			@RequestParam("keepaway") String keepaway,
			@RequestParam("backstory") String backstory,
			HttpSession session
			){
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		session.setAttribute("owner", owner);
		session.setAttribute("activity", activity);
		session.setAttribute("keepaway", keepaway);
		session.setAttribute("backstory", backstory);
		
		return "redirect:/details";
	}
	@RequestMapping("/details")
	public String showDetails() {
		
		return "details.jsp";
	}
}

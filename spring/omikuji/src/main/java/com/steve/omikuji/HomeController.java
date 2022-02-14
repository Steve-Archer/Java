package com.steve.omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@RequestMapping("/omikuji")
	public String omikuji() {
		return "omikuji.jsp";
	}
	@PostMapping("/process")
	public String process(
			@RequestParam("number") String number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("thing") String thing,
			@RequestParam("nice") String nice,
			HttpSession session
			) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		return "redirect:/show";
	}
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
}

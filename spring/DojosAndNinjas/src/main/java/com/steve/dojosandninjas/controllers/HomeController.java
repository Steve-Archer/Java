package com.steve.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steve.dojosandninjas.models.Dojo;
import com.steve.dojosandninjas.models.Ninja;
import com.steve.dojosandninjas.services.AppService;

@Controller
public class HomeController {
	private final AppService appService;
	public HomeController(AppService appService) {
		this.appService = appService;
	}
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("wewfw");
		List<Dojo> allDojos = this.appService.getAllDojos();
		model.addAttribute("allDojos", allDojos);
		return "index.jsp";
	}
	@RequestMapping("/dojo/new")
	public String newDojo(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "addDojo.jsp";
	}
	@PostMapping("/dojo/add")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "addDojo.jsp";
		}else {
			this.appService.newDojo(dojo);
			return "redirect:/";
		}
	}
	@RequestMapping("/ninja/new")
	public String newNinja(Model model) {
		List<Dojo> allDojos = this.appService.getAllDojos();
		model.addAttribute("allDojos", allDojos);
		model.addAttribute("ninja", new Ninja());
		return "addNinja.jsp";
	}
	@PostMapping("/ninja/add")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "addNinja.jsp";
		}else {
			this.appService.newNinja(ninja);
			return "redirect:/";
		}
	}
	@RequestMapping("/dojo/{id}")
	public String oneDojo(@PathVariable("id")Long id, Model model) {
		Dojo oneDojo = this.appService.getDojo(id);
		model.addAttribute("oneDojo", oneDojo);
		return "dojo.jsp";
	}
	
	
	
	
}

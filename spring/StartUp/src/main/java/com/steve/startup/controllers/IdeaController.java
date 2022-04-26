package com.steve.startup.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steve.startup.models.Idea;
import com.steve.startup.services.IdeaService;

@Controller
public class IdeaController {
	@Autowired
	private IdeaService ideaService;
	
	@RequestMapping("/idea/new")
	public String newIdea(Model model, HttpSession session) {
		model.addAttribute("idea", new Idea());
		
		Long idOfCreator = (Long)session.getAttribute("loggedInUserID");
		model.addAttribute("idOfCreator",idOfCreator);
		return "create.jsp";
	}
	
	@PostMapping("/idea/create")
	public String create(@Valid @ModelAttribute("idea") Idea idea, BindingResult result) {
		if(result.hasErrors()) {
			return "create.jsp";
		}
		this.ideaService.createIdea(idea);
		return "redirect:/home";
	}
	
	@RequestMapping("/idea/{id}/detail")
	public String ideaDetail(@PathVariable("id") Long id, Model model, HttpSession session) {
		Idea ideaDetail = this.ideaService.getIdeaDetail(id);
		model.addAttribute("ideaDetail",ideaDetail);
		Long loggedInUserID = (Long)session.getAttribute("loggedInUserID");
		model.addAttribute("loggedInUserID",loggedInUserID);
		return "detail.jsp";
	}
	
	@RequestMapping("/idea/{id}/edit")
	public String editIdea(@PathVariable("id") Long id, Model model, HttpSession session) {
		Idea idea = this.ideaService.getIdeaDetail(id);
		model.addAttribute("idea", idea);
		Long loggedInUserID = (Long)session.getAttribute("loggedInUserID");
		model.addAttribute("loggedInUserID", loggedInUserID);
		if(loggedInUserID == idea.getUploader().getId()) {
			return "edit.jsp";
		}else {
			return "redirect:/home";
		}	
	}
	
	@PutMapping("/idea/{id}/update")
	public String updateIdea(@PathVariable("id") long id, @Valid @ModelAttribute("idea") Idea idea, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		this.ideaService.editIdea(idea);
		return "redirect/home";
	}
	@RequestMapping("idea/{id}/delete")
	public String deleteIdea(@PathVariable("id")Long id) {
		this.ideaService.deleteIdea(id);
		return "redirect:/home";
	}
}

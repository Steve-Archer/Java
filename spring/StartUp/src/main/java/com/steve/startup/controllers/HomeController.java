package com.steve.startup.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.steve.startup.models.Idea;
import com.steve.startup.models.LoginUser;
import com.steve.startup.models.User;
import com.steve.startup.services.IdeaService;
import com.steve.startup.services.UserService;
@Controller
public class HomeController {
    @Autowired
    private UserService userServ;
    @Autowired
    private IdeaService ideaServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
    	User user = this.userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("loggedInUser", user.getId());
        return "redirect:/home";
    }
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {  
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("loggedInUserID", user.getId());
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String dashboard(Model model, HttpSession session) {
    	Long id = (Long) session.getAttribute("loggedInUserID");
    	if(id==null) {
    		return "redirect:/";
    	}
    	User userLoggedIn = this.userServ.findOneUser(id);
    	model.addAttribute("userLoggedIn",userLoggedIn);
    	List<Idea> allIdeas = this.ideaServ.findAllIdeas();
    	model.addAttribute("allIdeas",allIdeas);
    	return "dashboard.jsp";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}


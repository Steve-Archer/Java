package com.steve.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.steve.bookclub.models.Book;
import com.steve.bookclub.models.LoginUser;
import com.steve.bookclub.models.User;
import com.steve.bookclub.services.BookService;
import com.steve.bookclub.services.UserService;
@Controller
public class HomeController {
    @Autowired
    private UserService userServ;
    @Autowired
    private BookService bookServ;
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
        session.setAttribute("loggedInUser", user.getId());
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String dashboard(Model model, HttpSession session) {
    	Long id = (Long) session.getAttribute("loggedInUser");
    	if(id==null) {
    		return "redirect:/";
    	}
    	User loggedInUser = this.userServ.findOneUser(id);
    	model.addAttribute("loggedInUser", loggedInUser);
    	List<Book> allBooks = this.bookServ.getAllBooks();
    	model.addAttribute("allBooks", allBooks);
    	return "dashboard.jsp";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
    @GetMapping("/new")
    public String newBook(Model model, HttpSession session) {
    	Long id = (Long) session.getAttribute("loggedInUser");
    	if(id==null) {
    		return "redirect:/";
    	}
    	User loggedInUser = this.userServ.findOneUser(id);
    	model.addAttribute("loggedInUser", loggedInUser);
    	model.addAttribute("newBook", new Book());
    	return "create.jsp";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result) {
        if(result.hasErrors()) {
            return "create.jsp";
        }
        this.bookServ.newBook(newBook);
        return "redirect:/home";
    }
    @GetMapping("/books/{id}")
    public String details(@PathVariable("id") Long id, Model model, HttpSession session) {
    	Long userId = (Long) session.getAttribute("loggedInUser");
    	Book book = this.bookServ.getBook(id);
    	model.addAttribute("book", book);
    	if(userId==book.getUser().getId()){
    		return "detailsPoster.jsp";
    	}
    	return "details.jsp";
    }
    @GetMapping("/books/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model, HttpSession session) {
    	Long userId = (Long) session.getAttribute("loggedInUser");
    	User loggedInUser = this.userServ.findOneUser(userId);
    	model.addAttribute("loggedInUser", loggedInUser);
    	Book book = this.bookServ.getBook(id);
    	model.addAttribute("book", book);
    	model.addAttribute("updatedBook", new Book());
    	return "edit.jsp";
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable("id")Long id, @Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {	
    	if(result.hasErrors()) {
    		return "edit.jsp";
    	}
    	this.bookServ.updateBook(book);
    	return "redirect:/home";
    }
    @GetMapping("/books/delete/{id}")
    public String deleteIdea(@PathVariable("id") Long id) {
		this.bookServ.deleteBook(id);	
		return "redirect:/home";
	}
}


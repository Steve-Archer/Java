package com.steve.moviesite;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String helloWorld(Model model) {
		
		String movieTitle = "American Gangster";
		String releaseDate = "2001-01-01";
		String imageURL = "https://m.media-amazon.com/images/I/71tEMmFxo7L._SL1500_.jpg";
		model.addAttribute("movie", movieTitle);
		model.addAttribute("releaseDate", releaseDate);
		model.addAttribute("imageURL", imageURL);
		
		
		ArrayList<Actor> cast = new ArrayList<Actor>();
		cast.add(new Actor("Denzel","Washington",50));
		cast.add(new Actor("Russell","Crowe",55));
		cast.add(new Actor("Edris","Alba",45));
		model.addAttribute("cast", cast);
		
		
		
		
		return "index.jsp";
	}
}
package com.steve.fullstackresturant.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steve.fullstackresturant.models.MenuItem;
import com.steve.fullstackresturant.services.MenuItemService;

@Controller
public class MenuItemController {
	private final MenuItemService menuService;
	public MenuItemController(MenuItemService menuService) {
		this.menuService = menuService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<MenuItem> allMenuItems = this.menuService.allMenuItems();
		model.addAttribute("allMenuItems", allMenuItems);
		return "index.jsp";
	}
	
	@RequestMapping("/detail/{id}")
	public String detail(Model model) {
		MenuItem menuItem = this.menuService.findMenuItem(null)
	}
	
}

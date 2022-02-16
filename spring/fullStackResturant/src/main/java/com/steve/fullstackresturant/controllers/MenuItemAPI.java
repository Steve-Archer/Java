package com.steve.fullstackresturant.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steve.fullstackresturant.models.MenuItem;
import com.steve.fullstackresturant.services.MenuItemService;

@RestController
public class MenuItemAPI {
	private final MenuItemService menuService;
	public MenuItemAPI(MenuItemService menuService) {
		this.menuService = menuService;
	}
	
	@RequestMapping("/api/menuitems")
	public List<MenuItem> index(){
		return this.menuService.allMenuItems();
	}
	@PostMapping("/api/menuitems")
	public MenuItem create(@RequestParam("name")String name,
			@RequestParam("dishType")String dishType,
			@RequestParam("price")double price,
			@RequestParam("description")String description
			) {
		MenuItem newItem = new MenuItem(name, dishType, price, description);
		return this.menuService.createMenuItem(newItem);
	}
	@RequestMapping("/api/menuitems/{id}")
	public MenuItem show(@PathVariable("id")Long id) {
		MenuItem menuitem = this.menuService.findMenuItem(id);
		return menuitem;
	}
}

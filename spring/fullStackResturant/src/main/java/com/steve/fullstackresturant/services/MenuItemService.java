package com.steve.fullstackresturant.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.fullstackresturant.models.MenuItem;
import com.steve.fullstackresturant.repositories.MenuItemRepository;

@Service
public class MenuItemService {
	
	private final MenuItemRepository menuRepo;
    
    public MenuItemService(MenuItemRepository menuRepo) {
        this.menuRepo=menuRepo;
    }
    public List<MenuItem> allMenuItems() {
        return (List<MenuItem>)this.menuRepo.findAll();
    }
    public MenuItem createMenuItem(MenuItem menuItem) {
    	return this.menuRepo.save(menuItem);
    }
    public MenuItem findMenuItem(Long id) {
    	return this.menuRepo.findById(id).orElse(null);
    }
}

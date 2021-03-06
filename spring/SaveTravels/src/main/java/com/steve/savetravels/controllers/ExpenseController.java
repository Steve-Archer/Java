package com.steve.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steve.savetravels.models.Expense;
import com.steve.savetravels.services.ExpenseService;
@Controller
public class ExpenseController {
	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	@RequestMapping("/")
	public String index(Model model) {
		List<Expense> allExpenses = this.expenseService.allExpenses();
		model.addAttribute("allExpenses", allExpenses);
		model.addAttribute("expense", new Expense());
		System.out.println("hello");
		return "index.jsp";
	}
	@PostMapping("/expense/create")
	public String create(@Valid @ModelAttribute("expense")Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> allExpenses = this.expenseService.allExpenses();
			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		}else {
			this.expenseService.createExpense(expense);
			return "redirect:/";
		}
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id")Long id, Model model) {
		Expense expense = this.expenseService.findOne(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	@PutMapping("/expense/edit/{id}")
	public String update(@PathVariable("id")Long id, @Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			this.expenseService.update(expense);
			return "redirect:/";
		}
	}
	@RequestMapping("/expense/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		this.expenseService.delete(id);
		return "redirect:/";
	}
	@RequestMapping("/detail/{id}")
	public String detail(@PathVariable("id")Long id, Model model) {
		Expense expense = this.expenseService.findOne(id);
		model.addAttribute("expense", expense);
		return "detail.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

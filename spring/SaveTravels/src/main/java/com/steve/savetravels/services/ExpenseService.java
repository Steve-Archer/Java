package com.steve.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.savetravels.models.Expense;
import com.steve.savetravels.repositories.ExpenseRepository;
@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	public List<Expense> allExpenses(){
		return (List<Expense>)this.expenseRepo.findAll();
	}
	public Expense createExpense(Expense expense) {
		return this.expenseRepo.save(expense);
	}
	
	
}

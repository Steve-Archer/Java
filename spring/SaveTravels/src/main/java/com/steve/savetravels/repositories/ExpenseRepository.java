package com.steve.savetravels.repositories;

import org.springframework.data.repository.CrudRepository;

import com.steve.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	
}

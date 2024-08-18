package com.cts.expensetrakerapi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.expensetrakerapi.entity.ExpenseEntity;
import com.cts.expensetrakerapi.service.ExpenseService;



@Controller
public class ExpenseTraker {
	
	private ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public List<ExpenseEntity> grtAllExpense() {
	return expenseService.getAllExpense();
	}
}

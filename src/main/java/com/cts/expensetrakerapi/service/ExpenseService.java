package com.cts.expensetrakerapi.service;

import java.util.List;

import com.cts.expensetrakerapi.entity.ExpenseEntity;

public interface ExpenseService {
	List<ExpenseEntity> getAllExpense();

}

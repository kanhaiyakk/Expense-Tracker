package com.cts.expensetrakerapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.expensetrakerapi.entity.ExpenseEntity;
import com.cts.expensetrakerapi.repository.ExpenseRepository;
import com.cts.expensetrakerapi.service.ExpenseService;



@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public List<ExpenseEntity> getAllExpense() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

}

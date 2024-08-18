package com.cts.expensetrakerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.expensetrakerapi.entity.ExpenseEntity;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

}

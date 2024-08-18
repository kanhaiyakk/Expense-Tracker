package com.cts.expensetrakerapi.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "expense_tbl")
public class ExpenseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(name = "Expense_Name")
	public String expense_name;
	
	@Column(name = "Details")
	public String details;
	
	@Column(name = "Expense_Amount")
	public BigDecimal expense_amount;
	
	@Column(name = "Catagory")
	public String catagory;
	
	@Column(name = "Date")
	public Date date;

}

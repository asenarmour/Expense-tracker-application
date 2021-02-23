package com.anurag.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anurag.app.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
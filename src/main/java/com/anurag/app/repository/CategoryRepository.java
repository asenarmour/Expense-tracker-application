package com.anurag.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anurag.app.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}

package com.ProductManagenmentSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductManagenmentSystem.bean.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	
}

package com.ProductManagenmentSystem.service;

import java.util.List;

import com.ProductManagenmentSystem.bean.Product;

public interface ProductService {

	List<Product> getAllProduct();
	
	void addnewProduct();
	
	Product getById(int pid);
	
	int updateProduct(Product product);
	
	void deleteById(int pid);
	
}

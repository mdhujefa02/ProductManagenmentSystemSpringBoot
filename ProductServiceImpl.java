package com.ProductManagenmentSystem.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductManagenmentSystem.bean.Product;
import com.ProductManagenmentSystem.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao pd;
	
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	@Override
	public void addnewProduct() {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter Name");
      String pname=sc.next();
      System.out.println("Enter Qty");
      int qty=sc.nextInt();
      System.out.println("Enter Price");
      int price=sc.nextInt();
      Product p=new Product(pname,qty,price);
      pd.save(p);
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		Optional<Product> op=pd.findById(pid);
		return op.orElse(null);
	}

	@Override
	public int updateProduct(Product product) {
		Optional<Product> op=pd.findById(product.getPid());
		if(op.isPresent()) {
			Product p=op.get();
			p.setPname(product.getPname());
			p.setQty(product.getQty());
			p.setPrice(product.getPrice());
			pd.save(p);
			return 1;
		}
		return 0;
	}

	@Override
	public void deleteById(int pid) {
		// TODO Auto-generated method stub
     pd.deleteById(pid);
	}

}

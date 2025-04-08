package com.ProductManagementSystem.start;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ProductManagenmentSystem.bean.Product;
import com.ProductManagenmentSystem.service.ProductService;

@SpringBootApplication
public class ProductManagementSystemSpringBootApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
	ApplicationContext ctx=SpringApplication.run(ProductManagementSystemSpringBootApplication.class, args);
	ProductService pservice=(ProductService)ctx.getBean(ProductService.class);
	do {
		System.out.println("1. Add New Product\n 2.Display All Product  \n 3. Delete Product by id \n"
				+ "4. Display by Id \n 5.Update Product \n 6.Display by Price \n 7.Exit");
		System.out.println("Choice : ");
		
		choice=sc.nextInt();
		int n=0;
	  switch (choice) {
	case 1: 
		pservice.addnewProduct();
		break;
	case 2: 
		List<Product> plList=pservice.getAllProduct();
		plList.forEach(x->{System.out.println(x);});
		break;
	case 3: System.out.println("Enter Pid");
		int pid=sc.nextInt();
	pservice.deleteById(pid);
	break;
	case 4: System.out.println("Enter Pid");
	pid=sc.nextInt();
	Product p=pservice.getById(pid);
	System.out.println(p);
	break;
	case 5:
		 System.out.println("Enter Pid");
	      pid=sc.nextInt();
	      System.out.println("Enter pName");
	      String pname=sc.next();
	      System.out.println("Enter Qty");
	      int qty=sc.nextInt();
	      System.out.println("Enter Price");
	      int price=sc.nextInt();
	      n=pservice.updateProduct(new Product(pid,pname,qty,price));

	      if(n>0) {
	    	  System.out.println("Updated Successfully");
	      }else {
	    	  System.out.println("Not Updated");
	      }
	default:
		System.out.println("Invalid Choice");
	}
	
	}while(choice != 2);
	}
}
	

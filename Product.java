package com.ProductManagenmentSystem.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "Products_Data")
public class Product {

	@Id
	@GeneratedValue
	int pid;
	String pname;
	int qty;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, int qty, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	
	public Product(String pname, int qty, int price) {
		super();
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	

	public Product(int pid, int qty, int price) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}

}

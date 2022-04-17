package com.bitlabs.controller;

import com.bitlabs.dao.Dao;
import com.bitlabs.dao.DaoImp;
import com.bitlabs.entity.Products;

import java.util.List;
import java.util.Scanner;

public class HibernateCrudeOperationsOnProductsDataApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HibernateCrudeOperationsOnProductsDataApplication obj = new HibernateCrudeOperationsOnProductsDataApplication();
		
		System.out.println("1. Add Products .");
		System.out.println("2. delete a product record .");
		System.out.println("3. Search product record by Id. ");
		System.out.println("4. Show all the records. ");
		
		int option=sc.nextInt();
		if (option==1) {
			obj.addProduct();
		}
		else if (option== 2) {
			obj.deleteProduct();
		}
		else if(option == 3) {
			obj.searchProductByName();
		}
		else if(option == 4) {
			obj.viewAllProducts();
		}
		
		sc.close();
	}
	
	

	Products pro=new Products();
    Dao dao=new DaoImp();
    Scanner s=new Scanner(System.in);
	

	public void addProduct() {
		
		System.out.println("Enter Product name :");
  	   	pro.setProduct_name(s.next());
  	   	System.out.println("Enter product price");
	    pro.setProduct_price(s.nextInt());
	    System.out.println("Enter product quantity"); 
	    pro.setProduct_qty(s.nextInt());
	    
	    
        boolean b=dao.addProduct(pro);
        if(b) {
          System.out.println("Inserted sucessfully");
        }
        else {
          System.out.println("Fail");
        }
	}
	
	
	public void deleteProduct() {
		System.out.println("Enter the product id you want to delete ");
		
		int id=s.nextInt();
		boolean b=dao.deleteProduct(id);
		if(b) {
			System.out.println("Record deleted Successfully");
		}
		else {
			System.out.println("fail");
		}
	}
	
	public void searchProductByName() {
		System.out.println("Enter the Id of the product you want to search");
		pro=dao.searchProductById(s.nextInt());
		System.out.println("Id:  "+pro.getProduct_id());
		System.out.println("Name :"+pro.getProduct_name());
		System.out.println("Email:  "+pro.getProduct_price());
		System.out.println("Quantity:  "+pro.getProduct_qty());
	}
	
	public void viewAllProducts() {
		List<Products> list=dao.viewAllProducts();
		for(Products s:list) {
			System.out.println("Id: "+s.getProduct_id());
			System.out.println("Name: "+s.getProduct_name());
			System.out.println("Email: "+s.getProduct_price());
			System.out.println("Name: "+s.getProduct_qty());
			
		}
	}
	
	
	
	
}

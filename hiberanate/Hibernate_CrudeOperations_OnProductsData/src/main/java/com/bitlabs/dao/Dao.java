package com.bitlabs.dao;

import java.util.List;

import com.bitlabs.entity.Products;
 
public interface Dao {
	public boolean addProduct(Products pro);
	public boolean deleteProduct(int id);
	public Products searchProductById(int Id);
	public List<Products> viewAllProducts();
}

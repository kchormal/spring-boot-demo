package com.example.deva.service;

import java.util.ArrayList;

import com.example.deva.model.Product;

public interface ProductService {
	
	public abstract Product createProduct(Product product);
	public abstract void deleteProduct(String id);
	public abstract Product getProduct(String id);
	public abstract ArrayList<Product> getProducts();

}

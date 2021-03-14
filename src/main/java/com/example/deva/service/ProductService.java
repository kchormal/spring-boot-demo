package com.example.deva.service;

import java.util.ArrayList;

import com.example.deva.product.Product;

public interface ProductService {
	
	public abstract void createProduct(Product product);
	public abstract void updateProduct(String id, Product product);
	public abstract void deleteProduct(String id);
	public abstract Product getProduct(String id);
	public abstract ArrayList<Product> getProducts();

}

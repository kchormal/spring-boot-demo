package com.example.deva.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.deva.product.Product;

@Repository
public interface ProductRepository {

	public abstract void saveProduct(Product product);
	public abstract void updateProduct(String id, Product product);
	public abstract void deleteProduct(String id);
	public abstract Product getProduct(String id);
	public abstract ArrayList<Product> getProductAll();
}

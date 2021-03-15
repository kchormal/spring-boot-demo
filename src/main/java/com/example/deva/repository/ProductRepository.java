package com.example.deva.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.deva.model.Product;

@Repository
public interface ProductRepository{

	public abstract void save(Product product);
	public abstract void update(String id, Product product);
	public abstract void delete(String id);
	public abstract Product findById(String id);
	public abstract ArrayList<Product> findAll();
}

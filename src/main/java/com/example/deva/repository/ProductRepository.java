package com.example.deva.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.deva.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	public abstract Product save(Product product);
	public abstract void deleteById(String id);
	public abstract Product findById(String id);
	public abstract ArrayList<Product> findAll();
}

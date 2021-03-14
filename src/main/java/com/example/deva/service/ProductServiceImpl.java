package com.example.deva.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deva.product.Product;
import com.example.deva.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductRepository repository;
	
	@Override
	public void createProduct(Product product) {
		repository.save(product);
	}

	@Override
	public void updateProduct(String id, Product product) {
		repository.update(id, product);
	}

	@Override
	public void deleteProduct(String id) {
		repository.delete(id);
	}

	@Override
	public Product getProduct(String id) {
		return repository.findById(id);
	}

	@Override
	public ArrayList<Product> getProducts() {
		return repository.findAll();
	}

}

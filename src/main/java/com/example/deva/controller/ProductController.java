package com.example.deva.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.deva.model.Product;
import com.example.deva.service.ProductServiceImpl;

@Controller
public class ProductController {

	@Autowired
    private ProductServiceImpl productService;
	
	@GetMapping(value = "/product/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable String id) {
		Product product = productService.getProduct(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping(value = "/product")
	public ResponseEntity<Object> getAllProduct() {
		List<Product> product = productService.getProducts();
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@PostMapping(value = "/product")
	public ResponseEntity<Object> postProduct(@RequestBody Product product) {
		Product savedProduct = productService.createProduct(product);
		return new ResponseEntity<>(savedProduct, HttpStatus.OK);
	}
	
	@PutMapping(value = "/product/{id}")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product, @PathVariable String id) {
		
		Product dbProduct = productService.getProduct(id);
		if(dbProduct != null) {
			productService.createProduct(product);
			return new ResponseEntity<>("Product updated Successfully...", HttpStatus.OK);
		}else {
			productService.createProduct(product);
			return new ResponseEntity<>("Product saved Successfully...", HttpStatus.OK);
		}
		
	}
	
	@DeleteMapping(value = "/product/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable String id) {
		return new ResponseEntity<>("Product deleted Successfully...", HttpStatus.OK);
	}
	
}

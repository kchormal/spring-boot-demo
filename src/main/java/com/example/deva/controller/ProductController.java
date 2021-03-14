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

import com.example.deva.product.Product;
import com.example.deva.service.ProductServiceImpl;

@Controller(value = "/product")
public class ProductController {

	@Autowired
    private ProductServiceImpl productService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable String id) {
		Product product = productService.getProduct(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<Object> getAllProduct() {
		List<Product> product = productService.getProducts();
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Object> postProduct(@RequestBody Product product) {
		productService.createProduct(product);
		return new ResponseEntity<>("Product saved Successfully...", HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product, @PathVariable String id) {
		
		Product dbProduct = productService.getProduct(id);
		if(dbProduct != null) {
			productService.updateProduct(id, product);
			return new ResponseEntity<>("Product updated Successfully...", HttpStatus.OK);
		}else {
			productService.createProduct(product);
			return new ResponseEntity<>("Product saved Successfully...", HttpStatus.OK);
		}
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable String id) {
		return new ResponseEntity<>("Jamale re", HttpStatus.OK);
	}
	
}

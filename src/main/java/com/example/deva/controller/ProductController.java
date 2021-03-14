package com.example.deva.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller(value = "/product")
public class ProductController {

	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> getProduct(String id) {
		return new ResponseEntity<>("Jamale re", HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<Object> getAllProduct() {
		return new ResponseEntity<>("Jamale re", HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Object> postProduct() {
		return new ResponseEntity<>("Jamale re", HttpStatus.OK);
	}
	
	@PutMapping(value = "/start")
	public ResponseEntity<Object> updateProduct() {
		return new ResponseEntity<>("Jamale re", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deleteProduct(String id) {
		return new ResponseEntity<>("Jamale re", HttpStatus.OK);
	}
	
}

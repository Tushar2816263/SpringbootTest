package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService prodservice;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
        return this.prodservice.addproduct(product);     		
	}
	
	@GetMapping("/allproducts")
	public ArrayList<Product> getAllProducts()
	{
		return this.prodservice.getAllProducts();
	}
	
	@PutMapping("/updateproduct")
	public Product updateProuct(@RequestBody Product product)
	{
		return this.prodservice.updateproduct(product);
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable("id") int id)
	{
		return this.prodservice.DeleteProduct(id);
	}

}

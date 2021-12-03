package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {
	
	ArrayList<Product> list = new ArrayList<>();

	public Product addproduct(Product product)
	{
		Product pr = new Product();
		pr.setName(product.getName());
		pr.setDescription(product.getDescription());
		pr.setPrice(product.getPrice());
		
		this.list.add(pr);
		return pr;
		
	}
	
	public ArrayList<Product> getAllProducts()
	{
		return this.list;
	}
	
	public Product updateproduct(Product product)
	{
		for(Product pr:list)
		{
			if(pr.getId() == product.getId())
			{
				pr.setName(product.getName());
				pr.setPrice(product.getPrice());
				pr.setDescription(product.getDescription());
				return pr;
			}
		}
		
		return null;
	}
	
	public String DeleteProduct(int id)
	{
		for(Product pr : list)
		{
			if(pr.getId() == id)
			{
				this.list.remove(pr);
				return "product deleted";
			}
			
		}
		
		return "Product Not Found";
	}
}

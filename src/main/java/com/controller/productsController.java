package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.entity.Products;
import com.repo.ProductsRepo;


@RestController
@CrossOrigin
public class productsController {

	@Autowired
	ProductsRepo repo;
	
	
	@GetMapping(path="/products") //for getting all products details
	public List<Products> getProducts()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/products/id/{id}") //for getting only specified id product
	public Optional<Products> getID(@PathVariable("id") int id)
	{
		return repo.findById(id);

	}
	
	@RequestMapping("/products/code/{code}") //for getting only specified code product
	public List<Products> getCode(@PathVariable("code") String code)
	{
		return repo.findByCode(code);

	}
	
	@RequestMapping("/products/name/{name}") //for getting only specified name product
	public List<Products> getName(@PathVariable("name") String name)
	{
		return repo.findByName(name);

	}
	
	@RequestMapping("/products/brand/{brand}") //for getting only specified brand product
	public List<Products> getBrand(@PathVariable("brand") String brand)
	{
		return repo.findByBrand(brand);

	}
	
	@RequestMapping("/products/price/{price}") //for getting only specified price product
	public List<Products> getPrice(@PathVariable("price") double price)
	{
		return repo.findByPriceLessThanEqual(price);

	}
	
}

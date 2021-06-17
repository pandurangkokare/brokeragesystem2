package com.indictrans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.model.Customer;
import com.indictrans.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/register")
	public List<Customer> load()
	{
		return customerService.getRecord();
	}
	@PostMapping("/register")
	private Customer  handle( @RequestBody Customer entity)
	{
		customerService.setRecord(entity);
		return  entity;
	}
	@PutMapping("/register/{id}")
	public void update(@RequestBody Customer entity,@PathVariable("id") int id)
	{
		customerService.update(entity, id);
	}
	
}

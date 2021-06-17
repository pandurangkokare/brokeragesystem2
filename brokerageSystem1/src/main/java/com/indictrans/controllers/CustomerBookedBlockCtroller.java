package com.indictrans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.bean.CustomerBookedBlockBean;
import com.indictrans.model.*;
import com.indictrans.services.CustomerBookedBlockService;

@RestController
public class CustomerBookedBlockCtroller {
	@Autowired
	private CustomerBookedBlockService blockSer;
	
	@GetMapping("/customerBookedArea")
	public List<CustomerBookedBlock> load()
	{
		
		return blockSer.getData();
	}
	@PostMapping("/customerBookedArea")
	public CustomerBookedBlock handle(@RequestBody CustomerBookedBlockBean booked)
	{
		;
		return blockSer.saveData(booked);
	}
	
}

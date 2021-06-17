package com.indictrans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.bean.BillBean;
import com.indictrans.model.Bill;
import com.indictrans.model.CommissionTable;
import com.indictrans.model.CustomerBookedBlock;
import com.indictrans.services.BillService;

@RestController
public class BillController {
	@Autowired
	private BillService billService;
	
	@GetMapping("/Bill")
	public List<Bill> load()
	{
		return billService.getData();
	}
	@PostMapping("/Bill")
	public Bill  handle(@RequestBody BillBean billBean)
	{
		
		return billService.saveData(billBean);
	}
	
	

}

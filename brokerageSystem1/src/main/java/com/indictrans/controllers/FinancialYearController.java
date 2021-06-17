package com.indictrans.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.bean.FinanYearBean;
import com.indictrans.model.*;
import com.indictrans.services.FinancialYearService;

@RestController
public class FinancialYearController {
	@Autowired
	private FinancialYearService ser;
	@GetMapping("/Financialyear")
	public List<com.indictrans.model.FinancialYear> load()
	{
		return ser.getData();
		
	}
	@PostMapping("/Financialyear")
	public FinanYearBean handle(@RequestBody FinanYearBean finanYear)
	{
		 ser.saveData(finanYear);
		return finanYear;
	}
	@PutMapping("Financialyear/{id}")
	public void update(@RequestBody FinanYearBean finanYear,@PathVariable("id") int id)
	{
		ser.update(finanYear, id);
	}

}

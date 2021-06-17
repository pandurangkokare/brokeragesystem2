package com.indictrans.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.bean.CommissionTableBean;
import com.indictrans.model.CommissionTable;
//import com.indictrans.model.CommissionTable;
import com.indictrans.services.CommissionTableService;

@RestController
public class CommissionTableController { 
	@Autowired
	private CommissionTableService commissionTableService;
	@GetMapping("/record")
	public List<CommissionTable> load()
	{
		return commissionTableService.getRecord();
	}
	 @PostMapping("/record")
	 public CommissionTableBean handle(@RequestBody CommissionTableBean entity)
	 {
		 commissionTableService.saveRcord(entity);
		 return entity;
		 
	 }
	 @PutMapping("/record/{id}")
	 public void update(@RequestBody CommissionTableBean commissionTable ,@PathVariable("id") int id)
	 {
		 commissionTableService.update(commissionTable, id);
	 }

}

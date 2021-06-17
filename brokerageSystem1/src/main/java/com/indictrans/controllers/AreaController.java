package com.indictrans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.model.AreaBlock;
import com.indictrans.services.AreaBlockService;

	@RestController
 public class AreaController {
	
	@Autowired
	private AreaBlockService areablockser;	
	
	@GetMapping("/Area")
	public List<AreaBlock> load()
	{
		
		return areablockser.getData();
	}
	@PostMapping("/Area")
	public AreaBlock handle(@RequestBody AreaBlock areaBlock)
	{
		areablockser.saveData(areaBlock);
		return areaBlock;
	}
	@PutMapping("/Area/{id}")
	public void update(@RequestBody AreaBlock areaBlock ,@PathVariable("id") int id)
	{
		areablockser.update(areaBlock, id);
	}
}

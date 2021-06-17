package com.indictrans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indictrans.model.Agent;
//
//import com.indictrans.mode.Agent;
import com.indictrans.services.AgentService;

@RestController
public class AgentController {
	@Autowired
	private AgentService agentSer;
	
	@GetMapping("/AgentReg")
	public List<Agent> load()
	{
		return agentSer.getData();
	}
	
	@PostMapping("/AgentReg")
	public Agent handle(@RequestBody Agent entity)
	{
		agentSer.saveData(entity);
		
		return  entity;
	}
	@PutMapping("/AgentReg/{id}")
	public void update( @RequestBody Agent entity ,@PathVariable("id") int id )
	{
		agentSer.update(entity,id);
		
		
	}
}

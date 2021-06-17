package com.indictrans.services;

import java.util.List;

import com.indictrans.model.Agent;

public interface AgentService {
	public Agent findById(Long id);
	public List<Agent> getData();
	public void saveData(Agent agentEntity);
	public void update(Agent agentEntity,int id);

}

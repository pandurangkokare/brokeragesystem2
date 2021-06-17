package com.indictrans.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.AgentDao;
import com.indictrans.model.Agent;
@Service
public class AgentServiceImpl implements AgentService {
	@Autowired
	private AgentDao agentDao;

	@Override
	public List<Agent> getData() {
		// TODO Auto-generated method stub
		List<Agent> agent= new ArrayList<Agent>();
		agentDao.findAll().forEach(agent1 ->agent.add(agent1));
		return  agent;
	}

	@Override
	public void saveData(Agent agent) {
		// TODO Auto-generated method stub
		agentDao.save(agent);

	}

	@Override
	public void update(Agent agentEntity, int id) {
		// TODO Auto-generated method stub
	
		List<Agent> findAll = agentDao.findAll();
		findAll.forEach(e ->{
			if(id==e.getId())
			{
				agentDao.save(agentEntity);
			}
		});
	}

	@Override
	public Agent findById(Long id) {
		// TODO Auto-generated method stub
		return agentDao.findById(id);
	}

}

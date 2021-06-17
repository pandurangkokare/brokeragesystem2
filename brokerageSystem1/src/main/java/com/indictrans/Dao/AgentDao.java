package com.indictrans.Dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indictrans.model.Agent;
@Repository
public interface AgentDao extends JpaRepository<Agent, Serializable>  {

	public Agent findById(Long id);
}

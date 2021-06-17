package com.indictrans.services;

import java.util.List;

import com.indictrans.bean.CommissionTableBean;
import com.indictrans.model.Agent;
import com.indictrans.model.CommissionTable;
//import com.indictrans.model.CommissionTable;

public interface CommissionTableService { 
	
	public CommissionTable findById(Long id) ; 
	
	public List<CommissionTable> getRecord();
	
	public void saveRcord(CommissionTableBean entity);
	public void update(CommissionTableBean Entity,int id);

	
}

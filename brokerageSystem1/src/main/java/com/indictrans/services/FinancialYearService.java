package com.indictrans.services;

import java.util.List;

import com.indictrans.bean.FinanYearBean;
import com.indictrans.model.Agent;
import com.indictrans.model.FinancialYear;

public interface FinancialYearService {
	public FinancialYear findById(long id);
public List<FinancialYear> getData();
public void saveData(FinanYearBean year);
public void update(FinanYearBean agentEntity,int id);
}

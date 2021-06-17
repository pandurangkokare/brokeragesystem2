package com.indictrans.services;

import java.util.List;

import com.indictrans.model.Agent;
import com.indictrans.model.AreaBlock;

public interface AreaBlockService {
	
	public List<AreaBlock> getData();
	public void saveData(AreaBlock areaBlock);
	public void update(AreaBlock area,int id);

}

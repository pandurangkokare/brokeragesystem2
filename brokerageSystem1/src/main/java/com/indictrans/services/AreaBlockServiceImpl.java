package com.indictrans.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.AreaDao;
import com.indictrans.model.AreaBlock;
@Service
public class AreaBlockServiceImpl implements AreaBlockService {
	
	@Autowired
	private AreaDao repository;
	@Override
	public List<AreaBlock> getData() {
		// TODO Auto-generated method stub
		List<AreaBlock> area=new ArrayList<AreaBlock>();
		repository.findAll().forEach(area1-> area.add(area1));
		
		return  area;
	}

	@Override
	public void saveData(AreaBlock areaBlock) {
		// TODO Auto-generated method stub
		repository.save(areaBlock);

	}

	@Override
	public void update(AreaBlock area, int id) {
		// TODO Auto-generated method stub
		List<AreaBlock> findAll = repository.findAll();
		findAll.forEach(e->{
			if(id==e.getId())
			{
				repository.save(area);
			}
		});
		
	}

}

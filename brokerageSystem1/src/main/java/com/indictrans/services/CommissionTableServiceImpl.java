package com.indictrans.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.CommissionTableDao;
import com.indictrans.bean.CommissionTableBean;
import com.indictrans.model.CommissionTable;
@Service
public class CommissionTableServiceImpl implements CommissionTableService {
	@Autowired
	private CommissionTableDao commissionTableDao;

	@Override
	public List<CommissionTable> getRecord() {
		// TODO Auto-generated method stub
		List<CommissionTable> cal= new ArrayList<>();
		commissionTableDao.findAll().forEach(cal1 -> cal.add(cal1));
		
		return cal;
	}

	
	
	public void saveRcord(CommissionTableBean entity) {
	try {
		// TODO Auto-generated method stub
		CommissionTable entity1 =new CommissionTable();
		entity1.setFromArea(entity.getFromArea());
		entity1.setToArea(entity.getToArea());
		entity1.setFixed(entity.getFixed());
		entity1.setType(entity.getType());
		entity1.setPercentage(entity.getPercentage());
		entity1.setFromCode(entity.getFromArea());
		entity1.setFromCode(entity.getFromCode());
		entity1.setToCode(entity.getToCode());
		entity1.setFromDate(new SimpleDateFormat("dd/MM/yyyy").parse(entity.getFromDate()));
		entity1.setToDate(new SimpleDateFormat("dd/MM/yyyy").parse(entity.getToDate()));
		commissionTableDao.save(entity1);
	}catch(Exception exception)
	{
		exception.printStackTrace();
		
	}
	}



	@Override
	public void update(CommissionTableBean entity, int id) {
		// TODO Auto-generated method stub
		List<CommissionTable> findAll = commissionTableDao.findAll();
		findAll.forEach(e->{
			if(id==e.getId())
			{
				try {
					// TODO Auto-generated method stub
					CommissionTable entity1 =new CommissionTable();
					entity1.setFromArea(entity.getFromArea());
					entity1.setToArea(entity.getToArea());
					entity1.setFixed(entity.getFixed());
					entity1.setType(entity.getType());
					entity1.setPercentage(entity.getPercentage());
					entity1.setFromCode(entity.getFromCode());
					entity1.setToCode(entity.getToCode());
					entity1.setFromDate(new SimpleDateFormat("dd/MM/yyyy").parse(entity.getFromDate()));
					entity1.setToDate(new SimpleDateFormat("dd/MM/yyyy").parse(entity.getToDate()));
					commissionTableDao.save(entity1);
				}catch(Exception exception)
				{
					exception.printStackTrace();
					
				}
			}
		});
	}



	
	@Override
	public CommissionTable findById(Long id) {
		// TODO Auto-generated method stub
		return commissionTableDao.findById(id);
	}



}

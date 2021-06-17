package com.indictrans.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.FinancialYearDao;
import com.indictrans.bean.FinanYearBean;
import com.indictrans.model.FinancialYear;
@Service
public class FinancialYearServiceImpl implements FinancialYearService {
	@Autowired
	private FinancialYearDao financialYearDao;

	@Override
	public List<FinancialYear> getData() {
		// TODO Auto-generated method stub
		List<FinancialYear> year=new ArrayList<FinancialYear>();
		financialYearDao.findAll().forEach(year1->year.add(year1));
		
		return year;
	}

	@Override
	public void saveData(FinanYearBean year) {
	try
	{
		// TODO Auto-generated method stub
		FinancialYear year2=new FinancialYear();
		year2.setId(year.getId());;
		year2.setFromDate(new SimpleDateFormat("dd/MM/yyyy").parse(year.getFromDate()));
		year2.setToDate(new SimpleDateFormat("dd/MM/yyyy").parse(year.getToDate()));
		financialYearDao.save(year2);

	}
	catch(Exception exception)
	{
		exception.printStackTrace();
	}
	
	
	}

	@Override
	public void update(FinanYearBean year, int id) {
		// TODO Auto-generated method stub
		
		List<FinancialYear> findAll = financialYearDao.findAll();
		findAll.forEach(e->{
			if(id==e.getId())
			{
				try
				{
				FinancialYear year2=new FinancialYear();
				year2.setId(year.getId());
				year2.setFromDate(new SimpleDateFormat("dd/MM/yyyy").parse(year.getFromDate()));
				year2.setToDate(new SimpleDateFormat("dd/MM/yyyy").parse(year.getToDate()));
				financialYearDao.save(year2);
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}	
		});
		
	}

	@Override
	public FinancialYear findById(long id) {
		// TODO Auto-generated method stub
		return financialYearDao.findById(id);

}
}
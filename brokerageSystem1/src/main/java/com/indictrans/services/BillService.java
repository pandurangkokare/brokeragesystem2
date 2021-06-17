package com.indictrans.services;

import java.util.List;

import com.indictrans.bean.BillBean;
import com.indictrans.model.Bill;

public interface BillService {
	
	public List<Bill> getData();
	public Bill saveData(BillBean billBean);
	

}

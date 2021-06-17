package com.indictrans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.indictrans.Dao.CustomerDao;
import com.indictrans.model.Customer;

public interface CustomerService {
	
	public Customer findById(Long  id);
	public List<Customer> getRecord();
	public void setRecord(Customer customerEntity);
	public void update(Customer Entity,int id);
	

}

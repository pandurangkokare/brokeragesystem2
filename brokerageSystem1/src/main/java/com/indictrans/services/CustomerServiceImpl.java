package com.indictrans.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.CustomerDao;
import com.indictrans.model.Customer;
@Service
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired
	private CustomerDao custDao;
	
	@Override
	public List<Customer> getRecord() {
		// TODO Auto-generated method stubist
		List<Customer>  customer=new ArrayList<Customer>();
		custDao.findAll().forEach(customer1->customer.add(customer1));
		return customer;
	}

	@Override
	public void setRecord(Customer customerEntity) {
		// TODO Auto-generated method stub
		custDao.save(customerEntity);
		
	}

	@Override
	public void update(Customer entity, int id) {
		// TODO Auto-generated method stub
		List<Customer> findAll = custDao.findAll();
		findAll.forEach(e->{
			if(id==e.getId())
			{
				custDao.save(entity);
			}
		});
		
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		
		return custDao.findById(id);
	}

}

package com.indictrans.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.CustomerBookedBlockDao;
import com.indictrans.bean.CustomerBookedBlockBean;
import com.indictrans.model.Agent;
import com.indictrans.model.CustomerBookedBlock;
import com.indictrans.model.Customer;
@Service
public class CustomerBookedBlockServiceImpl implements CustomerBookedBlockService {
	
	@Autowired
	private CustomerBookedBlockDao customerBookedBlockDao;
		@Autowired
	private AgentService agentService;
		@Autowired
		private CustomerService customerService;
	@Override
	public List<CustomerBookedBlock> getData() {
		// TODO Auto-generated method stub
		List<CustomerBookedBlock> area=new ArrayList<CustomerBookedBlock>();
		customerBookedBlockDao.findAll().forEach(area1->area.add(area1));
		return area;
	}

	@Override
	public CustomerBookedBlock saveData(CustomerBookedBlockBean customerBookedBlockBean ) {
		// TODO Auto-generated method stubCustomerBookedBlockBean
		CustomerBookedBlock block1=new CustomerBookedBlock();
		try
		{
			Customer customer=customerService.findById(customerBookedBlockBean.getCustId());
			//System.out.println("==========="+customer);
			Agent agent=agentService.findById(customerBookedBlockBean.getAgeId());
		//System.out.println("==============s====================================="+agent);
		
		block1.setId(customerBookedBlockBean.getId());
		//block1.setId(customerBookedBlockBean.getId());
		block1.setCustId(customer);
		block1.setAgeId(agent);
		block1.setCustAreaBook(customerBookedBlockBean.getCustAreaBook());
		block1.setBookDate(new SimpleDateFormat("dd/MM/yyyy").parse(customerBookedBlockBean.getBookDate()));
	//	Date date=new Date();
		block1.setCreateDate(new Date());
		
		
		
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	 ;
	return customerBookedBlockDao.save(block1);

	}

	@Override
	public CustomerBookedBlock findById(Long id) {
		// TODO Auto-generated method stub
		return  customerBookedBlockDao.findById(id);
	}

	@Override
	public CustomerBookedBlock findByAgeIdAndCustId(Long ageId, Long custId) {
		// TODO Auto-generated method stub
		return (CustomerBookedBlock) customerBookedBlockDao.findByAgeIdAndCustId(ageId, custId);
	}

}

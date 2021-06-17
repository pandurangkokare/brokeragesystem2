package com.indictrans.services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.indictrans.bean.CustomerBookedBlockBean;
import com.indictrans.model.CustomerBookedBlock;
public interface CustomerBookedBlockService {

	public CustomerBookedBlock findById(Long id);
	public List<CustomerBookedBlock> getData();
	public CustomerBookedBlock saveData(CustomerBookedBlockBean block);
	public CustomerBookedBlock findByAgeIdAndCustId(Long ageId,Long custId);
}

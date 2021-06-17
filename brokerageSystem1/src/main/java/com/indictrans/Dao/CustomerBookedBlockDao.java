package com.indictrans.Dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indictrans.model.CustomerBookedBlock;
@Repository
public interface CustomerBookedBlockDao extends JpaRepository<CustomerBookedBlock, Serializable> {

	public CustomerBookedBlock findById(Long id);
	public List<CustomerBookedBlock> findByAgeIdAndCustId(Long ageId,Long custId);
}

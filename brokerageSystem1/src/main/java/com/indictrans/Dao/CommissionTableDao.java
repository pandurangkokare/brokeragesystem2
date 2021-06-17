package com.indictrans.Dao;



import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indictrans.model.CommissionTable;

@Repository
public interface CommissionTableDao extends JpaRepository<CommissionTable,Serializable>{

	public CommissionTable  findById(Long id);
}

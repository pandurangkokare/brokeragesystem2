package com.indictrans.Dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indictrans.model.FinancialYear;
@Repository
public interface FinancialYearDao extends JpaRepository<FinancialYear, Serializable> {

	public FinancialYear findById(Long id);
}

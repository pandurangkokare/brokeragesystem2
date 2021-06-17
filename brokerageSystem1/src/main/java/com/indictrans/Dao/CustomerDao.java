package com.indictrans.Dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indictrans.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Serializable> {

	public Customer findById(Long id);
}

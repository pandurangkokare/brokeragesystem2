package com.indictrans.Dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indictrans.model.Bill;
@Repository
public interface BillDao extends JpaRepository<Bill, Serializable>{

}

package com.indictrans.Dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indictrans.model.AreaBlock;

public interface AreaDao  extends JpaRepository<AreaBlock, Serializable>{

}

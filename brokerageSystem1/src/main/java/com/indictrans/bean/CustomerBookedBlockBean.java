package com.indictrans.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.indictrans.model.Agent;
import com.indictrans.model.Customer;

public class CustomerBookedBlockBean {
	
	private Long id;
	private Long custId;
	private Long ageId;
	private  Integer custAreaBook;
	private  String bookDate;
	private String createDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public Long getAgeId() {
		return ageId;
	}
	public void setAgeId(Long ageId) {
		this.ageId = ageId;
	}
	public Integer getCustAreaBook() {
		return custAreaBook;
	}
	public void setCustAreaBook(Integer custAreaBook) {
		this.custAreaBook = custAreaBook;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "CustomerBookedBlockBean [id=" + id + ", custId=" + custId + ", ageId=" + ageId + ", custAreaBook="
				+ custAreaBook + ", bookDate=" + bookDate + ", createDate=" + createDate + "]";
	}
	
	
	
	
	
	
	
}

package com.indictrans.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "CustomerBookedBlock4")
@Data
public class CustomerBookedBlock {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="custId",nullable = false)
	private Customer custId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ageId",nullable = false)
	private Agent ageId;
	@Column(name = "custAreaBook")
	private  Integer custAreaBook;
	@Column(name = "bookDate")
	private  Date bookDate;
	@Column(name="createDate")
	private Date createDate;
	
	  
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="customerBookedBlockId")
	private List<Bill> bill= new ArrayList<Bill>();

	public List<Bill> getBill() {
		return bill;
	}

	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}

	



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public Agent getAgeId() {
		return ageId;
	}

	public void setAgeId(Agent ageId) {
		this.ageId = ageId;
	}

	public Integer getCustAreaBook() {
		return custAreaBook;
	}

	public void setCustAreaBook(Integer custAreaBook) {
		this.custAreaBook = custAreaBook;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "CustomerBookedBlock [id=" + id + ", custId=" + custId + ", ageId=" + ageId + ", custAreaBook="
				+ custAreaBook + ", bookDate=" + bookDate + ", createDate=" + createDate + ", bill=" + bill + "]";
	}

	






	
}

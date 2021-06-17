package com.indictrans.model;

import java.util.ArrayList;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Entity
@Table(name="AgentTable4")
@Data
public class Agent {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="mobileno")
	private Long mobileNo;
	
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="ageId")
	private List<CustomerBookedBlock> block=new ArrayList<CustomerBookedBlock>();
	


	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="AgeId")
	private List<Bill> bill=new ArrayList<Bill>();


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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public List<CustomerBookedBlock> getBlock() {
		return block;
	}


	public void setBlock(List<CustomerBookedBlock> block) {
		this.block = block;
	}


	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", block=" + block + ", bill=" + bill
				+ "]";
	}


	




	
	
}

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="financialyear1")
public class FinancialYear {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name="fromDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat
	private Date fromDate;
	@Column(name="toDate")
	private Date toDate;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="fYearId")
	private List<Bill> block=new ArrayList<Bill>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public List<Bill> getBlock() {
		return block;
	}
	public void setBlock(List<Bill> block) {
		this.block = block;
	}
	@Override
	public String toString() {
		return "FinancialYear [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", block=" + block + "]";
	}
	
	
}

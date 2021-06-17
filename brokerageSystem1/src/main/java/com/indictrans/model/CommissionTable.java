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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="commissionTable7")
public class CommissionTable {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="fromArea")
	private Long fromArea;
	
	@Column(name = "toArea")
	private Long toArea;
	
	@Column(name="type")
	private Integer type;
	
	@Column(name = "fixed")
	private Integer fixed;
	
	@Column(name = "percentage")
	private Integer percentage;
	
	@Column(name = "fromCode")
	private Long fromCode;
	
	@Column(name = "toCode")
	private Long toCode;
	
	@Column(name = "fromDate")
	private Date fromDate;
	
	@Column(name="toDtate")
    private Date toDate;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="commiTableId")
	private List<Bill> block=new ArrayList<Bill>();
	

	
	  public List<Bill> getBlock() { return block; }
	  
	  public void setBlock(List<Bill> block) { this.block = block; }
	 




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFixed() {
		return fixed;
	}

	public void setFixed(Integer fixed) {
		this.fixed = fixed;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}



	public Long getFromArea() {
		return fromArea;
	}



	public void setFromArea(Long fromArea) {
		this.fromArea = fromArea;
	}

	public Long getToArea() {
		return toArea;
	}

	public void setToArea(Long toArea) {
		this.toArea = toArea;
	}

	public Long getFromCode() {
		return fromCode;
	}

	public void setFromCode(Long fromCode) {
		this.fromCode = fromCode;
	}

	public Long getToCode() {
		return toCode;
	}

	public void setToCode(Long toCode) {
		this.toCode = toCode;
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
	
	  @Override public String toString() { return "CommissionTable [id=" + id +
	  ", fromArea=" + fromArea + ", toArea=" + toArea + ", type=" + type +
	  ", fixed=" + fixed + ", percentage=" + percentage + ", fromCode=" + fromCode
	  + ", toCode=" + toCode + ", fromDate=" + fromDate + ", toDate=" + toDate +
	  ", block=" + block + "]"; }
	 








	



}

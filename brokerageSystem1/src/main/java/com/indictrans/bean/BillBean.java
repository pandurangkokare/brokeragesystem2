package com.indictrans.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.indictrans.model.Agent;
import com.indictrans.model.CommissionTable;
import com.indictrans.model.CustomerBookedBlock;
import com.indictrans.model.Customer;
import com.indictrans.model.FinancialYear;

public class BillBean {

	 private Long id;
	  private Long commiTableId ;
	  private Long fYearId;
	  private Long custId;
	   private Long ageId;
	  private String billDate;
	 
	  private Integer commissionAmount;
	  private Long customerBookedBlockId;
	  private Integer per;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCommiTableId() {
		return commiTableId;
	}
	public void setCommiTableId(Long commiTableId) {
		this.commiTableId = commiTableId;
	}
	public Long getfYearId() {
		return fYearId;
	}
	public void setfYearId(Long fYearId) {
		this.fYearId = fYearId;
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
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public Integer getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Integer commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public Long getCustomerBookedBlockId() {
		return customerBookedBlockId;
	}
	public void setCustomerBookedBlockId(Long customerBookedBlockId) {
		this.customerBookedBlockId = customerBookedBlockId;
	}
	public Integer getPer() {
		return per;
	}
	public void setPer(Integer per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "BillBean [id=" + id + ", commiTableId=" + commiTableId + ", fYearId=" + fYearId + ", custId=" + custId
				+ ", ageId=" + ageId + ", billDate=" + billDate + ", commissionAmount=" + commissionAmount
				+ ", customerBookedBlockId=" + customerBookedBlockId + ", per=" + per + "]";
	}
	

	
	  
}

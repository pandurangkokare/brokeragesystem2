
  package com.indictrans.model;
  
  import java.util.Date;
  
  import javax.persistence.Column; import javax.persistence.Entity; import
  javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
  javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne; import
  javax.persistence.Table;
  
  @Entity
  @Table(name = "Bill6") 
  public class Bill {
  
  @Id
  @GeneratedValue
  @Column(name="id") 
  private Long id; 
 
  @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name="commiTableId",nullable = false)
  private CommissionTable commiTableId ;
 
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fYearId",nullable = false)
  private FinancialYear fYearId;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "custId",nullable = false)
  private Customer custId;
  

@ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "AgeId",nullable = false)
  private Agent AgeId;
  
  @Column(name = "billDate") 
  private Date billDate;
  
  
  
  @Column(name = "commissionAmount")
  private Integer commissionAmount;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customerBookedBlockId" ,nullable = false)
  private CustomerBookedBlock customerBookedBlockId;
  
  @Column(name="CommissionInPer")
  private Integer CommissionInPer;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}



public FinancialYear getfYearId() {
	return fYearId;
}

public void setfYearId(FinancialYear fYearId) {
	this.fYearId = fYearId;
}

public Customer getCustId() {
	return custId;
}

public void setCustId(Customer custId) {
	this.custId = custId;
}

public Agent getAgeId() {
	return AgeId;
}

public void setAgeId(Agent ageId) {
	AgeId = ageId;
}

public Date getBillDate() {
	return billDate;
}

public void setBillDate(Date billDate) {
	this.billDate = billDate;
}

public Integer getCommissionAmount() {
	return commissionAmount;
}

public void setCommissionAmount(Integer commissionAmount) {
	this.commissionAmount = commissionAmount;
}

public CustomerBookedBlock getCustomerBookedBlockId() {
	return customerBookedBlockId;
}

public void setCustomerBookedBlockId(CustomerBookedBlock customerBookedBlockId) {
	this.customerBookedBlockId = customerBookedBlockId;
}

public Integer getCommissionInPer() {
	return CommissionInPer;
}

public void setCommissionInPer(Integer commissionInPer) {
	CommissionInPer = commissionInPer;
}

public CommissionTable getCommiTableId() {
	return commiTableId;
}

public void setCommiTableId(CommissionTable commiTableId) {
	this.commiTableId = commiTableId;
}

@Override
public String toString() {
	return "Bill [id=" + id + ", commiTableId=" + commiTableId + ", fYearId=" + fYearId + ", custId=" + custId
			+ ", AgeId=" + AgeId + ", billDate=" + billDate + ", commissionAmount=" + commissionAmount
			+ ", customerBookedBlockId=" + customerBookedBlockId + ", CommissionInPer=" + CommissionInPer + "]";
}


   
  }
 
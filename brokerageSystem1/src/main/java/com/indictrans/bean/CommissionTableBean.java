package com.indictrans.bean;

import java.util.Date;

import javax.persistence.Column;

public class CommissionTableBean {

	private Long id;
	
	private Long fromArea;
	
	
	private Long toArea;
	

	private Integer type;
	

	private Integer fixed;
	
	
	private Integer percentage;
	

	private Long fromCode;
	
	
	private Long toCode;
	
	
	private String fromDate;
	private String toDate;
	
	
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
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
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
	@Override
	public String toString() {
		return "CommissionTable [id=" + id + ", fromArea=" + fromArea + ", toArea=" + toArea + ", type=" + type
				+ ", fixed=" + fixed + ", percentage=" + percentage + ", fromCode=" + fromCode + ", toCode=" + toCode
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	
}

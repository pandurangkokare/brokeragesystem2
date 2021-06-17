package com.indictrans.bean;

public class FinanYearBean {
	
	private Long id;
	private String fromDate;
	private String toDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "FinanYear [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	

}

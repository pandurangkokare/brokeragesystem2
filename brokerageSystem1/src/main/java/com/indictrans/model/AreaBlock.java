package com.indictrans.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="areaBlock3")

public class AreaBlock {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name="fromArea")
	private Long fromArea;
	@Column(name="toArea")
	private Long toArea;
	@Column(name ="rcode")
	private Integer rcode;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getRcode() {
		return rcode;
	}
	public void setRcode(Integer rcode) {
		this.rcode = rcode;
	}
	@Override
	public String toString() {
		return "AreaBlock [id=" + id + ", fromArea=" + fromArea + ", toArea=" + toArea + ", rcode=" + rcode + "]";
	}
	

}

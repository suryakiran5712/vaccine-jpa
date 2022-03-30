package com.cg.eis.entities;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="aadharcard")
public class AadharCard extends IdCard implements Serializable{
	@Column(length=15)
	private	long adharNo;
	@Column(length=15)
	private	String figerprints;
	@Column(length=15)
	private	String irisscan;
	
	
	public AadharCard() {}
	public AadharCard(long adharNo, String figerprints, String irisscan,int id,
		String name,LocalDate dob,String gender,String add,String city,String state,String pincode) 
	{
		super();
		this.adharNo = adharNo;
		this.figerprints = figerprints;
		this.irisscan = irisscan;
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.gender=gender;
		this.address=add;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getFigerprints() {
		return figerprints;
	}
	public void setFigerprints(String figerprints) {
		this.figerprints = figerprints;
	}
	public String getIrisscan() {
		return irisscan;
	}
	public void setIrisscan(String irisscan) {
		this.irisscan = irisscan;
	}
	@Override
	public String toString() {
		return "AadharCard [adharNo=" + adharNo + ", figerprints=" + figerprints + ", irisscan=" + irisscan + "]";
	}
	
}
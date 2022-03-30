package com.cg.eis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "pancard")
public class PanCard extends IdCard {
	@Column(length =15)
	String panNo;
	public PanCard() {
		// TODO Auto-generated constructor stub
	}
	public PanCard(String panNo,int id,
			String name,LocalDate dob,String gender,String add,String city,String state,String pincode) 
		{
			super();
			this.panNo=panNo;
			this.id=id;
			this.name=name;
			this.dob=dob;
			this.gender=gender;
			this.address=add;
			this.city=city;
			this.state=state;
			this.pincode=pincode;
		}

}

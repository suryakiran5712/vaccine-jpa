package com.cg.eis.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="idcard")
public abstract class IdCard {
	@Id
		protected int id;
	@Column(length=5)
		protected String name;
	@Column
	 	protected LocalDate dob;
	@Column(length=10)
		protected String gender;
	@Column(length=15)
		protected String address;
	@Column(length=10)
		protected String city;
	@Column(length=10)
		protected String state;
	@Column(length=10)
		protected String pincode;

}
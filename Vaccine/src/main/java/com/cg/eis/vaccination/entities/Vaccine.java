package com.cg.eis.vaccination.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccine")
public class Vaccine {
	@Id
	private int vaccineId;
	@Column(length = 20,unique=true)
	private String vaccninName;
	@Column(length = 20)
	private String description;
	public Vaccine() {
		
	}
	
	public Vaccine(int vaccineId, String vaccninName, String description) {
		this.vaccineId = vaccineId;
		this.vaccninName = vaccninName;
		this.description = description;
	}

	public int getVaccineId() {
		return vaccineId;
	}
	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}
	public String getVaccninName() {
		return vaccninName;
	}
	public void setVaccninName(String vaccninName) {
		this.vaccninName = vaccninName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", vaccninName=" + vaccninName + ", description=" + description
				+ "]";
	}
}

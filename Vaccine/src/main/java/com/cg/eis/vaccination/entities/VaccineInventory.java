package com.cg.eis.vaccination.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vaccineinventory")
public class VaccineInventory implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="code")
	
	private VaccinationCenter center;
	
	
	@OneToMany(mappedBy="vaccine",cascade=CascadeType.ALL)
	private List<VaccineCount> vaccinelist;
	@Column
	private LocalDate vaccinedate;
	
	public VaccineInventory() {
		
	}

	public VaccineInventory(VaccinationCenter center, List<VaccineCount> vaccinelist, LocalDate date) {
		this.center = center;
		this.vaccinelist = vaccinelist;
		this.vaccinedate = date;
	}

	public VaccinationCenter getCenter() {
		return center;
	}

	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}

	public List<VaccineCount> getVaccinelist() {
		return vaccinelist;
	}

	public void setVaccinelist(List<VaccineCount> vaccinelist) {
		this.vaccinelist = vaccinelist;
	}

	public LocalDate getDate() {
		return vaccinedate;
	}

	public void setDate(LocalDate date) {
		this.vaccinedate = date;
	}

	@Override
	public String toString() {
		return "VaccineInventory [center=" + center + ", vaccinelist=" + vaccinelist + ", date=" + vaccinedate + "]";
	}

	
	
}


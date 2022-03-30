package com.cg.eis.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vaccinecount")
public class VaccineCount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne(cascade=CascadeType.ALL)
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vaccineId")
	Vaccine vaccine;
	@Column()
	int quantity;
	@Column()
	double price;
	public VaccineCount() {
		// TODO Auto-generated constructor stub
	}
	
	public VaccineCount(Vaccine vaccine, int quantity, double price) {
		this.vaccine = vaccine;
		this.quantity = quantity;
		this.price = price;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}
	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VaccineCount [vaccine=" + vaccine + ", quantity=" + quantity + ", price=" + price + "]";
	}
}

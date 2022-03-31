package com.cg.eis.vaccination.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@Column(length=10)
	long bookingid;
	
	@Column(length=10)
	long mobileno;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aadharNo")
	Member member;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "code")
	VaccinationCenter center;
	@Column
	LocalDate dateofbooking;
	@Column
	Slot slot;
	@Column(length = 5)
	String bookingstatus;
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	public Appointment(long bookingid, long mobileno, Member member, VaccinationCenter center, LocalDate dateofbooking,
			Slot slot, String bookingstatus) {
		this.bookingid = bookingid;
		this.mobileno = mobileno;
		this.member = member;
		this.center = center;
		this.dateofbooking = dateofbooking;
		this.slot = slot;
		this.bookingstatus = bookingstatus;
	}
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public LocalDate getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(LocalDate dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	@Override
	public String toString() {
		return "Appointment [bookingid=" + bookingid + ", mobileno=" + mobileno + ", member=" + member + ", center="
				+ center + ", dateofbooking=" + dateofbooking + ", slot=" + slot.getTimeslot() + ", bookingstatus=" + bookingstatus
				+ "]";
	}
	
}

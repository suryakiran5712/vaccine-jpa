package com.cg.eis.vaccination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.cg.eis.vaccination.entities.Vaccine;

public interface VaccineService {
	
		public Vaccine addVaccine(Vaccine vaccine);
		public void updateVaccine(Vaccine vaccine);
		public void deleteVaccine(Vaccine vaccine);
	
		public Vaccine getVaccineByName(String vaccinName);
		public Vaccine getVaccineById(int vaccineId);
		public List<Vaccine> getAllVaccine();
	}



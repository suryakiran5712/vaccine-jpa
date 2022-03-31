package com.cg.eis.vaccination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.eis.vaccination.entities.Vaccine;
import com.cg.eis.vaccination.repositories.VaccineRepository;

@Service
public class VaccineServiceImpl implements VaccineService{
	@Autowired
	VaccineRepository vaccinerepo;
	@Override
	public Vaccine addVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		return vaccinerepo.save(vaccine);
	
	}

	@Override
	public void updateVaccine(Vaccine vaccine) {
		if(vaccinerepo.existsById(vaccine.getVaccineId())) {
			vaccinerepo.save(vaccine);
		}
		
	}

	@Override
	public void deleteVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		vaccinerepo.delete(vaccine);
	
	}

	@Override
	public Vaccine getVaccineByName(String vaccinName) {
	
		return vaccinerepo.getVaccineByName(vaccinName);
	}

	@Override
	public Vaccine getVaccineById(int vaccineId) {
		// TODO Auto-generated method stub
		return vaccinerepo.getVaccineById(vaccineId);
		
	}

	@Override
	public List<Vaccine> getAllVaccine() {
		// TODO Auto-generated method stub
		
		return vaccinerepo.findAll();
	}
	

}

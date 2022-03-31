package com.cg.eis.vaccination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.eis.vaccination.entities.VaccinationCenter;
import com.cg.eis.vaccination.repositories.VaccinationCenterRepository;

@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService{

	@Autowired
	VaccinationCenterRepository vcrepo;
	
	@Override
	public VaccinationCenter addVaccineCenter(VaccinationCenter center) {
		return vcrepo.save(center);
	}
	
	@Override
	public void deleteVaccineCenter(VaccinationCenter center) {
		vcrepo.delete(center);
	}
	
	@Override
	public Optional<VaccinationCenter> getVaccineCenter(int centerid) {
		return vcrepo.findById(centerid);
	}
	
	@Override
	public List<VaccinationCenter> getAllVaccineCenters() {
		return vcrepo.findAll();
	}

	@Override
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center) {
		
		if(vcrepo.existsById(center.getCode())) {
			return vcrepo.save(center);
		}
		return null;
	}

	

}

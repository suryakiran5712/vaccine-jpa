package com.cg.eis.vaccination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.eis.vaccination.entities.Member;
import com.cg.eis.vaccination.entities.VaccineRegistration;
import com.cg.eis.vaccination.repositories.VaccineRegistrationRepository;
@Service
public class VaccineRegistrationServiceImpl implements VaccineRegistrationService{

	@Autowired
	VaccineRegistrationRepository vrrepo;

	@Override
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg) {
		
		return vrrepo.save(reg);
	}
	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration reg) {
		if(vrrepo.existsById(reg.getMobileno()))
		{
			return vrrepo.save(reg);
		}
		return null;
	}

	@Override
	public void deleteVaccineRegistration(VaccineRegistration reg) {
		
		vrrepo.delete(reg);
	}
	@Override
	public VaccineRegistration getVaccineRegistration(long mobileno) {
	
		return vrrepo.getByMobile(mobileno);
	}
	
	
	@Override
	public List<VaccineRegistration> getAllVaccineRegistrations() {
		
		return vrrepo.findAll();
	}
}
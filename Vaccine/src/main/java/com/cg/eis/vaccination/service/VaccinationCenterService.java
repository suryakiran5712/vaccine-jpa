package com.cg.eis.vaccination.service;

import java.util.List;
import java.util.Optional;

import com.cg.eis.vaccination.entities.VaccinationCenter;
 
public interface VaccinationCenterService {

	public VaccinationCenter addVaccineCenter(VaccinationCenter center);
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center);
	public void deleteVaccineCenter(VaccinationCenter center);
	public Optional<VaccinationCenter> getVaccineCenter(int centerid);
	public List<VaccinationCenter> getAllVaccineCenters();

}

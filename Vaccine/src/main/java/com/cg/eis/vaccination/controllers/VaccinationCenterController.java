package com.cg.eis.vaccination.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.eis.vaccination.entities.VaccinationCenter;
import com.cg.eis.vaccination.entities.Vaccine;
import com.cg.eis.vaccination.service.VaccinationCenterService;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

	@Autowired
	VaccinationCenterService vcservice;
	
	@PostMapping
	public ResponseEntity<String> addVaccineCenter(@RequestBody VaccinationCenter center)
	{
		vcservice.addVaccineCenter(center);
		return new ResponseEntity<String>("added successfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<Optional<VaccinationCenter>> getVaccineCenter(@PathVariable int code)
	{
		Optional<VaccinationCenter> list=vcservice.getVaccineCenter(code);
		return new ResponseEntity<Optional<VaccinationCenter>>(list,HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<String> updateVaccineCenter(@RequestBody VaccinationCenter center)
	{
		vcservice.updateVaccineCenter(center);
		return new ResponseEntity<String>("Updated successfully",HttpStatus.OK);
		
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteVaccineCenter(@RequestBody VaccinationCenter center)
	{
		vcservice.deleteVaccineCenter(center);;
		return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<VaccinationCenter>> getAllVaccineCenters()
	{
		List<VaccinationCenter>list=vcservice.getAllVaccineCenters();
		return new ResponseEntity<List<VaccinationCenter>>(list,HttpStatus.OK);
	}
}

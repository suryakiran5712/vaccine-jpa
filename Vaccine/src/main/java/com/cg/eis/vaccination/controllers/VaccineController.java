package com.cg.eis.vaccination.controllers;

import java.util.List;


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

import com.cg.eis.vaccination.entities.Vaccine;
import com.cg.eis.vaccination.service.VaccineService;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {

	@Autowired
	VaccineService vacservice;
	
	@PostMapping
	public ResponseEntity<String> addVaccine(@RequestBody Vaccine vaccine)
	{
		vacservice.addVaccine(vaccine);
		return new ResponseEntity<String>("added successfully",HttpStatus.OK);
		
	}
	
	@PutMapping
	public ResponseEntity<String> updateVaccine(@RequestBody Vaccine vaccine)
	{
		vacservice.updateVaccine(vaccine);
		return new ResponseEntity<String>("Updated successfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vaccine> getVaccineById(@PathVariable int id)
	{
		Vaccine list=vacservice.getVaccineById(id);
		return new ResponseEntity<Vaccine>(list,HttpStatus.OK);
	}
	
	@GetMapping("/get/{name}")
	public ResponseEntity<Vaccine> getVaccineByName(@PathVariable String name)
	{
		Vaccine list=vacservice.getVaccineByName(name);
		return new ResponseEntity<Vaccine>(list,HttpStatus.OK);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Vaccine>> getAllVaccine()
	{
		List<Vaccine>list=vacservice.getAllVaccine();
		return new ResponseEntity<List<Vaccine>>(list,HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteVaccine(@RequestBody Vaccine vaccine)
	{
		vacservice.deleteVaccine(vaccine);
		return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);
	}
}

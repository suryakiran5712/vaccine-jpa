package com.cg.eis.vaccination.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.eis.vaccination.entities.IdCard;
import com.cg.eis.vaccination.service.IdCardService;

@RestController
@RequestMapping("/IdCard")
public class IdCardController {

@Autowired
IdCardService idcs;

@PostMapping
public ResponseEntity<String> addIdCard(@RequestBody IdCard idcard)
{
	 idcs.addIdCard(idcard);
	 return new ResponseEntity<String>("added successfully",HttpStatus.OK);
}



@GetMapping("/{aadharNo}")
public ResponseEntity<IdCard> getAdharCardByNo(long aadharNo)
{
	IdCard list1=idcs.getAdharCardByNo(aadharNo);
	return new ResponseEntity<IdCard>(list1,HttpStatus.OK);
	
}
}

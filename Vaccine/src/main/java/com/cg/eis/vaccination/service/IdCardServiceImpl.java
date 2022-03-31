package com.cg.eis.vaccination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.eis.vaccination.entities.IdCard;
import com.cg.eis.vaccination.repositories.IdCardRepository;

@Service
public class IdCardServiceImpl implements IdCardService {
	@Autowired
	IdCardRepository idCardRepo;
	
	@Override
	public IdCard addIdCard(IdCard idcard) {
		return idCardRepo.save(idcard);
		
	}

	

	@Override
	public IdCard getAdharCardByNo(long aadharNo) {
		// TODO Auto-generated method stub
		return idCardRepo.getByAadhar(aadharNo);
	}

}

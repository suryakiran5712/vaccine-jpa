package com.cg.eis.vaccination.service;

import com.cg.eis.vaccination.entities.IdCard;

public interface IdCardService {
	public IdCard addIdCard (IdCard idcard);
	
	public IdCard getAdharCardByNo(long adharno);
}

package com.cg.eis.vaccination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.eis.vaccination.entities.IdCard;

public interface IdCardRepository extends JpaRepository<IdCard,Long> {
	
	@Query(value="select a from IdCard a where aadharNo=?1")
	public IdCard getByAadhar(long aadharNo);
}


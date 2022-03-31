package com.cg.eis.vaccination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.eis.vaccination.entities.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Integer> {
	@Query(value="select v from Vaccine v where vaccninName=?1")
	public Vaccine getVaccineByName(String vaccinName);
	
	@Query(value="select v from Vaccine v where vaccineId=?1")
	public Vaccine getVaccineById(int vaccineId) ;
			
	
}

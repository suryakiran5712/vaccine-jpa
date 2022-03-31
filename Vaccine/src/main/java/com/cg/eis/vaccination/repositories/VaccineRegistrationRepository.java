package com.cg.eis.vaccination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.eis.vaccination.entities.VaccineRegistration;

@Repository
public interface VaccineRegistrationRepository extends JpaRepository<VaccineRegistration,Long>{

	@Query(value="select a from VaccineRegistration a where mobileno=?1")
	public VaccineRegistration getByMobile(long mobileno);
}


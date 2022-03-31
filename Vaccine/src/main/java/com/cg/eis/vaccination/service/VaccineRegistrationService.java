package com.cg.eis.vaccination.service;
import java.util.List;

import com.cg.eis.vaccination.entities.Member;
import com.cg.eis.vaccination.entities.VaccineRegistration;

	public interface VaccineRegistrationService {
		public VaccineRegistration addVaccineRegistration (VaccineRegistration reg);
		public VaccineRegistration updateVaccineRegistration (VaccineRegistration reg);
		public void deleteVaccineRegistration (VaccineRegistration reg);
		public VaccineRegistration getVaccineRegistration (long mobileno);
		//public List<Member> getAllMember(long mobileno);
		public List<VaccineRegistration> getAllVaccineRegistrations();

	}


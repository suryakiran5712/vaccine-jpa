package com.cg.eis.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VaccinationMain {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("CAP_SK");
		EntityManager man=factory.createEntityManager();
		EntityTransaction tran=man.getTransaction();
		List<VaccineCount> vCountList=new ArrayList<>();
		List<Member> memlist=new ArrayList<>();
		 tran.begin();
		
		Vaccine v1=new Vaccine(101,"Covin","Vaccine1");
		Vaccine v2=new Vaccine(102,"Covax","Vaccine2");
		Vaccine v3=new Vaccine(103,"Covaxin","Vaccine3");
		Vaccine v4=new Vaccine(104,"Covidvac","Vaccine4");
		
		man.persist(v1);
		man.persist(v2);
		man.persist(v3);
		man.persist(v4);
		
		VaccineCount vCount=new VaccineCount(v1,100,300);
		vCountList.add(vCount);
		VaccineCount vCount2=new VaccineCount(v2,150,400);
		vCountList.add(vCount2);
		VaccineCount vCount3=new VaccineCount(v3,200,500);
		vCountList.add(vCount3);
		VaccineCount vCount4=new VaccineCount(v4,250,600);
		vCountList.add(vCount4);	
		
		man.persist(vCount);
		man.persist(vCount2);
		man.persist(vCount3);
		man.persist(vCount4);

		VaccinationCenter vCenter1=new VaccinationCenter(1001,"xyz_center","1-23,xyz_street",
				"xyz_city","xyz_state","111111");
	VaccinationCenter vCenter2=new VaccinationCenter(2002,"abc_center","2-3,abc_street",
               "abc_city","abc_state","222222");
		VaccinationCenter vCenter3=new VaccinationCenter(3003,"pqr_center","5-98,pqr_street",
                "pqr_city","pqr_state","333333");
		VaccinationCenter vCenter4=new VaccinationCenter(4004,"mno_center","6-78,mno_street",
                "mno_city","mno_state","444444");
		
		man.persist(vCenter1);
		man.persist(vCenter2);
		man.persist(vCenter3);
		man.persist(vCenter4);
		
		VaccineInventory vInventary1=new VaccineInventory(vCenter1,vCountList,LocalDate.now());
		VaccineInventory vInventary2=new VaccineInventory(vCenter2,vCountList,LocalDate.now());
		VaccineInventory vInventary3=new VaccineInventory(vCenter3,vCountList,LocalDate.now());
	    VaccineInventory vInventary4=new VaccineInventory(vCenter4,vCountList,LocalDate.now());

		man.persist(vInventary1);
		man.persist(vInventary2);
		man.persist(vInventary3);
		man.persist(vInventary4);

		
		VaccineInventory vin=man.find(VaccineInventory.class,1001);
//		System.out.println(vin);
		
		
		IdCard idCard1=new AadharCard(123456L,"finger_print1","irrisScan1",111,"abcd",LocalDate.now(),
				"M","abcd_address","abcd_city","abcd_state","5468966");
		
		IdCard idCard2=new PanCard("ASA556585",112,"abcd",LocalDate.now(),
				"M","abcd_address","abcd_city","abcd_state","5468966");
		man.persist(idCard1);
		man.persist(idCard2);
		
		Member mem1=new Member(idCard1,"true","false",LocalDate.now(),LocalDate.now(),v1);
		Member mem2=new Member(idCard2,"true","false",LocalDate.now(),LocalDate.now(),v2);
		man.persist(mem1);
		man.persist(mem2);

		
		

		memlist.add(mem1);
		memlist.add(mem2);
		VaccineRegistration vaccreg=new VaccineRegistration(12345678,LocalDate.now(),memlist);
		man.persist(vaccreg);
		
		
		Appointment app1=new Appointment(123456L,464684L,mem1,vCenter1,LocalDate.now(),Slot.slot2,"true");
		
		man.persist(app1);
		tran.commit();
		Appointment ap=man.find(Appointment.class,123456L);
		System.out.println(ap);
		
//	System.out.println(vaccreg.getMemberlist().get(0).getDose1date());
		
//		VaccineInventory vIn=man.find(VaccineInventory.class,3003);
//	    System.out.println(vIn.getCenter());
	    
System.out.println(ap.getSlot().getTimeslot());
		System.out.println("Done");
		
	}
}
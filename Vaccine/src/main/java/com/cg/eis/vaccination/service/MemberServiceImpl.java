package com.cg.eis.vaccination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.eis.vaccination.dto.MemberDto;
import com.cg.eis.vaccination.entities.IdCard;
import com.cg.eis.vaccination.entities.Member;
import com.cg.eis.vaccination.entities.Vaccine;
import com.cg.eis.vaccination.entities.VaccineRegistration;
import com.cg.eis.vaccination.repositories.IdCardRepository;
import com.cg.eis.vaccination.repositories.MemberRepository;
import com.cg.eis.vaccination.repositories.VaccineRepository;

@Service
public class MemberServiceImpl implements MemberService{
@Autowired
MemberRepository memRepo;
@Autowired
VaccineRepository vacRepo;
@Autowired
IdCardRepository aaRepo;
	@Override
	public Member addMember(MemberDto member) {
		Vaccine vaccine=vacRepo.getVaccineById(member.getVaccineId());
		IdCard aCard=aaRepo.getByAadhar(member.getAadharNo());
		Member mem1=new Member(aCard,member.getDose1status(),member.getDose2status()
				,member.getDose1date(),member.getDose2date(),vaccine);
		return memRepo.save(mem1);
	}

	@Override
	public Member updateMember(MemberDto member) {
		Vaccine vaccine=vacRepo.getVaccineById(member.getVaccineId());
		IdCard aCard=aaRepo.getByAadhar(member.getAadharNo());
		Member mem1=new Member(aCard,member.getDose1status(),member.getDose2status()
				,member.getDose1date(),member.getDose2date(),vaccine);
		System.out.println(memRepo.findById(member.getAadharNo()));
//		if(memRepo.existsById(mem1.getMemberId()))
//		{
//			memRepo.save(mem1);
//			return mem1;
//		}
		return null;
	}

	@Override
	public String deleteMember(MemberDto member) {
		Vaccine vaccine=vacRepo.getVaccineById(member.getVaccineId());
		IdCard aCard=aaRepo.getByAadhar(member.getAadharNo());
		Member mem1=new Member(aCard,member.getDose1status(),member.getDose2status()
				,member.getDose1date(),member.getDose2date(),vaccine);

		if(memRepo.existsById(mem1.getMemberId()))
		{
			memRepo.delete(mem1);
			return "true";
		}
		return "false";
	}

//	@Override
//	public Member getMemberByAdharNo(long adharno) {
//		return memRepo.getMemberByAadharNo(adharno);
//		
//	}

	@Override
	public List<Member> getAllMember() {
		return memRepo.findAll();
	}

	@Override
	public Member getMemberById(long memberId) {
		return memRepo.getMemberById(memberId);
	}

}

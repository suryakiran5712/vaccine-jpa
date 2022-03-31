package com.cg.eis.vaccination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.eis.vaccination.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	@Query(value = "select m from Member m where m.memberId=?1")
	public Member getMemberById(long memberId);
	@Query(value = "select m from member m,Idcard i"+" where m.aadharNo=i.aadharNo"+" and i.aadharNO=?1")
	public Member getMemberId(long aadharNo);
		

}

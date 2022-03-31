package com.cg.eis.vaccination.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.eis.vaccination.dto.MemberDto;
import com.cg.eis.vaccination.entities.Member;
import com.cg.eis.vaccination.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
@Autowired
MemberService memServ;
@PostMapping
public ResponseEntity<String> addMember(@RequestBody MemberDto member)
{
	Member mem=memServ.addMember(member);
	return new ResponseEntity<String>("added successfully",HttpStatus.OK);
}
@PutMapping
public ResponseEntity<Member> updateMember(@RequestBody MemberDto member)
{
	Member mem=memServ.updateMember(member);
	return new ResponseEntity<Member>(mem,HttpStatus.OK);
}
@DeleteMapping
public ResponseEntity<String> deleteMember(MemberDto member)
{
	String status=memServ.deleteMember(member);
	return new ResponseEntity<String>(status,HttpStatus.OK);
}
//
//@GetMapping("/{adharno}")
//public ResponseEntity<Member> getMemberByAdharNo(@PathVariable long adharno)
//{
//	Member mem=memServ.getMemberByAdharNo(adharno);
//	return new ResponseEntity<Member>(mem,HttpStatus.OK);
//}
@GetMapping
public ResponseEntity<List<Member>> getAllMember()
{
	List<Member> mem=memServ.getAllMember();
	return new ResponseEntity<List<Member>>(mem,HttpStatus.OK);
}
@GetMapping("/memberid/{number}")
public ResponseEntity<Member> getMemberById(@PathVariable long number)
{
	Member mem=memServ.getMemberById(number);
	return new ResponseEntity<Member>(mem,HttpStatus.OK);
}

}

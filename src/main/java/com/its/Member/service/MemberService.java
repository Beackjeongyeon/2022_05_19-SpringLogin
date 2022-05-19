package com.its.Member.service;

import com.its.Member.DTO.MemberDTO;
import com.its.Member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
@Autowired
private MemberRepository memberRepository;
    public boolean save1(MemberDTO memberDTO) {
        System.out.println("MemberService.save1");
        System.out.println("memberDTO = " + memberDTO);
        int saveResult = memberRepository.save1(memberDTO);
        return true;


    }

    public MemberDTO login(MemberDTO memberDTO) {
        return memberRepository.login1(memberDTO);


    }
}

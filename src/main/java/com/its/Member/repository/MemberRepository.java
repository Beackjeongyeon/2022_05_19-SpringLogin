package com.its.Member.repository;

import com.its.Member.DTO.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MemberRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int save1(MemberDTO memberDTO) {
        System.out.println("MemberRepository.save1");
        System.out.println("memberDTO = " + memberDTO);
        return sql.insert("Member.save1",memberDTO);
    }


    public MemberDTO login1(MemberDTO memberDTO) {
        return sql.selectOne("Member.login1",memberDTO);
    }
}

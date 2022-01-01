package com.inzent.spr.repository;

import com.inzent.spr.domain.EnMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testSave(){
        EnMember member = new EnMember();
        member.setMemberId(1);
        member.setMemberName("aaa");
        memberRepository.save(member);


    }

}
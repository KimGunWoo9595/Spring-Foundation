package com.hello.core.Member;

import com.hello.core.AppConfig;
import com.hello.core.member.Grade;
import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import com.hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceTest {
    
    
    MemberService memberService;
    @BeforeEach
           public void beforEach (){
         AppConfig appConfig = new AppConfig();
         memberService = appConfig.memberService();
    }
    @Test
    void join(){
        Member member = new Member(1L,"memberA", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        Assertions.assertThat(member).isEqualTo(findMember);//////////

    }
}

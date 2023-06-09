package jpaark.jpacafe.service;

import jpaark.jpacafe.domain.Cafe;
import jpaark.jpacafe.domain.Member;
import jpaark.jpacafe.domain.Users;
import jpaark.jpacafe.repository.CafeRepository;
import jpaark.jpacafe.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Fail.fail;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    CafeRepository cafeRepository;
    @Autowired
    UserService userService;

    @Test(expected = IllegalStateException.class)
    public void 중복닉네임_예외() throws Exception {
        // given
        Users user1 = new Users();
        user1.setId("asdf");

        Users user2 = new Users();
        user2.setId("asdf");

        userService.join(user1);
        userService.join(user2);

        // when & then
        fail("예외가 발생해야 한다.");
    }


    @Test
    public void 카페_전체멤버_찾기()  throws Exception {
        // Given
        Cafe cafe = new Cafe();
        cafe.setName("정통");
        cafeRepository.save(cafe); // Cafe 저장

        Member member1 = new Member();
        member1.setNickname("aaa");
        member1.setCafe(cafe);

        Member member2 = new Member();
        member2.setNickname("bbb");
        member2.setCafe(cafe);

        memberService.join(member1);
        memberService.join(member2);

        // When
        List<Member> actualMembers = memberService.findAll(cafe.getId());

        // Then
        assertEquals(2, actualMembers.size());
    }
}
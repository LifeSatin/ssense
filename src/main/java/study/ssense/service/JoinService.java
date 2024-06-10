package study.ssense.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import study.ssense.dto.JoinDTO;
import study.ssense.entity.member.Member;
import study.ssense.repository.MemberRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void join(JoinDTO joinDTO) {
        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();

        log.info(username);
        log.info(password);

        if (memberRepository.existsByUsername(username)) {
            return;
        }

        Member member = Member.createJoinMember(username, bCryptPasswordEncoder.encode(password));

        memberRepository.save(member);
    }
}

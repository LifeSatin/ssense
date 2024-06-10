package study.ssense.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.ssense.dto.JoinDTO;
import study.ssense.service.JoinService;

@RestController
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String join(JoinDTO joinDTO) {
        joinService.join(joinDTO);
        return "ok";
    }
}

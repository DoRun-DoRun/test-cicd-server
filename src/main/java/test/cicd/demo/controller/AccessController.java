package test.cicd.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "접근 확인")
@RequiredArgsConstructor
@RestController
@RequestMapping
public class AccessController {
    @Operation(summary = "접속 테스트")
    @GetMapping("/access-test")
    public String access() {
        return "SUCCESS ACCESS TEST";
    }
}

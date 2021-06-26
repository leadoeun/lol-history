package org.study.lolhistory.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.lolhistory.domain.Hello;
import org.study.lolhistory.service.HelloService;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/api/hello")
    public Hello hello(){
        return helloService.getHello();
    }
}

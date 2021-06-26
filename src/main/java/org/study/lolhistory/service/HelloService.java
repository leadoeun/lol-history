package org.study.lolhistory.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.lolhistory.domain.Hello;
import org.study.lolhistory.domain.HelloRepository;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class HelloService {
    private final HelloRepository helloRepository;

    @Transactional
    public Hello getHello(){
        Hello hello = new Hello("practice");
        helloRepository.save(hello);
        return hello;
    }
}

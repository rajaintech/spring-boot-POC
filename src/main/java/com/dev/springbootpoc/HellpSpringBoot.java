package com.dev.springbootpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellpSpringBoot {

    @GetMapping("/")
    public String printHelloSpring(){
        return "Hello from programmer 2.0";

    }
}

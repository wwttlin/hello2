package com.example.hello2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @GetMapping("/hello2")
    public String hello2() {
        return "Spring Boot Hello2";
    }
}

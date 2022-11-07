package com.docker.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {

    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }

}

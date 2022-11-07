package com.docker2.docker2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/products")
    public String getMessage() {
        return "A brand new product";
    }
}

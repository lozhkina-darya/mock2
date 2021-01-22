package com.mock.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/dao")
    public String test() {
        return "Ok";
    }
}

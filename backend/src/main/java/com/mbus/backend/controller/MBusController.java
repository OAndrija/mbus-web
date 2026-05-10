package com.mbus.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MBusController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World";
    }
}

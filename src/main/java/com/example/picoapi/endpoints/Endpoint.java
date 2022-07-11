package com.example.picoapi.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @GetMapping("/")
    String simpleResponse() {
        return ("Hello pico w");
    }

    @PostMapping("/")
    String simplePost(@RequestBody String string) {
        System.out.println(string);
        return ("Message Received");
    }

}

package com.example.picoapi.endpoints;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.Instant;

@RestController
public class Endpoint {

    @GetMapping("/status")
    String statusCheck() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        System.out.println("Client status request from IP: " + request.getRemoteAddr());
        return ("[API] Communication Link Active");
    }

    @PostMapping("/")
    String simplePost(@RequestBody String string) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        System.out.println("[" + request.getRemoteAddr() + "] " + string);
        return ("[API] Message Received Timestamp: " + String.valueOf(Instant.now().getEpochSecond()));
    }

}

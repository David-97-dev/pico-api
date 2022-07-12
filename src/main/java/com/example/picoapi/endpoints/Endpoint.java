package com.example.picoapi.endpoints;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class Endpoint {

    List<String> list = new ArrayList<>();

    Logger logger = Logger.getLogger(Endpoint.class.getName());

    @GetMapping("/status")
    String statusCheck() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        logger.info("Client status request from IP: " + request.getRemoteAddr());
        return ("[API] Communication Link Active");
    }

    @GetMapping("/getall")
    String getAll() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        logger.info("Get all request from IP: " + request.getRemoteAddr());
        return list.toString();
    }

    @PostMapping("/")
    String simplePost(@RequestBody String string) {
        list.add(string);
        UUID id = UUID.randomUUID();
        logger.info("Message Received UUID:" + id);
        return ("[API] Message Received UUID: " + id);
    }

}

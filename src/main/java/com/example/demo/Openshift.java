package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/openshift")
public class Openshift {

    @GetMapping
    public String get(@RequestBody String request, @RequestHeader HashMap<String, String> header) {
        return header.getOrDefault("host", "localhost") + ":" + request;
    }
}

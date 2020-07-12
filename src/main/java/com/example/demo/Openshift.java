package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("")
public class Openshift {

    @GetMapping
    public String get(@RequestBody String request, @RequestHeader HashMap<String, String> header) {
        return "Hey, this is my first build from github";
    }
}

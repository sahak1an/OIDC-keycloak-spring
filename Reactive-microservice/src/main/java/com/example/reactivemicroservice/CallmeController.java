package com.example.reactivemicroservice;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallmeController {

    @GetMapping("/callme2")
    public String ping(Principal principal) {
        return "Reactive Microservice, Principal name -" + principal.getName();
    }
}
package com.example.microservice1;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallmeController {

    @GetMapping("/callme1")
    public String ping(Principal principal) {
        return "Blocking Microservice, Principal name -" + principal.getName();
    }
}
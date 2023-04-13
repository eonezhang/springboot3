package com.eonezhang.springboot3.security.controller;

import com.eonezhang.springboot3.security.config.WelcomeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WelcomeController {
    private final WelcomeClient welcomeClient;


    @GetMapping("/")
    public String welcome(Authentication authentication) {
//        String welcome = welcomeClient.getWelcome();
        String welcome = authentication.getName();
        return "<h1>" + welcome + "</h1>";
    }
}

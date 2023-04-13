package com.eonezhang.springboot3.security.controller;

import com.eonezhang.springboot3.security.config.WelcomeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WelcomeController {
    private final WelcomeClient welcomeClient;


    public String welcome() {
        String welcome = welcomeClient.getWelcome();
        return "<h1>" + welcome + "</h1>";
    }
}

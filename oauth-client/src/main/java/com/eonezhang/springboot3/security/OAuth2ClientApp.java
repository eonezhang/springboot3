package com.eonezhang.springboot3.security;

import com.eonezhang.springboot3.security.init.EnvInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OAuth2ClientApp {
    public static void main(String[] args) {
        new EnvInit().loadSystemEnv();
        SpringApplication.run(OAuth2ClientApp.class, args);
    }
}

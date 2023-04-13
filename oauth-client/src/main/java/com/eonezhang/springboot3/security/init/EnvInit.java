package com.eonezhang.springboot3.security.init;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.util.Properties;

public class EnvInit {

    @SneakyThrows
    public void loadSystemEnv() {
        InputStream resourceAsStream = EnvInit.class.getResourceAsStream("/.env");
        Properties props = new Properties();
        props.load(resourceAsStream);
        props.entrySet().forEach(entry -> {
            System.setProperty((String)entry.getKey(), (String) entry.getValue());
        });
    }
}

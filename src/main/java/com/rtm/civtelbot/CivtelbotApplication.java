package com.rtm.civtelbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class CivtelbotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(CivtelbotApplication.class, args);
    }

}
